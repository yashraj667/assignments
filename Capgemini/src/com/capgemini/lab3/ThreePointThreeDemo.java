package com.capgemini.lab3;
import java.util.Scanner;
public class ThreePointThreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreePointThree threepointthree = new ThreePointThree();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter day : ");
		int days = scan.nextInt();
		System.out.println("Enter month : ");
		int months = scan.nextInt();
		System.out.println("Enter year : ");
		int years = scan.nextInt();
		
		System.out.println(threepointthree.duration(days, months, years));
		
		scan.close();
	}

}
