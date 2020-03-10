package com.capgemini.customer;

import java.util.Scanner;

import com.capgemini.employee.Employee;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb =new Scanner(System.in);
		System.out.println("Enter name");
		String name=kb.next();
		System.out.println("Enter gender");
		String gender=kb.next();
		System.out.println("Enter deposite");
		double deposite=kb.nextDouble();
		System.out.println("Enter new deposite");
		double newdeposite=kb.nextDouble();
		
		
		Customer cus=new Customer();
		cus.setName(name);
		cus.setGender(gender);
		cus.setDeposite(deposite);
		cus.setNewDeposite(newdeposite);
		
		
		System.out.println("Net Amount: ");
		System.out.println(cus.NetBalance(newdeposite));
		
		System.out.println("Withdraw amount ");
		double withdr =kb.nextDouble();
		cus.setWithdr(withdr);
		
		if(cus.Withdraw(withdr)==true)
			System.out.println("Amount Withdrawn");
		else
			System.out.println("less balance");
				
	}

}
