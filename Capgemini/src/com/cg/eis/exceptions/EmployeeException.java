package com.cg.eis.exceptions;

import com.capgemini.lab6.UserException;

public class EmployeeException {
	public static void salaryValidation(String salary) throws UserException {
		if(Double.parseDouble(salary)<3000)
			throw new UserException("salary should be greater 3000");
	}	
}
