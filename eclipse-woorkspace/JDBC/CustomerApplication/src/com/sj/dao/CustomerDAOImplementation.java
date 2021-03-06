package com.sj.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDAOImplementation implements CustomerDAO{
			
	public CustomerDAOImplementation(){
		System.out.println("\nDatabase connection established!!!!!!!!!");
	}
	
	public void viewDetails(){
		DBConnector d=new DBConnector();
		Connection c;
		try {
			c = d.getConnection();
			Statement state= c.createStatement();
			ResultSet users=state.executeQuery("select * from customer");
			System.out.println("\nThe Records are............\n");
			while(users.next()){
				System.out.println(users.getString(1)+" "+users.getString(2)+" "+users.getString(3));
			}
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}	
	
	public void createCust(int id,String name,String loc){
		DBConnector d=new DBConnector();
		Connection c;
		try {
			c = d.getConnection();
			Statement state= c.createStatement();
			String q1="insert into customer values('" +id+ "', '" + name + "', '" + loc + "')";
			ResultSet rs = state.executeQuery(q1);
			System.out.println("\nInserted Records into the table............");
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void DeleteCust(int id,String name,String loc){
		DBConnector d=new DBConnector();
		Connection c;
		try {
			c = d.getConnection();
			Statement state= c.createStatement();
			String q1="insert into customer values('" +id+ "', '" + name + "', '" + loc + "')";
			ResultSet rs = state.executeQuery(q1);
			System.out.println("\nUpdated the table............");
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void UpdateCust(int id,String name,String loc){
		DBConnector d=new DBConnector();
		Connection c;
		try {
			c = d.getConnection();
			Statement state= c.createStatement();
			String q1="insert into customer values('" +id+ "', '" + name + "', '" + loc + "')";
			ResultSet rs = state.executeQuery(q1);
			System.out.println("\nUpdated the table............");
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

