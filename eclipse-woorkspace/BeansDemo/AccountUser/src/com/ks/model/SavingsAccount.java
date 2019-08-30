package com.ks.model;

public class SavingsAccount implements Account {

	@Override
	public void withdraw(int amt) {
		// TODO Auto-generated method stub
		System.out.println("Withdrawing from savings account: "+amt);
	}

}
