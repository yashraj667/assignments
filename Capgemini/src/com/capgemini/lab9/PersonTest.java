package com.capgemini.lab9;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void  testGetFullName()  {
		System.out.println("from TestPerson");   
		Person per = new Person("Robert","King");   
		assertEquals("Robert King",per.getFullName());  
		}   
	@Test (expected=IllegalArgumentException.class) 
	public void testNullsInName() {   
		System.out.println("from TestPerson testing exceptions");  
		Person per1 = new Person(null,null);    
		} 
	}



