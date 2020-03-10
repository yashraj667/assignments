package com.capgemini.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class CusDemoCollection {

	public static void main(String[] args) {
		
		Scanner kb =new Scanner(System.in);
		
		//List<CusCollection> a1= new ArrayList<CusCollection>(); 
		CustServiceImpl imp=new CustServiceImpl();
		while(true) {
			System.out.println("Enter 1 to add new cus"+"\nEnter 2 to display all"+"\nEnter 3 to exit"+"\nEnter 4 to Delete"+"\nEnter 5 to search");
			int option=kb.nextInt();
			switch(option) {
			case 1:
				System.out.println("Enter name: ");
				String name=kb.next();
				System.out.println("Enter accno: ");
				String accno=kb.next();
				CusCollection c=new CusCollection();
				c.setName(name);
				c.setAccountNo(Integer.parseInt(accno));
				//a1.add(c);
				System.out.println(c);
				imp.addCustomer(c);
				break;
			case 2:
				System.out.println(imp.displayCustomer());
				break;
			case 3:
				System.exit(1);
			case 4:
				System.out.println("Enter accno to delete");
				String acc=kb.next();
				boolean delete=  imp.deleteCustomer(Integer.parseInt(acc));
				if(delete)
					System.out.println("delete");
				else
					System.out.println("Wrong acc no is provided");
				break;
			case 5:
				System.out.println("Enter accno to upadte");
				String acc1=kb.next();
				System.out.println("Enter updated name");
				String updatename=kb.next();
				boolean update=  imp.updateCustomer(Integer.parseInt(acc1),updatename);
				if(update)
					System.out.println("updated");
				else
					System.out.println("Wrong acc no is provided");
				break;
			default:
				System.out.println("enter correct option");
			}
		}
	}
}	
		
		
		
		