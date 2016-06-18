package uTravel.server;

import io.swagger.client.ApiClient;

public class Main {

	public static void main(String[] args) {
		try 
		{
			UtravelHttpServer.Start(args);
			ApiClient client = new ApiClient();
			System.out.println(client.getBasePath()+ "/n");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
