package com.capgemini.lab7;

import java.util.Scanner;


public class Employee 
{
private int id;
private String name;
private double salary;
private String designation;
private String insuranceScheme;



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



public double getSalary() {
	return salary;
}



public void setSalary(double salary) {
	this.salary = salary;
}



public String getDesignation() {
	return designation;
}



public void setDesignation(String designation) {
	this.designation = designation;
}



public String getInsuranceScheme() {
	return insuranceScheme;
}



public void setInsuranceScheme(String insuranceScheme) {
	this.insuranceScheme = insuranceScheme;
}



	@Override
public String toString() {
	return "productHashMap [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
			+ ", insuranceScheme=" + insuranceScheme + "]";
}

//	public void addEmployee(Employee emp)
//	{
//		
//		
//	}
//	public Employee(int id, String name, double salary, String designation, String insuranceScheme) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//		this.designation = designation;
//		this.insuranceScheme = insuranceScheme;
//	}



	public boolean deleteEmployee(int id, String name)
	{
		return false;
		
		
	}

	

}
