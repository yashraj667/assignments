package com.capgemini.lab6;

import java.util.Scanner;

public class FullName {

	public static void main(String[] args) 
	{
		/*Scanner scr =new Scanner(System.in);
		System.out.println("Enter first name");
		String fname=scr.next();
		System.out.println("Enter last name");
		String lname=scr.next(); */
		String fname="yash";
		String lname="raj";
		try {
			if(fname.equals("")|| lname.equals(""))
			throw new UserException("The name cannot be blank");
			System.out.println(fname+" "+lname);
		}catch(UserException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Fianlly ststement");
		}
	}

}
