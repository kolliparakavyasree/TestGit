package com.sj.model;

public class Customer {
	int id;
	String loc,name;
	public Customer(int id,String name,String loc) {
		this.id=id;
		this.name=name;
		this.loc=loc;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int num) {
		this.id = num;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
