package MushroomApp;

import java.sql.*;

public class LoginModel {
	
	Connection connection;
	
	public LoginModel() {
		connection = SqliteConnection.Connector();
		if (connection == null) System.exit(1);
	}
	
	public boolean isDBConnected() {
		try {
			return !connection.isClosed();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isLogin(String user, String password) {
		PreparedStatement preparedStatement;
		ResultSet resultSet;
		String query = "select * from user where username = ? and password = ?";
		
	}

}
