package iopack;

import java.io.Serializable;

public class Employee implements Serializable {

	private int Empid;
	private String EmpName;
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	

}
