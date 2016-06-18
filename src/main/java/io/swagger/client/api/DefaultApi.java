package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.AirportAutocompleteResponse;
import io.swagger.client.model.Error;
import io.swagger.client.model.AirportInformation;
import io.swagger.client.model.CarSearchResponse;
import java.math.BigDecimal;
import io.swagger.client.model.AffiliateSearchResponse;
import io.swagger.client.model.ExtremeSearchResponse;
import io.swagger.client.model.LowFareSearchResponse;
import io.swagger.client.model.HotelSearchResponse;
import io.swagger.client.model.HotelPropertyResponse;
import io.swagger.client.model.LocationResponse;
import io.swagger.client.model.RailStationResponse;
import io.swagger.client.model.RailStationAutocompleteResponse;
import io.swagger.client.model.ExtensiveTrainSearchResponse;
import io.swagger.client.model.TrainScheduleSearchResponse;
import io.swagger.client.model.AirlineAutocompleteResponse;
import io.swagger.client.model.FlightTrafficSearchResponse;
import io.swagger.client.model.TopDestinationsSearchResponse;
import io.swagger.client.model.TopSearchesSearchResponse;
import io.swagger.client.model.TravelRecordResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-13T15:09:46.339Z")
public class DefaultApi {
  private ApiClient apiClient;

  public DefaultApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DefaultApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * The Airport Autocomplete API provides a simple means to find an IATA location code for flight search based on a city or airport name. The API is fully JQuery-Autocomplete compatible to enable you to quickly build a drop-down list for your users to find the right airport easily.
   * Given the start of any word in an airport&#39;s official name, a city name, or the start of an IATA code, this API provides the full name and IATA location code of the city or airport, for use in flight searches. Only major cities and civilian airports with several commercial flights per week are included by default. The response provides up to 20 possible matches, sorted by importance, in a [JQuery UI Autocomplete](http://jqueryui.com/autocomplete/) compatible format. [This sample implementation](https://github.com/amadeus-travel-innovation-sandbox/sandbox-content/blob/master/airport-autocomplete-template.html) using JQuery UI may help. This API uses data from the OpenTravelData project, see [optd_por_public.csv](https://raw.githubusercontent.com/opentraveldata/opentraveldata/master/opentraveldata/optd_por_public.csv).\n\nThe value returned is the IATA location code. The label returned is always in UTF-8 format, with the airport official name (which is often in the native language), in the format of English City Name (if not already included in the airport name).
   * @param apikey API Key provided for your account, to identify you for API access
   * @param term Search term that should represent some part of a city or airport name.
   * @return AirportAutocompleteResponse
   */
  public AirportAutocompleteResponse airportAutocomplete (String apikey, String term) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apikey' is set
     if (apikey == null) {
        throw new ApiException(400, "Missing the required parameter 'apikey' when calling airportAutocomplete");
     }
     
     // verify the required parameter 'term' is set
     if (term == null) {
        throw new ApiException(400, "Missing the required parameter 'term' when calling airportAutocomplete");
     }
     
    // create path and map variables
    String path = "/airports/autocomplete".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "apikey", apikey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "term", term));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<AirportAutocompleteResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * The Nearest Relevant Airport can find the most useful nearby airport to a given location.
   * This service gives the most relevant airports in a radius of 500 km around the given coordinates. The relevance of an airport is computed by dividing the number of airport movements (take offs and landings) by the distance from the point. This causes the relevance of an airport to increase exponentially as you approach it.\n\nTo minimize response time, all distances are computed as a [great-circle distance](http://en.wikipedia.org/wiki/Great-circle_distance) from the provided coordinates to the airport coordinates, and thus do not take into account traffic conditions, international boundaries, mountains, water, or other elements that might make the a nearby airport hard to reach.\n\nOnly civilian airports with at least several commercial flights per week are included in the results.\n\nThe result is a list of airports sorted by decreasing relevance. It always contains the nearest airport with significant commercial traffic.
   * @param apikey API Key provided for your account, to identify you for API access
   * @param latitude Latitude location to be at the center of your search circle.
   * @param longitude Longitude location to be at the center of your search circle.
   * @return List<AirportInformation>
   */
  public List<AirportInformation> nearestRelevantAirport (String apikey, String latitude, String longitude) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apikey' is set
     if (apikey == null) {
        throw new ApiException(400, "Missing the required parameter 'apikey' when calling nearestRelevantAirport");
     }
     
     // verify the required parameter 'latitude' is set
     if (latitude == null) {
        throw new ApiException(400, "Missing the required parameter 'latitude' when calling nearestRelevantAirport");
     }
     
     // verify the required parameter 'longitude' is set
     if (longitude == null) {
        throw new ApiException(400, "Missing the required parameter 'longitude' when calling nearestRelevantAirport");
     }
     
    // create path and map variables
    String path = "/airports/nearest-relevant".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "apikey", apikey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "latitude", latitude));
    
    queryParams.addAll(apiClient.parameterToPairs("", "longitude", longitude));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<List<AirportInformation>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * The Car Rental API uses Amadeus&#39; classic car service to locate the best available car. Define a circular area with one coordinate and radius, or provide an airport code, as well as the pick-up and drop-off dates, and get a list of car rental providers with their locations and rates. Optional parameters such as currency and rental provider codes are also available and can be used to narrow down the results. This API is an ideal pairing with the flight and hotel search to provide ground transportation options at the destination.
   * With this API you can find out the price and type of car, for all car rental providers, near a specified airport.\n\nYou can quickly see the locations of car providers near a given airport, and what cars are available to rent, and at what prices. This API is based on our classic car pricing service that gets live availability from car providers, and is used to power a variety of airline and travel agency websites.\n           \nResults are validated from car providers, and thus response times may take up to 10 seconds (response times are typically about 5s), and the number of concurrent calls is throttled per user to avoid flooding our provider&#39;s systems. However, this means the final result is guaranteed to be live and accurate.\n\nThe configuration of this API allows search for car rentals in the rental location where the car is picked up (at the start of the rental), is the same as the one where it will be dropped off.
   * @param apikey API Key provided for your account, to identify you for API access
   * @param location The IATA code of the airport at which the car will be rented.
   * @param pickUp Date on which the car rental will be collected from the car rental location. If no time is provided, a default value of 09:00 is used. Past availability is not displayed, future availability becomes less useful from about 6 months from the current date.
   * @param dropOff Date at which the car rental will end and the car will be returned to the rental location. If no time is provided, a default value of 17:00 is used.
   * @param lang The preferred language of the content related to each car rental. Content will be returned in this language if available.
   * @param currency The preferred currency to use when displaying prices and rates related to the car rental.
   * @param provider 2 character car rental provider code. You may provide this parameter more than once.
   * @param rateClass Allows to request specific rate types.
   * @param ratePlan Qualifies the rate depending on the pickup date and the rental duration.
   * @param vehicle Specifies the type of vehicle to be rented. If selected, the results set will include only vehicles that match these type descriptions. The enumerations above correspond to ACRISS Pseudo Codes, and you may also provide an ACRISS pseudo code directly. If specifying a vehicle-specific ACRISS code, you may provide this parameter up to 3 times.
   * @return CarSearchResponse
   */
  public CarSearchResponse carRentalAirportSearch (String apikey, String location, String pickUp, String dropOff, String lang, String currency, String provider, String rateClass, String ratePlan, String vehicle) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apikey' is set
     if (apikey == null) {
        throw new ApiException(400, "Missing the required parameter 'apikey' when calling carRentalAirportSearch");
     }
     
     // verify the required parameter 'location' is set
     if (location == null) {
        throw new ApiException(400, "Missing the required parameter 'location' when calling carRentalAirportSearch");
     }
     
     // verify the required parameter 'pickUp' is set
     if (pickUp == null) {
        throw new ApiException(400, "Missing the required parameter 'pickUp' when calling carRentalAirportSearch");
     }
     
     // verify the required parameter 'dropOff' is set
     if (dropOff == null) {
        throw new ApiException(400, "Missing the required parameter 'dropOff' when calling carRentalAirportSearch");
     }
     
    // create path and map variables
    String path = "/cars/search-airport".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "apikey", apikey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "location", location));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pick_up", pickUp));
    
    queryParams.addAll(apiClient.parameterToPairs("", "drop_off", dropOff));
    
    queryParams.addAll(apiClient.parameterToPairs("", "lang", lang));
    
    queryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "provider", provider));
    
    queryParams.addAll(apiClient.parameterToPairs("", "rate_class", rateClass));
    
    queryParams.addAll(apiClient.parameterToPairs("", "rate_plan", ratePlan));
    
    queryParams.addAll(apiClient.parameterToPairs("", "vehicle", vehicle));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<CarSearchResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * The Car Rental API uses Amadeus&#39; classic car service to locate the best available car. Define a circular area with one coordinate and radius, or provide an airport code, as well as the pick-up and drop-off dates, and get a list of car rental providers with their locations and rates. Optional parameters such as currency and rental provider codes are also available and can be used to narrow down the results. This API is an ideal pairing with the flight and hotel search to provide ground transportation options at the destination.
   * With this API you can find out the price and type of car, for all car rental providers, in a specified geographical location.\n\nYou can quickly see the locations of car providers near a given point, and what cars are available to rent, and at what prices. This API is based on our classic car pricing service that gets live availability from car providers, and is used to power a variety of airline and travel agency websites.\n           \nResults are validated from car providers, and thus response times may take up to 10 seconds (response times are typically about 5s), and the number of concurrent calls is throttled per user to avoid flooding our provider&#39;s systems. However, this means the final result is guaranteed to be live and accurate.\n\nThe configuration of this API allows search for car rentals in the rental location where the car is picked up (at the start of the rental), is the same as the one where it will be dropped off.
   * @param apikey API Key provided for your account, to identify you for API access
   * @param latitude Latitude of the center of the search.
   * @param longitude Longitude of the center of the search.
   * @param radius Radius around the center to look for hotels in kilometers (km).
   * @param pickUp Date on which the car rental will be collected from the car rental location. If no time is provided, a default value of 09:00 is used. Past availability is not displayed, future availability becomes less useful from about 6 months from the current date.
   * @param dropOff Date at which the car rental will end and the car will be returned to the rental location. If no time is provided, a default value of 17:00 is used.
   * @param lang The preferred language of the content related to each car rental. Content will be returned in this language if available.
   * @param currency The preferred currency to use when displaying prices and rates related to the car rental.
   * @param provider 2 character car rental provider code. You may provide this parameter more than once.
   * @param rateClass Allows to request specific rate types.
   * @param ratePlan Qualifies the rate depending on the pickup date and the rental duration.
   * @param vehicle Specifies the type of vehicle to be rented. If selected, the results set will include only vehicles that match these type descriptions. The enumerations above correspond to ACRISS Pseudo Codes, and you may also provide an ACRISS pseudo code directly. If specifying a vehicle-specific ACRISS code, you may provide this parameter up to 3 times.
   * @return CarSearchResponse
   */
  public CarSearchResponse carRentalGeosearch (String apikey, BigDecimal latitude, BigDecimal longitude, Integer radius, String pickUp, String dropOff, String lang, String currency, String provider, String rateClass, String ratePlan, String vehicle) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apikey' is set
     if (apikey == null) {
        throw new ApiException(400, "Missing the required parameter 'apikey' when calling carRentalGeosearch");
     }
     
     // verify the required parameter 'latitude' is set
     if (latitude == null) {
        throw new ApiException(400, "Missing the required parameter 'latitude' when calling carRentalGeosearch");
     }
     
     // verify the required parameter 'longitude' is set
     if (longitude == null) {
        throw new ApiException(400, "Missing the required parameter 'longitude' when calling carRentalGeosearch");
     }
     
     // verify the required parameter 'radius' is set
     if (radius == null) {
        throw new ApiException(400, "Missing the required parameter 'radius' when calling carRentalGeosearch");
     }
     
     // verify the required parameter 'pickUp' is set
     if (pickUp == null) {
        throw new ApiException(400, "Missing the required parameter 'pickUp' when calling carRentalGeosearch");
     }
     
     // verify the required parameter 'dropOff' is set
     if (dropOff == null) {
        throw new ApiException(400, "Missing the required parameter 'dropOff' when calling carRentalGeosearch");
     }
     
    // create path and map variables
    String path = "/cars/search-circle".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "apikey", apikey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "latitude", latitude));
    
    queryParams.addAll(apiClient.parameterToPairs("", "longitude", longitude));
    
    queryParams.addAll(apiClient.parameterToPairs("", "radius", radius));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pick_up", pickUp));
    
    queryParams.addAll(apiClient.parameterToPairs("", "drop_off", dropOff));
    
    queryParams.addAll(apiClient.parameterToPairs("", "lang", lang));
    
    queryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "provider", provider));
    
    queryParams.addAll(apiClient.parameterToPairs("", "rate_class", rateClass));
    
    queryParams.addAll(apiClient.parameterToPairs("", "rate_plan", ratePlan));
    
    queryParams.addAll(apiClient.parameterToPairs("", "vehicle", vehicle));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<CarSearchResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * The  Flight Affiliate Search API uses Travel Audience Connect&#39;s affiliate network API to search flights from our list of partners and provides deep-links to allow the user to book directly on the airline website.
   * The Flight Affiliate Search API combines our Master Pricer search technology with Travel Audience&#39;s Connect API partners to provide a flight search where all results come with a deep-link to book the flight at a partner&#39;s website. The message is composed of multiple results for given request. A result is defined by a unique combination of price, tax, passenger type, fare type, cabin, and availability for each requested segment. A result is then composed of single or multiple itineraries. Each itinerary is composed of an outbound leg, and, if a return date was specified, an inbound leg. Each leg is composed of a list of one or more flights, that the traveller will be required to take in order to get from the origin airport to the destination airport.  \n\nOnly Travel Audience Connect partner airlines are searched, so content is limited to only their partner airlines. For an up-to-date list of partner airline routes, see the route maps on their respective websites below. You can earn commission using the deep links provided in the search results if you sign up for an account at http://connect.travelaudience.com.
   * @param apikey API Key provided for your account, to identify you for API access
   * @param origin City code from which the traveler will depart. See the location and airport interfaces for more information.
   * @param destination IATA city code to which the traveler is going
   * @param departureDate The date on which the traveler will depart from the origin to go to the destination. The maximum scope for a date range is 2 days, for a larger scope, use the Extensive Search!
   * @param returnDate The date on which the traveler will depart from the destination to return to the origin. If this parameter is not specified, the search will find only one-way trips. If this, or the return_by parameter are specified, only return trips are found
   * @param adults The number of adult (age 12 and over) passengers traveling on this flight.
   * @param children The number of child (younger than age 12 on date of departure) passengers traveling on this flight who will each have their own separate seat
   * @param infants The number of infant (younger than age 2 on date of departure) passengers traveling on this flight. Infants travel in the lap of an adult passenger, and thus the number of infants must not exceed the number of adults.
   * @param includeMerchants If specified, all results will include at least one flight where one or more of these airlines is the marketing carrier
   * @param excludeMerchants If specified, no results will include any flights where any of these airlines is the marketing carrier
   * @param maxPrice Maximum price of trips to find in the result set, in USD (US dollars) unless some other currency code is specified. By default, no limit is applied
   * @param currency The preferred currency for the results
   * @param mobile Setting this to true will show mobile web deeplinks
   * @return AffiliateSearchResponse
   */
  public AffiliateSearchResponse flightAffiliateSearch (String apikey, String origin, String destination, String departureDate, String returnDate, Integer adults, Integer children, Integer infants, String includeMerchants, String excludeMerchants, Integer maxPrice, String currency, Boolean mobile) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apikey' is set
     if (apikey == null) {
        throw new ApiException(400, "Missing the required parameter 'apikey' when calling flightAffiliateSearch");
     }
     
     // verify the required parameter 'origin' is set
     if (origin == null) {
        throw new ApiException(400, "Missing the required parameter 'origin' when calling flightAffiliateSearch");
     }
     
     // verify the required parameter 'destination' is set
     if (destination == null) {
        throw new ApiException(400, "Missing the required parameter 'destination' when calling flightAffiliateSearch");
     }
     
     // verify the required parameter 'departureDate' is set
     if (departureDate == null) {
        throw new ApiException(400, "Missing the required parameter 'departureDate' when calling flightAffiliateSearch");
     }
     	
    // create path and map variables
    String path = "/flights/affiliate-search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "apikey", apikey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "origin", origin));
    
    queryParams.addAll(apiClient.parameterToPairs("", "destination", destination));
    
    queryParams.addAll(apiClient.parameterToPairs("", "departure_date", departureDate));
    
    queryParams.addAll(apiClient.parameterToPairs("", "return_date", returnDate));
    
    queryParams.addAll(apiClient.parameterToPairs("", "adults", adults));
    
    queryParams.addAll(apiClient.parameterToPairs("", "children", children));
    
    queryParams.addAll(apiClient.parameterToPairs("", "infants", infants));
    
    queryParams.addAll(apiClient.parameterToPairs("", "include_merchants", includeMerchants));
    
    queryParams.addAll(apiClient.parameterToPairs("", "exclude_merchants", excludeMerchants));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max_price", maxPrice));
    
    queryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "mobile", mobile));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<AffiliateSearchResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * The Extensive Flight Search API allows building travel searches based on very flexible and open range of dates. You can use it to answer questions such as \&quot;When is the best date to fly...\&quot;.  It&#39;s built on Amadeus&#39; Featured Results technology, which returns thousands of results (prices, itineraries and dates) in a matter of milliseconds. Results are available over half a calendar year with a 1 to 15 day stay duration
   * The Extensive Flight Search allows you to find the prices of return flights between two airports over a large number of dates, and for a large variety of stay durations. The search doesn&#39;t return exact itineraries, but rather tells you the best price for a flight on a given day, for a stay of a given duration.\n\nThe search is based on our Extreme Search platform, which continually caches a large number of flight search results from a list of origin cities to a variety of destinations. Since it&#39;s a cached search, the response time is fast, but not all origin airports are available. Here is a list of the currently supported origin-destination airport pairs. We try to keep this list as fresh as possible for you, but be aware that it may not always be exactly up-to-date and it can change without warning.\n\nThat said, a price graph like this provides a powerful bargin shopping tool - allowing travelers with flexible itineraries to identify days on which they can get the cheapest flights to their destinations.
   * @param apikey API Key provided for your account, to identify you for API access
   * @param origin City code from which the traveler will depart. See the location and airport interfaces for more information.
   * @param destination IATA city code to which the traveler is going
   * @param departureDate Range of dates between which the traveler could depart. Ranges are inclusive and ranges of months will apply from the start to the end of the month. If just a single date is specified, only that date will be searched. By default, the date range starts today and applies up to 361 in the future is applied. Past dates are generally not supported, future dates should be in the next 361 days, although results start to become sparse after about 6 months in the future, as airlines may still be defining their schedules. The default is to search all future dates available.
   * @param duration The allowed duration or range of durations of the trip, in days.
   * @param direct Limit the search to results that do not require the passenger to change plane?
   * @param maxPrice Maximum price of trips to find in the result set, in the currency specified for this origin and destination pair in the cache contents spreadsheet. By default, no limit is applied
   * @param aggregationMode Specifies the granularity of results to be found. DESTINATION is the default and finds one result per city. COUNTRY finds one result per country, DAY finds on result for every day in the date range, WEEK finds one result for every week in the date range. Note that specifying a small granularity but a large search scope may result in a huge output. For some very large outputs, the API may refuse to provide a result.
   * @return ExtremeSearchResponse
   */
  public ExtremeSearchResponse flightExtensiveSearch (String apikey, String origin, String destination, String departureDate, String duration, Boolean direct, String maxPrice, String aggregationMode) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apikey' is set
     if (apikey == null) {
        throw new ApiException(400, "Missing the required parameter 'apikey' when calling flightExtensiveSearch");
     }
     
     // verify the required parameter 'origin' is set
     if (origin == null) {
        throw new ApiException(400, "Missing the required parameter 'origin' when calling flightExtensiveSearch");
     }
     
     // verify the required parameter 'destination' is set
     if (destination == null) {
        throw new ApiException(400, "Missing the required parameter 'destination' when calling flightExtensiveSearch");
     }
     
    // create path and map variables
    String path = "/flights/extensive-search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "apikey", apikey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "origin", origin));
    
    queryParams.addAll(apiClient.parameterToPairs("", "destination", destination));
    
    queryParams.addAll(apiClient.parameterToPairs("", "departure_date", departureDate));
    
    queryParams.addAll(apiClient.parameterToPairs("", "duration", duration));
    
    queryParams.addAll(apiClient.parameterToPairs("", "direct", direct));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max_price", maxPrice));
    
    queryParams.addAll(apiClient.parameterToPairs("", "aggregation_mode", aggregationMode));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<ExtremeSearchResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * The Flight Inspiration Search API lets you go beyond the traditional search by origin, destination and dates to meet the needs of travelers looking for suggestions and a search experience that reflects the way they choose their trip. This can help you answer the question \&quot;Where can I go within a given travel budget?\&quot;
   * The Inspiration Flight Search allows you to find the prices of return flights from an origin city without necessarily having a destination, or even a flight date, in mind. The search doesn&#39;t return a distinct set of price options, but rather, can tell you the price of flying from a given city to some destination, for a trip of a given duration, that falls within a given date range.\n\nThe search is based on our Extreme Search platform, which continually caches a large number of flight search results from a list of origin cities to a variety of destinations. Since it&#39;s a cached search, the response time is fast, but not all origin airports are available. Here is a list of the currently supported origin-destination airport pairs. We try to keep this list as fresh as possible for you, but be aware that it may not always be exactly up-to-date and it can change without warning.\n\nDespite this limitation don&#39;t underestimate the power of this API. Thanks to its quick response speed you can easily pair it with other APIs to provide a low fare and inspiration for any destination. For example, you can could combine it with a event search API and suggest a total price to see go and see an concert or a game in a selection of cities.
   * @param apikey API Key provided for your account, to identify you for API access
   * @param origin City code from which the traveler will depart. See the location and airport interfaces for more information.
   * @param destination IATA city code to which the traveler is going
   * @param departureDate Range of dates between which the traveler could depart. Ranges are inclusive and ranges of months will apply from the start to the end of the month. If just a single date is specified, only that date will be searched. By default, the date range starts today and applies up to 361 in the future is applied. Past dates are generally not supported, future dates should be in the next 361 days, although results start to become sparse after about 6 months in the future, as airlines may still be defining their schedules. The default is to search all future dates available.
   * @param duration The allowed duration or range of durations of the trip, in days.
   * @param direct Limit the search to results that do not require the passenger to change plane?
   * @param maxPrice Maximum price of trips to find in the result set, in the currency specified for this origin and destination pair in the cache contents spreadsheet. By default, no limit is applied
   * @param aggregationMode Specifies the granularity of results to be found. DESTINATION is the default and finds one result per city. COUNTRY finds one result per country, DAY finds on result for every day in the date range, WEEK finds one result for every week in the date range. Note that specifying a small granularity but a large search scope may result in a huge output. For some very large outputs, the API may refuse to provide a result.
   * @return ExtremeSearchResponse
   */
  public ExtremeSearchResponse flightInspirationSearch (String apikey, String origin, String destination, String departureDate, String duration, Boolean direct, String maxPrice, String aggregationMode) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apikey' is set
     if (apikey == null) {
        throw new ApiException(400, "Missing the required parameter 'apikey' when calling flightInspirationSearch");
     }
     
     // verify the required parameter 'origin' is set
     if (origin == null) {
        throw new ApiException(400, "Missing the required parameter 'origin' when calling flightInspirationSearch");
     }
     
    // create path and map variables
    String path = "/flights/inspiration-search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "apikey", apikey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "origin", origin));
    
    queryParams.addAll(apiClient.parameterToPairs("", "destination", destination));
    
    queryParams.addAll(apiClient.parameterToPairs("", "departure_date", departureDate));
    
    queryParams.addAll(apiClient.parameterToPairs("", "duration", duration));
    
    queryParams.addAll(apiClient.parameterToPairs("", "direct", direct));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max_price", maxPrice));
    
    queryParams.addAll(apiClient.parameterToPairs("", "aggregation_mode", aggregationMode));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<ExtremeSearchResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * The Low-Fare Search API lets you find the cheapest one way or return itineraries and fares between two airports at specific dates.
   * This is the low fare search engine Amadeus uses to retrieve the best price for flights, based on our latest Master Pricer Travel Board technology. This document describes how to make a low fare search and how to handle the returned messages. The message is composed of multiple results for given request. A result is defined by a unique combination of price, tax, passenger type, fare type, cabin, and availability for each requested segment. A result is then composed of single or multiple itineraries. Each itinerary is composed of an outbound leg, and, if a return date was specified, an inbound leg. Each leg is composed of a list of one or more flights, that the traveller will be required to take in order to get from the origin airport to the destination airport.
   * @param apikey API Key provided for your account, to identify you for API access
   * @param origin City code from which the traveler will depart. See the location and airport interfaces for more information.
   * @param destination IATA city code to which the traveler is going
   * @param departureDate The date on which the traveler will depart from the origin to go to the destination. The maximum scope for a date range is 2 days, for a larger scope, use the Extensive Search!
   * @param returnDate The date on which the traveler will depart from the destination to return to the origin. If this parameter is not specified, the search will find only one-way trips. If this, or the return_by parameter are specified, only return trips are found
   * @param arriveBy The datetime by which the outbound flight should arrive, based on local time at the destination airport
   * @param returnBy The time by which the inbound flight should arrive, based on local time at the airport specified as the origin parameter
   * @param adults The number of adult (age 12 and over) passengers traveling on this flight.
   * @param children The number of child (younger than age 12 on date of departure) passengers traveling on this flight who will each have their own separate seat
   * @param infants The number of infant (younger than age 2 on date of departure) passengers traveling on this flight. Infants travel in the lap of an adult passenger, and thus the number of infants must not exceed the number of adults.
   * @param includeAirlines If specified, all results will include at least one flight where one or more of these airlines is the marketing carrier
   * @param excludeAirlines If specified, no results will include any flights where any of these airlines is the marketing carrier
   * @param nonStop Setting this to true will find only flights that do not require the passenger to change from one flight to another
   * @param maxPrice Maximum price of trips to find in the result set, in USD (US dollars) unless some other currency code is specified. By default, no limit is applied
   * @param currency The preferred currency for the results
   * @param travelClass Searches for results where the majority of the itinerary flight time should be in a the specified cabin class or higher
   * @param numberOfResults The number of results to display. This will not be strictly interpreted but used as a guideline to display a useful number of results. By default, the number of results is dynamically determined. A maximum of 250 results will be displayed.
   * @return LowFareSearchResponse
   */
  public LowFareSearchResponse flightLowFareSearch (String apikey, String origin, String destination, String departureDate, String returnDate, String arriveBy, String returnBy, Integer adults, Integer children, Integer infants, String includeAirlines, String excludeAirlines, Boolean nonStop, Integer maxPrice, String currency, String travelClass, Integer numberOfResults) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apikey' is set
     if (apikey == null) {
        throw new ApiException(400, "Missing the required parameter 'apikey' when calling flightLowFareSearch");
     }
     
     // verify the required parameter 'origin' is set
     if (origin == null) {
        throw new ApiException(400, "Missing the required parameter 'origin' when calling flightLowFareSearch");
     }
     
     // verify the required parameter 'destination' is set
     if (destination == null) {
        throw new ApiException(400, "Missing the required parameter 'destination' when calling flightLowFareSearch");
     }
     
     // verify the required parameter 'departureDate' is set
     if (departureDate == null) {
        throw new ApiException(400, "Missing the required parameter 'departureDate' when calling flightLowFareSearch");
     }
     
    // create path and map variables
    String path = "/flights/low-fare-search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "apikey", apikey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "origin", origin));
    
    queryParams.addAll(apiClient.parameterToPairs("", "destination", destination));
    
    queryParams.addAll(apiClient.parameterToPairs("", "departure_date", departureDate));
    
    queryParams.addAll(apiClient.parameterToPairs("", "return_date", returnDate));
    
    queryParams.addAll(apiClient.parameterToPairs("", "arrive_by", arriveBy));
    
    queryParams.addAll(apiClient.parameterToPairs("", "return_by", returnBy));
    
    queryParams.addAll(apiClient.parameterToPairs("", "adults", adults));
    
    queryParams.addAll(apiClient.parameterToPairs("", "children", children));
    
    queryParams.addAll(apiClient.parameterToPairs("", "infants", infants));
    
    queryParams.addAll(apiClient.parameterToPairs("", "include_airlines", includeAirlines));
    
    queryParams.addAll(apiClient.parameterToPairs("", "exclude_airlines", excludeAirlines));
    
    queryParams.addAll(apiClient.parameterToPairs("", "non-stop", nonStop));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max_price", maxPrice));
    
    queryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "travel_class", travelClass));
    
    queryParams.addAll(apiClient.parameterToPairs("", "number_of_results", numberOfResults));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<LowFareSearchResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * The Hotel Airport Search API uses Amadeus&#39; fast hotel search engine to locate the cheapest available rooms near a given airport, for a given stay period. This API is ideal if you want to connect flight and hotels. Provide an IATA airport code, as well as the check-in and check-out dates, and get a list of up to 140 properties (names, codes, image, amenities) with their locations and rates. Optional parameters such as currency and maximum rates, amenities or hotel chain codes are also available and can be used to narrow down the results. More optional parameters such as show_sold_out &amp; rooms can be used to show sold out rooms and all available rooms.
   * A fast Hotel shopping API to see which hotels are available in a given area, on a given day and displays their lowest prices. With this API you can find out the price of the cheapest daily rate for all hotels near a given airport.\n\nThis API allows you to quickly see the locations of hotels near a given airport, and what prices in that area look like. The API is based on our high-speed hotel pricing cache, which is also used to power the hotel searchengine website https://hotelsearchengine.amadeus.com/. Results are returned very quickly, response times are generally under 2s. Our cache has great global coverage and is constantly refreshed with the latest prices.
   * @param apikey API Key provided for your account, to identify you for API access
   * @param location IATA location code for which further information is required.
   * @param checkIn Date on which the guest will begin their stay in the hotel. Past availability is not displayed, future availability becomes less useful from about 6 months from the current date.
   * @param checkOut Date on which the guest will end their stay in the hotel.
   * @param radius Radius around the center to look for hotels in kilometers (km).
   * @param lang The preferred language of the content related to each hotel. Content will be returned in this language if available.
   * @param currency The preferred currency for the results
   * @param chain Narrows the hotel search to a given hotel provider. The hotel chain is indicated by the first two characters of the property code.
   * @param maxRate The maximum amount per night that any hotel in the shopping response should cost. This is calculated by dividing the total price of the stay for the given dates by the number of nights specified falling between the check_in and check_out dates.
   * @param numberOfResults The maximum number of hotels to return in the results set. Hotels are ordered by total price, so if more than the given maximum number of hotels are available, only the cheapest options are returned.
   * @param allRooms This option if enabled will return all hotel room rates, not just the lowest room rate. Note: This will have an impact on the response time due to the larger messages returned.
   * @param showSoldOut This option if enabled will return hotel names and addresses even if rooms are sold out (closed properties)
   * @param amenity Hotel [amenities filter](hotels-api-supported-amenities-filter) to search narrow down hotels with certain amenities. For example: amenity=POOL. (Note: multiple amenities can be used in searches: amenity=PARKING&amp;amenity=RESTAURANT&amp;amenity=PETS_ALLOWED).
   * @return HotelSearchResponse
   */
  public HotelSearchResponse hotelAirportSearch (String apikey, String location, String checkIn, String checkOut, Integer radius, String lang, String currency, String chain, BigDecimal maxRate, Integer numberOfResults, Boolean allRooms, Boolean showSoldOut, String amenity) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apikey' is set
     if (apikey == null) {
        throw new ApiException(400, "Missing the required parameter 'apikey' when calling hotelAirportSearch");
     }
     
     // verify the required parameter 'location' is set
     if (location == null) {
        throw new ApiException(400, "Missing the required parameter 'location' when calling hotelAirportSearch");
     }
     
     // verify the required parameter 'checkIn' is set
     if (checkIn == null) {
        throw new ApiException(400, "Missing the required parameter 'checkIn' when calling hotelAirportSearch");
     }
     
     // verify the required parameter 'checkOut' is set
     if (checkOut == null) {
        throw new ApiException(400, "Missing the required parameter 'checkOut' when calling hotelAirportSearch");
     }
     
    // create path and map variables
    String path = "/hotels/search-airport".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "apikey", apikey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "location", location));
    
    queryParams.addAll(apiClient.parameterToPairs("", "check_in", checkIn));
    
    queryParams.addAll(apiClient.parameterToPairs("", "check_out", checkOut));
    
    queryParams.addAll(apiClient.parameterToPairs("", "radius", radius));
    
    queryParams.addAll(apiClient.parameterToPairs("", "lang", lang));
    
    queryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "chain", chain));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max_rate", maxRate));
    
    queryParams.addAll(apiClient.parameterToPairs("", "number_of_results", numberOfResults));
    
    queryParams.addAll(apiClient.parameterToPairs("", "all_rooms", allRooms));
    
    queryParams.addAll(apiClient.parameterToPairs("", "show_sold_out", showSoldOut));
    
    queryParams.addAll(apiClient.parameterToPairs("", "amenity", amenity));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<HotelSearchResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * The Hotel Lowest-Price Search API uses Amadeus&#39; fast hotel search engine to locate the cheapest available rooms within a given rectangular region for a given stay period. It&#39;s ideal for displaying results on a map.
   * A fast Hotel shopping API to see which hotels are available in a given area, on a given day and displays their lowest prices. With this API you can find out the price of the cheapest daily rate for all hotels within a specified geographical region.\n\nThis API allows you to quickly see the hotel locations in a region, and what prices in that area look like,  as well as the check-in and check-out dates, and get a list of up to 140 properties (names, codes, image, amenities) with their locations and rates. Optional parameters such as currency and maximum rates, amenities or hotel chain codes are also available and can be used to narrow down the results. More optional parameters such as show_sold_out &amp; rooms can be used to show sold out rooms and all available rooms. \n            \nThe API is based on our high-speed hotel pricing cache, which is also used to power the hotel searchengine website https://hotelsearchengine.amadeus.com/. Results are returned very quickly, response times are generally under 2s. Our cache has great global coverage and is constantly refreshed with the latest prices.
   * @param apikey API Key provided for your account, to identify you for API access
   * @param southWestCorner The coordinates of the south-west corner of the search box.
   * @param northEastCorner The coordinates of the north-east corner of the search box.
   * @param checkIn Date on which the guest will begin their stay in the hotel. Past availability is not displayed, future availability becomes less useful from about 6 months from the current date.
   * @param checkOut Date on which the guest will end their stay in the hotel.
   * @param lang The preferred language of the content related to each hotel. Content will be returned in this language if available.
   * @param currency The preferred currency for the results
   * @param chain Narrows the hotel search to a given hotel provider. The hotel chain is indicated by the first two characters of the property code.
   * @param maxRate The maximum amount per night that any hotel in the shopping response should cost. This is calculated by dividing the total price of the stay for the given dates by the number of nights specified falling between the check_in and check_out dates.
   * @param numberOfResults The maximum number of hotels to return in the results set. Hotels are ordered by total price, so if more than the given maximum number of hotels are available, only the cheapest options are returned.
   * @param allRooms This option if enabled will return all hotel room rates, not just the lowest room rate. Note: This will have an impact on the response time due to the larger messages returned.
   * @param showSoldOut This option if enabled will return hotel names and addresses even if rooms are sold out (closed properties)
   * @param amenity Hotel [amenities filter](hotels-api-supported-amenities-filter) to search narrow down hotels with certain amenities. For example: amenity=POOL. (Note: multiple amenities can be used in searches: amenity=PARKING&amp;amenity=RESTAURANT&amp;amenity=PETS_ALLOWED).
   * @return HotelSearchResponse
   */
  public HotelSearchResponse hotelGeosearchByBox (String apikey, String southWestCorner, String northEastCorner, String checkIn, String checkOut, String lang, String currency, String chain, BigDecimal maxRate, Integer numberOfResults, Boolean allRooms, Boolean showSoldOut, String amenity) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apikey' is set
     if (apikey == null) {
        throw new ApiException(400, "Missing the required parameter 'apikey' when calling hotelGeosearchByBox");
     }
     
     // verify the required parameter 'southWestCorner' is set
     if (southWestCorner == null) {
        throw new ApiException(400, "Missing the required parameter 'southWestCorner' when calling hotelGeosearchByBox");
     }
     
     // verify the required parameter 'northEastCorner' is set
     if (northEastCorner == null) {
        throw new ApiException(400, "Missing the required parameter 'northEastCorner' when calling hotelGeosearchByBox");
     }
     
     // verify the required parameter 'checkIn' is set
     if (checkIn == null) {
        throw new ApiException(400, "Missing the required parameter 'checkIn' when calling hotelGeosearchByBox");
     }
     
     // verify the required parameter 'checkOut' is set
     if (checkOut == null) {
        throw new ApiException(400, "Missing the required parameter 'checkOut' when calling hotelGeosearchByBox");
     }
     
    // create path and map variables
    String path = "/hotels/search-box".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "apikey", apikey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "south_west_corner", southWestCorner));
    
    queryParams.addAll(apiClient.parameterToPairs("", "north_east_corner", northEastCorner));
    
    queryParams.addAll(apiClient.parameterToPairs("", "check_in", checkIn));
    
    queryParams.addAll(apiClient.parameterToPairs("", "check_out", checkOut));
    
    queryParams.addAll(apiClient.parameterToPairs("", "lang", lang));
    
    queryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "chain", chain));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max_rate", maxRate));
    
    queryParams.addAll(apiClient.parameterToPairs("", "number_of_results", numberOfResults));
    
    queryParams.addAll(apiClient.parameterToPairs("", "all_rooms", allRooms));
    
    queryParams.addAll(apiClient.parameterToPairs("", "show_sold_out", showSoldOut));
    
    queryParams.addAll(apiClient.parameterToPairs("", "amenity", amenity));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<HotelSearchResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * The Hotel Lowest-Price Search API uses Amadeus&#39; fast hotel search engine to locate the cheapest available rooms within a given radius of a defined point for a given stay period.
   * A fast Hotel shopping API to see which hotels are available in a given area, on a given day and displays their lowest prices. With this API you can find out the price of the cheapest daily rate for all hotels within a specified radius of a point.\n\nThis API allows you to quickly see the hotel locations in a region, and what prices in that area look like,  as well as the check-in and check-out dates, and get list of up to 140 properties (names, codes, image, amenities) with their locations and rates. Optional parameters such as currency and maximum rates, amenities or hotel chain codes are also available and can be used to narrow down the results. More optional parameters such as show_sold_out &amp; rooms can be used to show sold out rooms and all available rooms. \n\nThe API is based on our high-speed hotel pricing cache, which is also used to power the hotel searchengine website https://hotelsearchengine.amadeus.com/. Results are returned very quickly, response times are generally under 2s. Our cache has great global coverage and is constantly refreshed with the latest prices.
   * @param apikey API Key provided for your account, to identify you for API access
   * @param latitude Latitude of the center of the search.
   * @param longitude Longitude of the center of the search.
   * @param radius Radius around the center to look for hotels in kilometers (km).
   * @param checkIn Date on which the guest will begin their stay in the hotel. Past availability is not displayed, future availability becomes less useful from about 6 months from the current date.
   * @param checkOut Date on which the guest will end their stay in the hotel.
   * @param lang The preferred language of the content related to each hotel. Content will be returned in this language if available.
   * @param currency The preferred currency for the results
   * @param chain Narrows the hotel search to a given hotel provider. The hotel chain is indicated by the first two characters of the property code.
   * @param maxRate The maximum amount per night that any hotel in the shopping response should cost. This is calculated by dividing the total price of the stay for the given dates by the number of nights specified falling between the check_in and check_out dates.
   * @param numberOfResults The maximum number of hotels to return in the results set. Hotels are ordered by total price, so if more than the given maximum number of hotels are available, only the cheapest options are returned.
   * @param allRooms This option if enabled will return all hotel room rates, not just the lowest room rate. Note: This will have an impact on the response time due to the larger messages returned.
   * @param showSoldOut This option if enabled will return hotel names and addresses even if rooms are sold out (closed properties)
   * @param amenity Hotel [amenities filter](hotels-api-supported-amenities-filter) to search narrow down hotels with certain amenities. For example: amenity=POOL. (Note: multiple amenities can be used in searches: amenity=PARKING&amp;amenity=RESTAURANT&amp;amenity=PETS_ALLOWED).
   * @return HotelSearchResponse
   */
  public HotelSearchResponse hotelGeosearchByCircle (String apikey, BigDecimal latitude, BigDecimal longitude, Integer radius, String checkIn, String checkOut, String lang, String currency, String chain, BigDecimal maxRate, Integer numberOfResults, Boolean allRooms, Boolean showSoldOut, String amenity) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apikey' is set
     if (apikey == null) {
        throw new ApiException(400, "Missing the required parameter 'apikey' when calling hotelGeosearchByCircle");
     }
     
     // verify the required parameter 'latitude' is set
     if (latitude == null) {
        throw new ApiException(400, "Missing the required parameter 'latitude' when calling hotelGeosearchByCircle");
     }
     
     // verify the required parameter 'longitude' is set
     if (longitude == null) {
        throw new ApiException(400, "Missing the required parameter 'longitude' when calling hotelGeosearchByCircle");
     }
     
     // verify the required parameter 'radius' is set
     if (radius == null) {
        throw new ApiException(400, "Missing the required parameter 'radius' when calling hotelGeosearchByCircle");
     }
     
     // verify the required parameter 'checkIn' is set
     if (checkIn == null) {
        throw new ApiException(400, "Missing the required parameter 'checkIn' when calling hotelGeosearchByCircle");
     }
     
     // verify the required parameter 'checkOut' is set
     if (checkOut == null) {
        throw new ApiException(400, "Missing the required parameter 'checkOut' when calling hotelGeosearchByCircle");
     }
     
    // create path and map variables
    String path = "/hotels/search-circle".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "apikey", apikey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "latitude", latitude));
    
    queryParams.addAll(apiClient.parameterToPairs("", "longitude", longitude));
    
    queryParams.addAll(apiClient.parameterToPairs("", "radius", radius));
    
    queryParams.addAll(apiClient.parameterToPairs("", "check_in", checkIn));
    
    queryParams.addAll(apiClient.parameterToPairs("", "check_out", checkOut));
    
    queryParams.addAll(apiClient.parameterToPairs("", "lang", lang));
    
    queryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "chain", chain));
    
    queryParams.addAll(apiClient.parameterToPairs("", "max_rate", maxRate));
    
    queryParams.addAll(apiClient.parameterToPairs("", "number_of_results", numberOfResults));
    
    queryParams.addAll(apiClient.parameterToPairs("", "all_rooms", allRooms));
    
    queryParams.addAll(apiClient.parameterToPairs("", "show_sold_out", showSoldOut));
    
    queryParams.addAll(apiClient.parameterToPairs("", "amenity", amenity));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<HotelSearchResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Once you have found your preferred hotel, our Hotel Property Code Search API allows you to quickly find out more room and rate information. It&#39;s ideal for displaying results on a map.
   * This API allows you to quickly see the detailed information of a single hotel, including descriptions, address, GPS location, amenities, awards, lowest priced room and all room prices and booking information. \n\nThis API gives you more information on a specific property. Optional parameters such as show_sold_out &amp; rooms can be used to show sold out rooms and all available rooms. \n\nThe API is based on our high-speed hotel pricing cache, which is also used to power the hotel searchengine website https://hotelsearchengine.amadeus.com/). Results are returned very quickly, response times are generally under 2s. Our cache has great global coverage and is constantly refreshed with the latest prices.
   * @param apikey API Key provided for your account, to identify you for API access
   * @param propertyCode A Hotel property code based on 2 letter chain code + 3 letter IATA city code + 3 char property unique id.
   * @param checkIn Date on which the guest will begin their stay in the hotel. Past availability is not displayed, future availability becomes less useful from about 6 months from the current date.
   * @param checkOut Date on which the guest will end their stay in the hotel.
   * @param lang The preferred language of the content related to each hotel. Content will be returned in this language if available.
   * @param currency The preferred currency for the results
   * @param allRooms This option if enabled will return all hotel room rates, not just the lowest room rate. Note: This will have an impact on the response time due to the larger messages returned.
   * @param showSoldOut This option if enabled will return hotel names and addresses even if rooms are sold out (closed properties)
   * @return HotelPropertyResponse
   */
  public HotelPropertyResponse hotelPropertyCodeSearch (String apikey, String propertyCode, String checkIn, String checkOut, String lang, String currency, Boolean allRooms, Boolean showSoldOut) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apikey' is set
     if (apikey == null) {
        throw new ApiException(400, "Missing the required parameter 'apikey' when calling hotelPropertyCodeSearch");
     }
     
     // verify the required parameter 'propertyCode' is set
     if (propertyCode == null) {
        throw new ApiException(400, "Missing the required parameter 'propertyCode' when calling hotelPropertyCodeSearch");
     }
     
     // verify the required parameter 'checkIn' is set
     if (checkIn == null) {
        throw new ApiException(400, "Missing the required parameter 'checkIn' when calling hotelPropertyCodeSearch");
     }
     
     // verify the required parameter 'checkOut' is set
     if (checkOut == null) {
        throw new ApiException(400, "Missing the required parameter 'checkOut' when calling hotelPropertyCodeSearch");
     }
     
    // create path and map variables
    String path = "/hotels/{property_code}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "property_code" + "\\}", apiClient.escapeString(propertyCode.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "apikey", apikey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "check_in", checkIn));
    
    queryParams.addAll(apiClient.parameterToPairs("", "check_out", checkOut));
    
    queryParams.addAll(apiClient.parameterToPairs("", "lang", lang));
    
    queryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    
    queryParams.addAll(apiClient.parameterToPairs("", "all_rooms", allRooms));
    
    queryParams.addAll(apiClient.parameterToPairs("", "show_sold_out", showSoldOut));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<HotelPropertyResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * The Location Information API allows you to quickly find out more information about any IATA city or airport location code. With this API, you can find information such as city and airport names and locations, as well as information on timezones and airport usage.
   * This service retrieves the location information corresponding to a IATA city or airport code.\n\nWhen provided with an IATA code, the service determines whether this code could relate to a city code, an airport code or both. If the city could contain multiple airports, it will return all possible airports that correspond to that city code.\n\nThis API is based on the Amadeus supported Geobases open-source project http://opentraveldata.github.io/geobases. If you wish to make your own database with all IATA location information, in order to get faster reponses, you can download the latest raw data from their github page https://github.com/opentraveldata/geobases. The exact file used for this API is https://raw.githubusercontent.com/opentraveldata/geobases/public/GeoBases/DataSources/Por/Ori/ori_por_public.csv
   * @param apikey API Key provided for your account, to identify you for API access
   * @param code IATA location code for which further information is required
   * @return LocationResponse
   */
  public LocationResponse locationInformation (String apikey, String code) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apikey' is set
     if (apikey == null) {
        throw new ApiException(400, "Missing the required parameter 'apikey' when calling locationInformation");
     }
     
     // verify the required parameter 'code' is set
     if (code == null) {
        throw new ApiException(400, "Missing the required parameter 'code' when calling locationInformation");
     }
     
    // create path and map variables
    String path = "/location/{code}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "apikey", apikey));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<LocationResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * This service retrieves the rail station information corresponding to an Amadeus UIC rail station ID. Currently only French and Italian stations are supported.
   * 
   * @param apikey API Key provided for your account, to identify you for API access
   * @param id Station ID for which further information is required.
   * @return RailStationResponse
   */
  public RailStationResponse railStationInformation (String apikey, String id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apikey' is set
     if (apikey == null) {
        throw new ApiException(400, "Missing the required parameter 'apikey' when calling railStationInformation");
     }
     
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling railStationInformation");
     }
     
    // create path and map variables
    String path = "/rail-station/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "apikey", apikey));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<RailStationResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Use the Rail Station Autocomplete API to transform user input into a unique rail station code.
   * Given the start of any word in a rail station&#39;s official name, as a term, this API provides the full name and rail station ID of a rail station for use in searches. The response provides an array of up to 20 possible matches, sorted by passenger traffic, in a JQuery Autocomplete compatible format.\n\nThe value returned is the UIC station code. The label returned is always in UTF-8 format, with the station&#39;s official name (which is often in the native language). Agglomeration station codes may also be returned.\n\nNote that only French and Italian rail stations are supported by the Rail Station Autocomplete API
   * @param apikey API Key provided for your account, to identify you for API access
   * @param term Search term that should represent some part of a station name. Not case sensitive, may be blank.
   * @return RailStationAutocompleteResponse
   */
  public RailStationAutocompleteResponse railStationAutocomplete (String apikey, String term) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apikey' is set
     if (apikey == null) {
        throw new ApiException(400, "Missing the required parameter 'apikey' when calling railStationAutocomplete");
     }
     
     // verify the required parameter 'term' is set
     if (term == null) {
        throw new ApiException(400, "Missing the required parameter 'term' when calling railStationAutocomplete");
     }
     
    // create path and map variables
    String path = "/rail-stations/autocomplete".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "apikey", apikey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "term", term));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<RailStationAutocompleteResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Our instant extensive train search will provide you with multi-day availability and a variety of schedule and pricing options to travel to your destination.
   * This API allows you to search trains availability and prices for a single day or date range. It&#39;s based on our Rail Instant Search technology, providing you with immediate results from our rail search cache.\n\nThis API has content from SNCF (French trains) and Trenitalia (Italian Trains).\n            \nThe content is also restricted to single-leg trips - where a single train takes you directly from the origin to the destination.
   * @param apikey API Key provided for your account, to identify you for API access
   * @param origin Identifier of the rail station from which you would like to depart.
   * @param destination Identifier of the rail station to which you would like to travel.
   * @param departureDate The date or range of dates on which you would like to depart from the origin station to go to the destination.
   * @return ExtensiveTrainSearchResponse
   */
  public ExtensiveTrainSearchResponse trainExtensiveSearch (String apikey, String origin, String destination, String departureDate) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apikey' is set
     if (apikey == null) {
        throw new ApiException(400, "Missing the required parameter 'apikey' when calling trainExtensiveSearch");
     }
     
     // verify the required parameter 'origin' is set
     if (origin == null) {
        throw new ApiException(400, "Missing the required parameter 'origin' when calling trainExtensiveSearch");
     }
     
     // verify the required parameter 'destination' is set
     if (destination == null) {
        throw new ApiException(400, "Missing the required parameter 'destination' when calling trainExtensiveSearch");
     }
     
     // verify the required parameter 'departureDate' is set
     if (departureDate == null) {
        throw new ApiException(400, "Missing the required parameter 'departureDate' when calling trainExtensiveSearch");
     }
     
    // create path and map variables
    String path = "/trains/extensive-search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "apikey", apikey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "origin", origin));
    
    queryParams.addAll(apiClient.parameterToPairs("", "destination", destination));
    
    queryParams.addAll(apiClient.parameterToPairs("", "departure_date", departureDate));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<ExtensiveTrainSearchResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * The train schedule search can suggest destinations from your chosen departure station
   * This API allows you to find all the possible destinations in the Rail Instant Search cache (used by Extensive Search above) from a given origin station on a given day. You can use this to help build network maps, journey planners or provide inspiration for rail travel.\n\nThis API has content from SNCF (French trains) and Trenitalia (Italian Trains). All the options returned are single-leg trips - where a single train takes you directly from the origin to the destination. In general, only departure dates up to 90 days in the future are supported\n\nCurrently agglomeration stations are not supported
   * @param apikey API Key provided for your account, to identify you for API access
   * @param origin Identifier of the rail station where you would like to depart from.
   * @param departureDate The date on which you would like to depart from the origin station to go to the destination.
   * @return TrainScheduleSearchResponse
   */
  public TrainScheduleSearchResponse trainScheduleSearch (String apikey, String origin, String departureDate) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apikey' is set
     if (apikey == null) {
        throw new ApiException(400, "Missing the required parameter 'apikey' when calling trainScheduleSearch");
     }
     
     // verify the required parameter 'origin' is set
     if (origin == null) {
        throw new ApiException(400, "Missing the required parameter 'origin' when calling trainScheduleSearch");
     }
     
     // verify the required parameter 'departureDate' is set
     if (departureDate == null) {
        throw new ApiException(400, "Missing the required parameter 'departureDate' when calling trainScheduleSearch");
     }
     
    // create path and map variables
    String path = "/trains/schedule-search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "apikey", apikey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "origin", origin));
    
    queryParams.addAll(apiClient.parameterToPairs("", "departure_date", departureDate));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<TrainScheduleSearchResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * The Airline Autocomplete API provides a simple means to find an IATA airline code for flight search based on an airline. The API is fully JQuery-Autocomplete compatible to enable you to quickly build a drop-down list for your users to find the right airline easily.
   * Given the start of any word in an airline official name or the start of an airline IATA code, this API provides the full name and IATA airline code of the airline, for use in flight searches. The response provides all possible matches, sorted alphabetically, in a [JQuery UI Autocomplete](http://jqueryui.com/autocomplete/) compatible format.\n\nThe value returned is the IATA airline code. The label returned is always in UTF-8 format, with the airline official name.
   * @param apikey API Key provided for your account, to identify you for API access
   * @param term Search term that should represent some part airline name or airline IATA code.
   * @return AirlineAutocompleteResponse
   */
  public AirlineAutocompleteResponse airlineAutocomplete (String apikey, String term) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apikey' is set
     if (apikey == null) {
        throw new ApiException(400, "Missing the required parameter 'apikey' when calling airlineAutocomplete");
     }
     
     // verify the required parameter 'term' is set
     if (term == null) {
        throw new ApiException(400, "Missing the required parameter 'term' when calling airlineAutocomplete");
     }
     
    // create path and map variables
    String path = "/travel-intelligence/airline-autocomplete".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "apikey", apikey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "term", term));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<AirlineAutocompleteResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * The Flight Traffic API lets you find the true origin and destination traffic summary between two journey points over a specified period. This can help you answer questions like \&quot;What cities are people coming from to visit Los Angeles between January through April of 2015\&quot;
   * The Flight Traffic API lets you find the origin and destination traffic summary between two journey points over a specified period. The search returns number of flights &amp; travelers for each origin and destination, ordered by popularity, for each month specified within the search period. This search can help you answer questions like \&quot;Where are people from Los Angeles traveling to between January and April of 2015?\&quot; or \&quot;Which is the most popular month for New Yorkers to travel last year?\&quot;. This search is based on Amadeus&#39; Travel Intelligence Engine, a high performance scalable cloud-based platform, born in the age of Big Data and purposely built for the industry bringing total flexibility and speed to business intelligence for travel. Please see http://www.amadeus.com/travelintelligence for more information.
   * @param apikey API Key provided for your account, to identify you for API access
   * @param period Range of periods for which flight traffic information is required. Ranges are inclusive and ranges of months will apply from the start to the end of the month. If just a single period is specified, only that period will be displayed. Only periods from 2011-01 up to previous month of the current year are valid. Future periods are not supported.
   * @param origin IATA city code from which the traveler will depart.
   * @param destination IATA city code to which the traveler is going.
   * @param numberOfResultsPerPeriod The maximum number of destinations to return for each period. Destinations are ordered by dates and number of travelers. The maximum number of destinations per period returned is 50
   * @return FlightTrafficSearchResponse
   */
  public FlightTrafficSearchResponse flightTrafficAPI (String apikey, String period, String origin, String destination, Integer numberOfResultsPerPeriod) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apikey' is set
     if (apikey == null) {
        throw new ApiException(400, "Missing the required parameter 'apikey' when calling flightTrafficAPI");
     }
     
     // verify the required parameter 'period' is set
     if (period == null) {
        throw new ApiException(400, "Missing the required parameter 'period' when calling flightTrafficAPI");
     }
     
     // verify the required parameter 'origin' is set
     if (origin == null) {
        throw new ApiException(400, "Missing the required parameter 'origin' when calling flightTrafficAPI");
     }
     
    // create path and map variables
    String path = "/travel-intelligence/flight-traffic".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "apikey", apikey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "period", period));
    
    queryParams.addAll(apiClient.parameterToPairs("", "origin", origin));
    
    queryParams.addAll(apiClient.parameterToPairs("", "destination", destination));
    
    queryParams.addAll(apiClient.parameterToPairs("", "number_of_results_per_period", numberOfResultsPerPeriod));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<FlightTrafficSearchResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * The Top Flight Destinations API lets you find the most popular flight destinations from an origin during a period. This can help you answer questions like \&quot;Where are most people going to from Paris during the month of September?\&quot;
   * The Top Flight Destinations API lets you find the most popular flight destinations from an origin during a period. This can help you answer questions like \&quot;Where are most people from Paris going to during the month of September?\&quot; The API is based on estimated flight traffic summary data from two journey points over a specific period. It returns up to 50 results, ordered by popularity, showing number of travelers as well as number of flights.\n\nThis estimated search is based on Amadeus&#39; Travel Intelligence Engine, a high performance scalable cloud-based platform, born in the age of Big Data and purposely built for the industry bringing total flexibility and speed to business intelligence for travel. Please see http://www.amadeus.com/travelintelligence for more information.
   * @param apikey API Key provided for your account, to identify you for API access
   * @param period Period, in month of the year (YYYY-MM), when consumers are traveling. Only periods from 2011-01 up to previous month of the current year are valid. Future dates are not supported.
   * @param origin IATA city code from which the traveler will depart.
   * @param numberOfResults The maximum number of destinations to return in the results set. Destinations are ordered by number of travelers. The maximum number of destinations returned is 50
   * @return TopDestinationsSearchResponse
   */
  public TopDestinationsSearchResponse topFlightDestinations (String apikey, String period, String origin, Integer numberOfResults) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apikey' is set
     if (apikey == null) {
        throw new ApiException(400, "Missing the required parameter 'apikey' when calling topFlightDestinations");
     }
     
     // verify the required parameter 'period' is set
     if (period == null) {
        throw new ApiException(400, "Missing the required parameter 'period' when calling topFlightDestinations");
     }
     
     // verify the required parameter 'origin' is set
     if (origin == null) {
        throw new ApiException(400, "Missing the required parameter 'origin' when calling topFlightDestinations");
     }
     
    // create path and map variables
    String path = "/travel-intelligence/top-destinations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "apikey", apikey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "period", period));
    
    queryParams.addAll(apiClient.parameterToPairs("", "origin", origin));
    
    queryParams.addAll(apiClient.parameterToPairs("", "number_of_results", numberOfResults));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<TopDestinationsSearchResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * The Top Flight Searches API lets you find the most popular flight searches from an origin in a during given search period. This can help you answer questions like \&quot;Where are people looking to travel from Paris during the month of September?\&quot;
   * The Top Flight Search allows you to find number of estimated searches from an origin, optionally a destination, within a time period when travelers are performing the searches. The search is based on queries performed from within a country (also refers to as market) and returns up to 50 results, ordered by popularity, showing number of searches for most searched destination with its previous year comparison. This search also shows patterns on how travelers are searching for flights, revealing where, when and for how long they’re planning to travel by returning results in Trip Durations (How long are the trips planned for?) and Advance Search Period (How long before departures do travelers start searching for their trips?) information. This estimated search is based on Amadeus&#39; Travel Intelligence Engine, a high performance scalable cloud-based platform, born in the age of Big Data and purposely built for the industry bringing total flexibility and speed to business intelligence for travel. Please see http://www.amadeus.com/travelintelligence for more information.
   * @param apikey API Key provided for your account, to identify you for API access
   * @param period Period of date (month or year) when consumers are searching to travel. Use YYYY-MM for month or YYYY for year. Only periods from year 2011-01 up to current year, previous month are valid. Future dates are not supported.
   * @param origin IATA city code from which the traveler will depart.
   * @param country 2-letter IATA country code of the country where the search queries originates from.
   * @param destination IATA city code to which the traveler is going
   * @param numberOfResults The maximum number of destinations to return in the results set. Destinations are ordered by number of searches. The maximum number of destinations returned is 50
   * @return TopSearchesSearchResponse
   */
  public TopSearchesSearchResponse topFlightSearches (String apikey, String period, String origin, String country, String destination, Integer numberOfResults) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apikey' is set
     if (apikey == null) {
        throw new ApiException(400, "Missing the required parameter 'apikey' when calling topFlightSearches");
     }
     
     // verify the required parameter 'period' is set
     if (period == null) {
        throw new ApiException(400, "Missing the required parameter 'period' when calling topFlightSearches");
     }
     
     // verify the required parameter 'origin' is set
     if (origin == null) {
        throw new ApiException(400, "Missing the required parameter 'origin' when calling topFlightSearches");
     }
     
     // verify the required parameter 'country' is set
     if (country == null) {
        throw new ApiException(400, "Missing the required parameter 'country' when calling topFlightSearches");
     }
     
    // create path and map variables
    String path = "/travel-intelligence/top-searches".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "apikey", apikey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "period", period));
    
    queryParams.addAll(apiClient.parameterToPairs("", "origin", origin));
    
    queryParams.addAll(apiClient.parameterToPairs("", "destination", destination));
    
    queryParams.addAll(apiClient.parameterToPairs("", "country", country));
    
    queryParams.addAll(apiClient.parameterToPairs("", "number_of_results", numberOfResults));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<TopSearchesSearchResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Amadeus has one of the world&#39;s largest repositories of travel records. Enable travelers to explore the details of their journeys stored in the Amadeus system using our Retrieve Travel Record API.
   * Note: This API requires the use of HTTPS\n\nThis service retrieves a travel record (also sometimes referred to as a PNR) for a given journey when provided with Record Locator to identify a travel record, along with the last name of any traveler who is marked as a passenger on this record.\n\nThe API provides detailed information on a given record, including any air, car, hotel or rail reservations, as well as passenger details, and contact frequent traveler information for each passenger when available. You can use this to provide a wide variety of pre-trip or in-trip services.\n\nNote that this API transmits sensitive personal data about a traveler&#39;s journey. We work hard to ensure that we comply with all the legal requirements this entails, and as an application owner, you need to do so too - we don&#39;t want you to get in trouble! This paragraph, or anything else in our documentation, does not constitute legal advice, it&#39;s just to give you an idea of some of the potential issues that you may encounter. Please check your legal obligations regarding the use of this data before implementing this API\n\nIn most countries, the data in the returned travel record is considered to be the property of the traveler. In order to ensure that you are acting on behalf of the traveler, we require you to provide the traveler&#39;s last name in addition to the record locator when you make a call to this API. You should ensure that you have consent from the traveler before retrieving this record, in some countries this is a legal requirement - please respect this appropriately.\n\nOur data center is based in Europe, so there is a legal requirement that you to access this API over a secure connection. If you plan to store the information returned by this API, ensure you comply with storage requirements for European data, in addition to those of your local country. For example, there are strict requirements on the caching of retrieved travel records, so please ensure the cache control HTTP headers in the response are respected.\&quot;
   * @param apikey API Key provided for your account, to identify you for API access
   * @param recordLocator The Amadeus identifier of the given travel record. Usually printed at the top of an itinerary or boarding pass.
   * @param lastName The last name of any traveler in this record, as written on their identification used for travel. This is required to ensure that applications retrieving the record are acting on behalf of the customer.
   * @param env Indicates the Amadeus system from which this record should be retrieved.
   * @return TravelRecordResponse
   */
  public TravelRecordResponse travelRecordRetrieve (String apikey, String recordLocator, String lastName, String env) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apikey' is set
     if (apikey == null) {
        throw new ApiException(400, "Missing the required parameter 'apikey' when calling travelRecordRetrieve");
     }
     
     // verify the required parameter 'recordLocator' is set
     if (recordLocator == null) {
        throw new ApiException(400, "Missing the required parameter 'recordLocator' when calling travelRecordRetrieve");
     }
     
     // verify the required parameter 'lastName' is set
     if (lastName == null) {
        throw new ApiException(400, "Missing the required parameter 'lastName' when calling travelRecordRetrieve");
     }
     
    // create path and map variables
    String path = "/travel-record/{record_locator}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "record_locator" + "\\}", apiClient.escapeString(recordLocator.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "apikey", apikey));
    
    queryParams.addAll(apiClient.parameterToPairs("", "last_name", lastName));
    
    queryParams.addAll(apiClient.parameterToPairs("", "env", env));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<TravelRecordResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
