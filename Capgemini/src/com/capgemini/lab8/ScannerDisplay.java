package com.capgemini.lab8;

import java.io.File;
import java.util.Scanner;

public class ScannerDisplay {

	public static void main(String[] args)
	{
		File f = new File("numbers.txt");
		Scanner sc = new Scanner(System.in);
		int lineNumber = 1;
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            for(int i = 0;i<sc.hasNextLine();i++)
            System.out.println("line " + lineNumber + " :" + line);
            lineNumber++;
        }      

	}

}
