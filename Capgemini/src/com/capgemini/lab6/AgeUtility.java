package com.capgemini.lab6;

public class AgeUtility {
	public static void ageValidation(int age) throws UserException {
		if(age<15)
			throw new UserException("Age should be greater then 15");
	}
}	
