package com.sj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	
	private static DBConnector connector;

	private DBConnector() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static DBConnector getConnector() {
		if(connector == null)
			connector = new DBConnector();
		return connector;
	}
	
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mariadb://localhost:3306/book","root","password");
	}

}
