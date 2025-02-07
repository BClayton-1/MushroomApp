package MushroomApp;

import java.sql.*;

public class SqliteConnection {
	
	public static Connection Connector() {
		try {
			Class.forName("org.sqlite.jdbc");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:MushroomApp.sqlite");
			return conn;
		} catch (Exception e) {
			return null;
			// Handle exception
		}
	}
}
