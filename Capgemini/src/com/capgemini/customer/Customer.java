package com.capgemini.customer;

public class Customer {
	private String name;
	private String gender;
	private double deposite;
	private double newDeposite;
	private double withdr;
		
	public double getWithdr() {
		return withdr;
	}
	public void setWithdr(double withdr) {
		this.withdr = withdr;
	}
	public double getNewDeposite() {
		return newDeposite;
	}
	public void setNewDeposite(double newDeposite) {
		this.newDeposite = newDeposite;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getDeposite() {
		return deposite;
	}
	public void setDeposite(double deposite) {
		this.deposite = deposite;
	}
	
	public double NetBalance(double NewDeposite) {
		return this.deposite+=newDeposite;
	}
	
	public boolean Withdraw(double withdr) {
		if(this.deposite> withdr) {
			this.deposite-=withdr;
			return true;
		}
		else {
			return false;
		}
	}
	
}
