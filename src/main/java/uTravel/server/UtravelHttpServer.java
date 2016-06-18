package uTravel.server;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import io.swagger.client.model.ExtensiveTrainSearchResult;
import io.swagger.client.model.LowFareSearchResult;
import com.google.gson.Gson;

/*
 * a simple static http server
*/
public class UtravelHttpServer 
{
	public static void Start(String[] args) throws Exception 
	{
		 HttpServer server = null;
		// Default port
		int port = 8090;		
		if (args.length > 0)
			port = Integer.decode(args[0]).intValue();
					
		try 
		{
			// Setup Http server
		    server = HttpServer.create(new InetSocketAddress(port), 0);
		    //server.createContext("/utravel/getairport", new AirportHandler());
		    server.createContext("/", new SearchHandler());
		    server.setExecutor(null); // creates a default executor
	
		    // Activate
		    server.start();
		    System.out.println("The server is running on port " + port);
		}
		catch (Exception e) { e.printStackTrace(); }
		/*finally {
			server.stop(port);
		}*/
    }
	
	/**
	 * returns the url parameters in a map
	 * @param query
	 * @return map
	 */
	public static Map<String, String> queryToMap(String query)
	{
		Map<String, String> result = new HashMap<String, String>();
		for (String param : query.split("&")) 
		{
			String pair[] = param.split("=");
			if (pair.length>1) 
				result.put(pair[0], pair[1]);
			else
				result.put(pair[0], "");
		}
		return result;
  	}
	  
	public static void SuccessResponse(HttpExchange httpExchange, String response) throws IOException 
	{
		httpExchange.sendResponseHeaders(200, response.length());
		OutputStream os = httpExchange.getResponseBody();
		os.write(response.getBytes());
		os.close();
	}
	
	public static void ErrorResponse(HttpExchange httpExchange, String response) throws IOException 
	{
		httpExchange.sendResponseHeaders(400, response.length());
		OutputStream os = httpExchange.getResponseBody();
		os.write(response.getBytes());
		os.close();
	}

	//TODO: add connection to db, get all airports and return then as a pretty json
	static class HandleResponse 
	{
		public static void ParseResponse(Map<String, String> parms, HttpExchange httpExchange) throws IOException
		{
			StringBuilder response = new StringBuilder();
			if (parms == null)
				response.append("Problem with URL");
			else	
			{
				response.append("<html><body>");		      
				for (Map.Entry<String, String> p : parms.entrySet())
					response.append(p.getKey() + " : " + p.getValue() + "<br/>");
				response.append("</body></html>");
			}
			SuccessResponse(httpExchange, response.toString());
		}
		
		public static void SendSearchResponse(List<LowFareSearchResult> flightRes, List<ExtensiveTrainSearchResult> railRes, HttpExchange httpExchange) throws IOException
		{
			if (flightRes == null && railRes == null) {
				SuccessResponse(httpExchange, "No results found");
				return;
			}
		
			Gson gs = new Gson();
			String allRes = gs.toJson(flightRes) + gs.toJson(railRes);
			SuccessResponse(httpExchange, allRes);
		}
	}
}