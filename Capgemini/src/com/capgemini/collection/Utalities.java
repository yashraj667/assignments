package com.capgemini.collection;


import com.capgemini.lab6.UserException;

public class Utalities {
	
	public static void nameValidation(String name) throws UserException {
		String pattern="[A-Za-z]{3,10}";
		if(!name.matches(pattern))
			throw new UserException("Enter name in alphabets only");
	}	
		
	public static void accountValidation(String accno) throws UserException {
		String pattern="[0-9]{3,10}";
		if(!accno.matches(pattern))
			throw new UserException("Enter account in digit only");
	}
	public static void InitialAmountValidation(String initialAmount) throws UserException {
		String pattern="[0-9]*";
		if(!initialAmount.matches(pattern))
			throw new UserException("Enter initial amount in digit only");
	}
	public static void checkValidation(String accno) throws UserException {
		String pattern="[0-9]{3,10}";
		if(!accno.matches(pattern))
			throw new UserException("Enter account in digit only");
	}
	public static boolean depositeValidation(String deposite) {
		if((Integer.parseInt(deposite)<100000)&&(Integer.parseInt(deposite)>0))
			
			return true;
		else
			return false;
	}
	public static boolean depositePatternValidation(String deposite) {
		String pattern="[0-9]*";
		if(deposite.matches(pattern))
			return true;
		else
			return false;
	}

}