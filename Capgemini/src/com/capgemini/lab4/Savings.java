package com.capgemini.lab4;

public class Savings extends Account {
	private final double minBalance=1000;
	private final double draftlimit=-10000;
	
	public boolean withdrawsaving(double amount) {
		if(minBalance<=super.getBalance()-amount && super.getBalance()>=minBalance) {
			super.setBalance(super.getBalance()-amount);
			return true;	
		}
		else 
			return false;
	}
	
	public boolean withdrawcurrent(double amount) {
		if((draftlimit<=super.getBalance()-amount) && (amount>0)) {
			super.setBalance(super.getBalance()-amount);
			return true;	
		}
		else 
			return false;
	}
}
