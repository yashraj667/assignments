package com.capgemini.lab10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PersonProps {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties p=new Properties();
		FileOutputStream fos=new FileOutputStream("PersonProps.properties");
		p.setProperty("Name", "Trisha");
		p.setProperty("Gender", "Female");
		p.setProperty("Age", "22");
		p.store(fos, "Person Details");
		p.clear();
		
		FileInputStream fis=new FileInputStream("PersonProps.properties");
		p.load(fis);
		System.out.println(p.getProperty("Name"));
		System.out.println(p.getProperty("Gender"));
		System.out.println(p.getProperty("Age"));
	}

}
