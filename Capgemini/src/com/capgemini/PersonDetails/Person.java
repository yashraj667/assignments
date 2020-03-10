package com.capgemini.PersonDetails;

public class Person {
	private String firstname;
	private String lastname;
	private char gender;
	private String phoneno;
	
	
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender + ", phoneno="
				+ phoneno + "]";
	}
	
	/*
	public Person() {
		System.out.println("Default constructor is called");
	};
	public Person(String firstname,String lastname,String gender,String phoneno) {
		System.out.println("parameterized constructor is called");
		this.firstname=firstname;
		this.lastname=lastname;
		this.gender=gender;
		this.phoneno=phoneno;
		
	}
	*/
	
}
