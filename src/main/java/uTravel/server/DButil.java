package uTravel.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DButil {

	static final String url = "jdbc:mysql://grutraveldb.cckic3dpnwtb.us-west-2.rds.amazonaws.com:3306/";
	static final String userName = "gr_utravel";
	static final String password = "grgrgr1234";
	static final String dbName = "UTRAVEL_DB";
	static final String driver = "com.mysql.jdbc.Driver";

	public static List<String> getNearestTrains(String airportInitial) {
		
		List<String> results = new ArrayList<String>();
		try 
		{
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url + dbName, userName, password);

			Statement stmt = conn.createStatement();
			String sql = String.format("SELECT * FROM UTRAVEL_DB.AirportNearestTrains where airport = '%s'", airportInitial);
			ResultSet rs = stmt.executeQuery(sql);
			
			// Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				String uic = rs.getString("train_uic");
				
				// Display values
				System.out.println(uic);
				results.add(uic);
				
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return results;
	}
}
