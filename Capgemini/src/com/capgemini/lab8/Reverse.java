package com.capgemini.lab8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Reverse {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fis= new FileInputStream("krishan.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String value = br.readLine();
		System.out.println(br);
		StringBuffer sb = new StringBuffer(value);
		StringBuffer rev = sb.reverse();
		String str = rev.toString();
		System.out.println(str);
		FileWriter fw = new FileWriter("reverse.txt");
		fw.write(str);
		
		fw.close();
		br.close();
		fis.close();

	}

}
