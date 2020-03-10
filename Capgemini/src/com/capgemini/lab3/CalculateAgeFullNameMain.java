package com.capgemini.lab3;
import java.util.Scanner;
public class CalculateAgeFullNameMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the day ");
		int day = sc.nextInt();
		System.out.println("enter the month ");
		int month = sc.nextInt();
		System.out.println("enter the year");
		int year = sc.nextInt();
		System.out.println("enter your first name");
		String firstName = sc.next();
		System.out.println("enter your last name ");
		String lastName = sc.next();
		CalculateAgeFullName caf = new CalculateAgeFullName();
		System.out.println(caf.calculateAge(day, month, year));
		System.out.println(caf.fullName(firstName, lastName));
		sc.close();
	}
}
