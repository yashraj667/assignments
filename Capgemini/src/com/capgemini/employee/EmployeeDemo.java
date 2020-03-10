package com.capgemini.employee;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp= new Employee();
		emp.setEmpId(100);
		emp.setEmpName("Trisha");
		//Employee emp= new Employee();
		emp.setEmpId(10);
		emp.setEmpName("Tri");
		
		Scanner scr =new Scanner(System.in);
		System.out.println("Enter id");
		int empId=scr.nextInt();
		System.out.println("Enter first name");
		String fname=scr.next();
		System.out.println("Enter last name");
		String lname=scr.next();
		System.out.println("Enter salary");
		float sal=scr.nextFloat();
		System.out.println("Enter hike");
		int hike=scr.nextInt();
		
		Employee emp2=new Employee();
		emp2.setFirstName(fname);
		emp2.setLastData(lname);
		emp2.setSal(sal);
		emp2.setHike(hike);
		System.out.println(emp2.getSal());
		System.out.println(emp2.calculateSalary(hike));
		
		System.out.println(emp2.getFirstName()+" "+emp2.getLastData());
		
		
		
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpId());
	}

}
