package com.capgemini.employee;

public class Employee {
	private int empId;
	private String empName;
	private String firstName;
	private String lastData;
	private float sal;
	private float hike;
	
	
	
	public float getHike() {
		return hike;
	}
	public void setHike(float hike) {
		this.hike = hike;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastData() {
		return lastData;
	}
	public void setLastData(String lastData) {
		this.lastData = lastData;
	}
	
	public float calculateSalary(int hike) {
		return this.sal=this.sal*hike;
		
	}
	
}
