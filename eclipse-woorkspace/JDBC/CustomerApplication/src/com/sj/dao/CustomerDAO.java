package com.sj.dao;

public interface CustomerDAO {

	public void viewDetails();
	public void createCust(int id,String name,String loc);
	public void DeleteCust(int id,String name,String loc);
	public void UpdateCust(int id,String name,String loc);
	
}
