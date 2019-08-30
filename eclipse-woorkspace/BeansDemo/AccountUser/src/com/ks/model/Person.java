package com.ks.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean,DisposableBean{
	
	int id;
	String name;
	Account account;
	
	public Person() {
		super();
	}
	
	public Person(int id, String name, Account account) {
		super();
		this.id = id;
		this.name = name;
		this.account = account;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public void invokeWithdraw(int amt) {
		account.withdraw(amt);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroying...!");
	}

	@Override
	public void afterPropertiesSet() {
		// TODO Auto-generated method stub
		System.out.println("Initialising...!");
	}
	

}
