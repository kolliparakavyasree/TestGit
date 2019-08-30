package com.ks.model;

public class CurrentAccount implements Account {

	@Override
	public void withdraw(int amt) {
		// TODO Auto-generated method stub
		System.out.println("Withdrawing from current account: "+amt);
	}
	
}
