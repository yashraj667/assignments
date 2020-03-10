package com.capgemini.PersonDetails;

import java.util.Scanner;

enum gender{
	M,F
}

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String fname=kb.next();
		System.out.println("Enter Last Name: ");
		String lname=kb.next();
		System.out.println("Enter Gender: ");
		String gender=kb.next();
		System.out.println("Enter Phoneno ");
		String phoneno=kb.next();
		//Person p = new Person(fname,lname,gender,phoneno);
		if((gender.equals("M")) || (gender.equals("F"))) {
			Person p=new Person();
			p.setFirstname(fname);
			p.setLastname(lname);
			p.setGender(gender.charAt(0));
			p.setPhoneno(phoneno);
			System.out.println(p);
		
		}
		else
			System.out.println("Please enter correct gender i.r M or F");
	}
}
