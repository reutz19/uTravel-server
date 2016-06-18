package uTravel.server;

import java.io.IOException;
import java.util.Map;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import uTravel.server.UtravelHttpServer.HandleResponse;

// Page : /utravel/getairport
// 	Handles requests for getting all airports destinations 
class AirportHandler implements HttpHandler 
{
	public void handle(HttpExchange httpExchange) throws IOException 
	{
		Map <String,String>parms = 
				UtravelHttpServer.queryToMap(httpExchange.getRequestURI().getQuery());
		HandleResponse.ParseResponse(parms, httpExchange);
	}
}