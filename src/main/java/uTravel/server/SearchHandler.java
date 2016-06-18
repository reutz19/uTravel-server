package uTravel.server;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.xml.bind.DatatypeConverter;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import io.swagger.client.ApiException;
import io.swagger.client.api.DefaultApi;
import io.swagger.client.model.ExtensiveTrainSearchResponse;
import io.swagger.client.model.ExtensiveTrainSearchResult;
import io.swagger.client.model.FlightSearchBound;
import io.swagger.client.model.FlightSearchItinerary;
import io.swagger.client.model.FlightSearchPrice;
import io.swagger.client.model.LowFareSearchResponse;
import io.swagger.client.model.LowFareSearchResult;
import io.swagger.client.model.TrainSearchPricing;

import uTravel.server.UtravelHttpServer.HandleResponse;
import uTravel.server.resultModel.*;

// Page : /utravel/search
// Handles requests for route search 
public class SearchHandler implements HttpHandler 
{
	//private ApiClient apiClient;
	private DefaultApi defaultApi;
	private String apikey = "HxFuLvQvqTwq4yaQyIujIC5ian5taKhR";
	private final int MAX_RESULTS = 5;
	
	public SearchHandler(){
		//apiClient = Configuration.getDefaultApiClient();
		defaultApi = new DefaultApi();
	}

	public void handle(HttpExchange httpExchange) throws IOException 
	{
		Map <String,String> parms = 
				UtravelHttpServer.queryToMap(httpExchange.getRequestURI().getQuery());

		ParseResponse(parms, httpExchange);
	}

	private void ParseResponse(Map<String, String> parms, HttpExchange httpExchange) 
	{
		try {
			// verify the required parameter 'origin' is set
			String origin = parms.get("origin");
			if (origin == null) {
				UtravelHttpServer.ErrorResponse(httpExchange, "Missing the required parameter 'origin' when calling flightAffiliateSearch");
				return;
			}
	
			// verify the required parameter 'destination' is set
			String destination = parms.get("destination");
			if (destination == null) {
				UtravelHttpServer.ErrorResponse(httpExchange, "Missing the required parameter 'destination' when calling flightAffiliateSearch");
				return;
			}
	
			// verify the required parameter 'departureDate' is set
			String departureDate = parms.get("departure_date");
			if (departureDate == null) {
				UtravelHttpServer.ErrorResponse(httpExchange, "Missing the required parameter 'departure_date' when calling flightAffiliateSearch");
				return;
			}
	
			// verify the required parameter 'departureDate' is set
			String returnDate = parms.get("return_date");
			if (returnDate == null) {
				UtravelHttpServer.ErrorResponse(httpExchange, "Missing the required parameter 'return_date' when calling flightAffiliateSearch");
				return;
			}
			
			// search for flights 
			LowFareSearchResponse flightRes = 
					defaultApi.flightLowFareSearch(
							apikey,  			// API key 
							origin,  			// origin 
							destination,  		// destination 
							departureDate,  	// departure date
							returnDate,  		// return date  
							null,  				// time of arrival - depart flight
							null,  				// time of arrival - return flight 				
							1,  				// adult  number - above 12
							0,  				// child  number - age 2-12 
							0,  				// infant number - age 0-2
							null,  				// included airlines
							null,  				// excluded airlines
							false,  			// one-way? 
							10000, 				// flight max price
							"EUR", 				// currency
							"ECONOMY", 			// travel class 		
							MAX_RESULTS); 		// max result number		
			
			//get flight routes
			List<LowFareSearchResult> flightResList = flightRes.getResults();			
			List<MixSearchResult> mixResultList = new ArrayList<MixSearchResult>();
			
			// improve flight search by mixing with trains
			for (LowFareSearchResult f : flightResList) 
			{
				FlightSearchPrice fare = f.getFare();
				//go over all proposed itineraries and try to improve them
				for (FlightSearchItinerary it : f.getItineraries()) 
				{
					//each itinerary become it's own result
					List<MixSearchResult> bestItinararyResults = bestIterneraries(it, fare);
					mixResultList.addAll(bestItinararyResults);
				}
			}
			System.out.println("got here");
			// search for trains 
			ExtensiveTrainSearchResponse railRes = 
					defaultApi.trainExtensiveSearch(
							apikey,  			// API key 
							origin,  			// origin 
							destination,  		// destination 
							departureDate);  	// departure date
			
			List<ExtensiveTrainSearchResult> railResList = railRes.getResults();
			
			HandleResponse.SendSearchResponse(flightResList, railResList, httpExchange);
			//System.out.println(resList.get(0).toString());
		}
		catch (Exception ex){
			System.out.println(ex.getMessage() + "\n");
			ex.printStackTrace();
		}
	}
	
	/** take an itineraries of a specific FlightSearchResult and find it best alternatives for each given itinerary
	/*  for each single itinerary return as a new MixSearchResult (equal to FlightSearchResult) 
	 * @param itinerary 
	 * @param fare 		
	 * @throws Exception **/
	private List<MixSearchResult> bestIterneraries(FlightSearchItinerary itinerary, FlightSearchPrice fare) throws Exception
	{
		MixSearchPrice totalPrice = new MixSearchPrice();
		MixSearchItinerary mixIti = new MixSearchItinerary();
		
		totalPrice.setTotalPrice(fare.getTotalPrice());
		
		//for each in/out bound route - improve route by looking for a mix one
		mixIti.setOutbound(bestBoundRouth(itinerary.getOutbound(), totalPrice));
		mixIti.setInbound(bestBoundRouth(itinerary.getInbound(), totalPrice));
		
		MixSearchResult res = new MixSearchResult();
		List<MixSearchItinerary> itiList = new ArrayList<MixSearchItinerary>();
		itiList.add(mixIti);
		
		res.setItineraries(itiList);
		res.setFare(totalPrice);
		
		//each itinerary list is now a single itinerary
		List<MixSearchResult> itiRes = new ArrayList<MixSearchResult>();
		itiRes.add(res);
		
		return itiRes;
	}
	
	private MixSearchBound bestBoundRouth(FlightSearchBound itineraryBound, MixSearchPrice totalPrice) throws Exception
	{
		List<io.swagger.client.model.FlightSearchSegment> allf = itineraryBound.getFlights();
		
		double originDuration = allf.size() > 0 ? getDurationTime(allf.get(0).getDepartsAt(),  allf.get(allf.size() - 1).getArrivesAt()) : 0;
		double originTotal = Double.parseDouble(totalPrice.getTotalPrice());
		
		//avg score is a score we give each bound its an average between the price and the duration time
		//it's purpose is to assess the value of a bound against other bounds 
		//double originAvgScore = originDuration + originTotal;
		double minAvgScore = originDuration + originTotal;
		double minDuration = originDuration;
		double minPrice = originTotal;
		
		List<MixSearchSegment> mixSegments = new ArrayList<MixSearchSegment>();
		
		// go over all flights and try to switch with train raids
		for (io.swagger.client.model.FlightSearchSegment flight : allf)
		{
			//get single flight duration and time
			FlightSearchSegment f = new FlightSearchSegment(flight);
			double currDuration = getflightDuration(flight);
			double currPrice = getflightprice(originTotal, allf.size());
			
			// get nearest train stations from given airports
			List<String> originRailLst = getNearestTrainSt(f.getOrigin().getAirport());
			List<String> destRailLst = getNearestTrainSt(f.getDestination().getAirport());
			
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
			Date ariveAt = df.parse(f.getArrivesAt());
			TrainSearchSegment bestTrain = getBestTrinRide(originRailLst, destRailLst, ariveAt);
			double currTDuration = getTrainRaidDuration(bestTrain);
			double currTPrice = getTrainCheapestRaid(bestTrain.getPrices());
			double currAvgScore = minAvgScore - (currDuration + currPrice) + (currTDuration + currTPrice);
			if (currAvgScore < minAvgScore){
				minAvgScore = currAvgScore;
				mixSegments.add(bestTrain);
				minDuration = minDuration - currDuration + currTDuration;
				minPrice = minPrice - currPrice + currTPrice; 
			}
			else
				mixSegments.add(f);
		}
		
		MixSearchBound resBound = new MixSearchBound();
		resBound.setSegments(mixSegments);
		resBound.setDuration(String.valueOf(minDuration));
		totalPrice.setTotalPrice(String.valueOf(minPrice));
		return resBound; 
	}
	
	// -------- Handle durations -------------
	private long getDurationTime(String depart, String arrive) throws Exception {
		
		if (depart.isEmpty() || arrive.isEmpty())
			throw new Exception("couldn't get duration time! ");
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
		long duration = df.parse(arrive).getTime() - df.parse(depart).getTime();
		return TimeUnit.MILLISECONDS.toMinutes(duration);
	}
	
	private double getflightDuration(io.swagger.client.model.FlightSearchSegment flight) throws Exception {
		return getDurationTime(flight.getDepartsAt(), flight.getArrivesAt());
	}
	
	private double getTrainRaidDuration(TrainSearchSegment train) throws Exception{
		return getDurationTime(train.getDepartsAt(), train.getArrivesAt());
	}
	
	
	// ------------- Handle prices ------------
	// return single flight price from within route price
	private double getflightprice(double totalPrice, int count){
		return totalPrice / count;
	}
	
	private double getTrainCheapestRaid(List<TrainSearchPricing> prices) {
		double minTicketAmount = Double.MAX_VALUE;
		for (TrainSearchPricing p : prices){
			double currPrice = Double.parseDouble(p.getTotalPrice().getAmount());
			if (currPrice < minTicketAmount)
				minTicketAmount = currPrice;
		}
		return minTicketAmount;
	}
	
	public List<String> getNearestTrainSt(String airport){
		//return Arrays.asList("8399003"/*Florence*/, "8308409"/*Rome*/);
		return DButil.getNearestTrains(airport);
	}
	
	private TrainSearchSegment getBestTrinRide(List<String> originRailLst, List<String> destRailLst,
			Date ariveAt) throws Exception 
	{		
		TrainSearchSegment bestRail = null;
		double bestAvg = Double.MAX_VALUE;
		for (String o : originRailLst)
		{
			for (String d : destRailLst)
			{
				TrainSearchSegment currRail = getTrainTrip(o, d, ariveAt.toString());
				double currDuration = getTrainRaidDuration(currRail);
				double currPrice = getTrainCheapestRaid(currRail.getPrices());
				double currAvg = currDuration + currPrice;
				if (currAvg < bestAvg) {
					bestAvg = currAvg;
					bestRail = currRail;
				}
			}
		}
		return bestRail;		
	}

	private TrainSearchSegment getTrainTrip(String originRStationId, String destRStationId, String departureDate) throws ApiException 
	{
		// search for trains 
		ExtensiveTrainSearchResponse railRes = 
				defaultApi.trainExtensiveSearch(
						apikey,  			// API key 
						originRStationId,   // origin 
						destRStationId,  	// destination 
						departureDate);  	// departure date
		
		List<ExtensiveTrainSearchResult> railResList = railRes.getResults();		
		if (railResList.isEmpty())		
			return null;
		else {
			return new TrainSearchSegment(railResList.get(0).getItineraries().get(0).getTrains().get(0));
			//TODO: need to choose the right train by time and not just a RANDON ONE
		}
	}
	
	/*
	private MixSearchBound buildMixSearchBound(HashMap<Integer, FlightSearchSegment> flights, HashMap<Integer, TrainSearchSegment> trains, int duration, int totalPrice) throws Exception{
		
		int segmentsCount = flights.size() + flights.size();
		MixSearchBound bound = new MixSearchBound();
		//int duration = 0;
		//build an itinerary combine from flights and trains
		for (int i = 0; i < segmentsCount; i++) 
		{			
			FlightSearchSegment f = flights.get(i);
			TrainSearchSegment tr = trains.get(i);
			
			if ((f == null && tr == null) || (f != null && tr != null))
				throw new Exception("failur in building MixSearchBound");
			else if (f != null){
				bound.addSegment(f);
			} 
			else if (tr != null){
				bound.addSegment(tr);
			}
			//accumulate duration properly - write a function that calculate (instead of duration++)
			duration++;
		}
		
		bound.setDuration(String.valueOf(duration));
		return bound;
	}
	
	private void ParseResponse1(Map<String, String> parms, HttpExchange httpExchange) 
	{	
		try {
			// verify the required parameter 'origin' is set
			String origin = parms.get("origin");
			if (origin == null) {
				UtravelHttpServer.ErrorResponse(httpExchange, "Missing the required parameter 'origin' when calling flightAffiliateSearch");
				return;
			}
	
			// verify the required parameter 'destination' is set
			String destination = parms.get("destination");
			if (destination == null) {
				UtravelHttpServer.ErrorResponse(httpExchange, "Missing the required parameter 'destination' when calling flightAffiliateSearch");
				return;
			}
	
			// verify the required parameter 'departureDate' is set
			String departureDate = parms.get("departure_date");
			if (departureDate == null) {
				UtravelHttpServer.ErrorResponse(httpExchange, "Missing the required parameter 'departure_date' when calling flightAffiliateSearch");
				return;
			}
	
			// verify the required parameter 'departureDate' is set
			String returnDate = parms.get("return_date");
			if (returnDate == null) {
				UtravelHttpServer.ErrorResponse(httpExchange, "Missing the required parameter 'return_date' when calling flightAffiliateSearch");
				return;
			}
			
		    // prepare parameters for invoke
			 String path = "/flights/low-fare-search".replaceAll("\\{format\\}","json");
		    Map<String, String> headerParams = new HashMap<String, String>();
		    Map<String, Object> formParams = new HashMap<String, Object>();
		    
		    List<Pair> queryParams = getParams(origin, destination, departureDate, returnDate);
			final String[] accepts = {"application/json"};
			final String accept = apiClient.selectHeaderAccept(accepts);
			final String[] contentTypes = {};
			final String contentType = apiClient.selectHeaderContentType(contentTypes);
			String[] authNames = new String[] {};
			TypeRef<List<AirportInformation>> returnType = new TypeRef<List<AirportInformation>>(){};
			
			String result = apiClient.invokeAPI(path, "GET", queryParams, null, null, headerParams, formParams, accept, contentType, authNames, returnType);
			System.out.println("The request result is: \n" + result);
		}
		catch (Exception ex){
			System.out.println(ex.getMessage() + "\n");
			ex.printStackTrace();
		}
	}
	
	//extract relevant parameters
	private List<Pair> getParams(String org, String dest, String dep_dt, String ret_dt)
	{							
		List<Pair> queryParams = new ArrayList<Pair>();
		
		queryParams.addAll(apiClient.parameterToPairs("", "apikey", "Qf1ykk1SmZBQzgf2f6OJrwDAPHdnNIuk"));
		queryParams.addAll(apiClient.parameterToPairs("", "origin", org));    
		queryParams.addAll(apiClient.parameterToPairs("", "destination", dest));	    
		queryParams.addAll(apiClient.parameterToPairs("", "departure_date", dep_dt));	
		queryParams.addAll(apiClient.parameterToPairs("", "return_date", ret_dt));

		return queryParams;
	}
	
	//return the duration as number of minutes
	private double DurationToNum(String strDuration){
		int duration = -1;
		if (!strDuration.isEmpty() && strDuration.contains(":")){
			String[] sp = strDuration.split(":");
			if (sp.length == 2){
				int hours = Integer.parseInt(sp[0]);
				int minutes = Integer.parseInt(sp[1]);
				duration = (60 * hours) + minutes;
			}
		}
		return duration;
	}
	
	*/
}