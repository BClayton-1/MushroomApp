package MushroomApp;

import java.sql.*;

public class SqliteConnection {
	
	public static Connection Connector() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:MushroomApp.sqlite");
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			// Handle exception
		}
	}
}
