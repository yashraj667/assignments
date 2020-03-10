package com.capgemini.customer1;

public class Cus {
	private String name;
	private int accountNo;
	private double amount;
	private double depositeAmount;
	private double withdr;
	
	
	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getDepositeAmount() {
		return depositeAmount;
	}

	public void setDepositeAmount(double depositeAmount) {
		this.depositeAmount = depositeAmount;
	}

	public double getWithdr() {
		return withdr;
	}

	public void setWithdr(double withdr) {
		this.withdr = withdr;
	}

	public void deposite(double depositeAmount) {
		 this.amount+=depositeAmount;
	}
	
	public boolean withdraw(double withdr) {
		if(this.amount> withdr) {
			this.amount-=withdr;
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Cus [name=" + name + ", accountNo=" + accountNo + ", amount=" + amount + ", depositeAmount="
				+ depositeAmount + ", withdr=" + withdr + "]";
	}
	
	
}
