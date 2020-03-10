 package com.capgemini.lab6;

public class UserException extends Exception  {
	String msg;
	public UserException(String msg) {
		this.msg=msg;
		//System.out.println("Inside constructor");
	}
	
	public String getMessage() {
		return msg;
	}
}
