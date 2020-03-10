package com.capgemini.customer1;

import java.util.Scanner;

import com.capgemini.lab6.UserException;


public class CusDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb =new Scanner(System.in);
		System.out.println("how many customer you want to add");
		int count=kb.nextInt();
		
		Cus[] aryCus= new Cus[count];
		
		for(int index=0;index<aryCus.length;index++) {
			String name;
			String accountNo;
			String deposite;
			
			while(true) {
				System.out.println("Enter account no");
				accountNo=kb.next();	
				try {
					Utalities.accountValidation(accountNo);
					break;
				} catch (UserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
			
			
			while(true) {
				System.out.println("Enter name");
				name=kb.next();	
				try {
					Utalities.nameValidation(name);
					break;
				} catch (UserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}	
			
			while(true) {
				System.out.println("Enter initial Amount");
				deposite=kb.next();	
				try {
					Utalities.InitialAmountValidation(deposite);
					break;
				} catch (UserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} 
			
			
			
			
			Cus c1=new Cus();
			c1.setAccountNo(Integer.parseInt(accountNo));
			c1.setName(name);
			c1.setAmount(Integer.parseInt(deposite));
			aryCus[index]=c1;
		}
		String check;
		while(true) {
		
		while(true) {
			System.out.println("Enter account no to check");
			check=kb.next();	
			
			try {
				Utalities.checkValidation(check);
				break;
			} catch (UserException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}	
		
		boolean checkCustomer=false;
		
		for(Cus c1: aryCus) {
			System.out.println(c1);
		}
		
		for(Cus c1: aryCus) {
			
			if(Integer.parseInt(check)==c1.getAccountNo()) {
				checkCustomer=true;
	
		while(true)  {
		System.out.println("Enter choice");
		int choice=kb.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Amount");
			System.out.println(c1.getAmount());
			break;
		case 2:
			String newDeposite;
			while(true) {
				System.out.println("Enter amount to deposite");
				newDeposite=kb.next();	
				boolean nameFlag=Utalities.depositePatternValidation(newDeposite);
				if (!nameFlag)
					System.out.println("please enter number only");
				else
				{
				boolean nameFlag1=Utalities.depositeValidation(newDeposite);
				if (!nameFlag1)
					System.out.println("you can deposite amount upto 1 lakh");
				else
					break;
				}
			}
			c1.deposite(Integer.parseInt(newDeposite));
			break;
		
		case 3:
			System.out.println("Enter amount to withdraw");
			double withdr=kb.nextDouble();
			c1.setWithdr(withdr);
			if(c1.withdraw(withdr)==true)
				System.out.println("Amount Withdrawn");
			else
				System.out.println("less balance");
			break;
		case 4:
			System.exit(1);
			break;
		default:
			System.out.println("Wrong choice");
		}
		}
			}
		}
		if(checkCustomer==false) {
			
		System.out.println("Customer does not exist");
			
		}
		}
		
	}

}
