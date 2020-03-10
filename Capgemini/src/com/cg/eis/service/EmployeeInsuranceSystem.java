package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeInsuranceSystem implements EmployeeService {
	public String InsuranceScheme(double salary, String designation) {
		if (salary > 5000 && salary < 20000 && designation.equalsIgnoreCase("System Associate"))
			return "Scheme C";
		else if (salary >= 20000 && salary < 40000 && designation.equalsIgnoreCase("Programmer"))
			return "Scheme B";
		else if (salary >= 40000 && designation.equalsIgnoreCase("Manager"))
			return "Scheme A";
		else if (salary < 5000 && designation.equalsIgnoreCase("Clerk"))
			return "No Scheme";
		else
			return "Wrong Input";
	}
}
