package com.capgemini.lab6;

import java.util.Scanner;

import com.capgemini.customer1.Utalities;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter age");
		int age=kb.nextInt();	
		try {
			AgeUtility.ageValidation(age);
			System.out.println("Age is "+age);
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
