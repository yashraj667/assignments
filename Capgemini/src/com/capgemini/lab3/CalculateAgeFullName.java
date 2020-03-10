package com.capgemini.lab3;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAgeFullName {
	
	private int day;
	private int month;
	private int year;
	private String firstName;
	private String lastName;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String calculateAge(int day, int month, int year) {
		LocalDate todayDate = LocalDate.now();
		LocalDate userInput = LocalDate.of(year, month, day);
		Period pe = Period.between(userInput, todayDate);
		int dy = pe.getDays();
		int mo = pe.getMonths();
		int yr = pe.getYears();

		return yr + " year " + mo + " month " + dy + " day";

	}

	public String fullName(String firstName, String lastName) {
		return "Full name is " + firstName + " " + lastName;

	}
}
