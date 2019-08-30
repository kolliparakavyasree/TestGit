package com.sj.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCDemo {
	
	public static void main(String args[]) throws IOException {
		
		try {
			Properties prop=new Properties();
			FileInputStream ip= new FileInputStream("C:\\Users\\Abridge Solutions\\eclipse-workspace\\Sample\\src\\config.properties");
			prop.load(ip);
			Class.forName(prop.getProperty("driver"));
			Connection connection = DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("username"),prop.getProperty("password"));
			Statement statement = connection.createStatement();
			
			ResultSet users = statement.executeQuery("select * from product");
			
			while(users.next()) {
				System.out.println(users.getString(1)+","+users.getString(2));
			}
			connection.close();
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
