package com.cg.jdbc;

import java.util.Scanner;

public class JdbcMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		Employee1 emp=new Employee1();
		System.out.println("Enter EmpId");
		String empid=kb.next();
		System.out.println("Enter Empname");
		String empname=kb.next();
		System.out.println("Enter salary");
		String salary=kb.next();
		System.out.println("Enter city");
		String city=kb.next();
		
		emp.setEmpId(Integer.parseInt(empid));
		emp.setEmpName(empname);
		emp.setSalary(Integer.parseInt(salary));
		emp.setCity(city);
		
		JdbcCrudDemo Jdbc=new JdbcCrudDemo();
		Jdbc.addEmployee(emp);
		Jdbc.fetchEmployee();
		
		System.out.println("Enter Empid to delete the record");
		String id=kb.next();
		//Integer k=Integer.parseInt(id);
		//Integer j=Integer.parseInt(empid);
		//if(k.equals(j)) {
		//if(Integer.parseInt(empid)==Integer.parseInt(id)) {
			Jdbc.deleteEmployee(Integer.parseInt(id));
		//}
		//else
		//	System.out.println("Wrong Id entered");
		
		System.out.println("Enter Empid to update the record");
		String idupdate=kb.next();
		System.out.println("Enter Empname to update");
		String nameupdate=kb.next();
		System.out.println("Enter salary to update");
		String salupdate=kb.next();
		System.out.println("Enter city to update");
		String cityupdate=kb.next();
		Jdbc.updateEmployee(Integer.parseInt(idupdate),nameupdate,Integer.parseInt(salupdate),cityupdate);
	}

}
