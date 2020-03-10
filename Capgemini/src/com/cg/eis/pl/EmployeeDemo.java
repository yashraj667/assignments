package com.cg.eis.pl;

import java.util.Scanner;

import com.capgemini.lab6.UserException;
import com.cg.eis.bean.Employee;
import com.cg.eis.exceptions.EmployeeException;
import com.cg.eis.service.EmployeeInsuranceSystem;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter Employee details");
		System.out.println("Enter ID");
		String id=kb.next();
		System.out.println("Enter Employee name");
		String name=kb.next();
		String salary;
		
		while(true) {
			System.out.println("Enter salary");
			salary=kb.next();
			try {
				EmployeeException.salaryValidation(salary);
				break;
			} catch (UserException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Enter Designation");
		String designation=kb.next();
		
		Employee emp=new Employee();
		emp.setId(Integer.parseInt(id));
		emp.setName(name);
		emp.setSalary(Double.parseDouble(salary));
		emp.setDesignation(designation);
		
		EmployeeInsuranceSystem Ins=new EmployeeInsuranceSystem();
		
		
		emp.setInsuranceScheme(Ins.InsuranceScheme(Double.parseDouble(salary), designation));
		System.out.println(emp.getInsuranceScheme());
		System.out.println(emp);
		
		
		
		
		
		
	}

}
