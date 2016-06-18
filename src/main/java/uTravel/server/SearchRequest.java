package uTravel.server;

import java.util.ArrayList;
import java.util.List;

import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

public class SearchRequest {
	
	private String origin;
	private String destination;
	private String departureDate;
	private String returnDate;
	
	
	public SearchRequest(String origin, String destination, String departureDate, String returnDate) {
		super();
		this.origin = origin;
		this.destination = destination;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
	}

	public List<Pair> getParams()
	{	
		ApiClient apiClient = Configuration.getDefaultApiClient();
		List<Pair> queryParams = new ArrayList<Pair>();
	
		queryParams.addAll(apiClient.parameterToPairs("", "origin", this.origin));    
		queryParams.addAll(apiClient.parameterToPairs("", "destination", this.destination));	    
		queryParams.addAll(apiClient.parameterToPairs("", "departure_date", this.departureDate));	
		queryParams.addAll(apiClient.parameterToPairs("", "return_date", this.returnDate));
	    
	    return queryParams;
	}
}
