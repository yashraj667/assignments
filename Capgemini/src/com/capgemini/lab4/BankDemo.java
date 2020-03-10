package com.capgemini.lab4;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter value for kathy");
		
		
		System.out.println("Enter Name: ");
		String name=kb.next();
		System.out.println("Enter age: ");
		String age=kb.next();
		
		Person accHolder = new Person();
		accHolder.setName(name);
		accHolder.setAge(Integer.parseInt(age));
		
	
		System.out.println("Enter balane: ");
		String balance=kb.next();
		
		Account act=new Savings();
		//act.setAccNo(Account.getAccNo());
		act.setBalance(Double.parseDouble(balance));
		act.setAccHolder(accHolder);
		
		
		System.out.println("Enter amount to withdraw from saving account");
		String amount=kb.next();
		boolean test=act.withdrawsaving(Double.parseDouble(amount));
		if(!test)
			System.out.println("Transaction failed. not enough balance");

		
		System.out.println(act);
		
		System.out.println("Enter amount to withdraw from current account account");
		String amount1=kb.next();
		boolean test1=act.withdrawcurrent(Double.parseDouble(amount1));
		if(!test1)
			System.out.println("Transaction failed. cant exceed overdraft limit i.e 10000 limit");

		
		System.out.println(act);
		
		
		System.out.println("********FOR SMITH*************");
		
		System.out.println("Enter value for smith");
		
		System.out.println("Enter Name: ");
		String name1=kb.next();
		System.out.println("Enter age: ");
		String age1=kb.next();
		
		Person accHolder1 = new Person();
		accHolder1.setName(name1);
		accHolder1.setAge(Integer.parseInt(age1));
		
		System.out.println("Enter balane: ");
		String balance1=kb.next();
		
		Account act1=new Savings();
		//act1.setAccNo(Account.getAccNo());
		act1.setBalance(Double.parseDouble(balance1));
		act1.setAccHolder(accHolder1);
		
		
		
		act1.deposite(2000);
		System.out.println("deposite to smith: "+act1.getBalance());
		//act.withdraw(3000);
		//System.out.println("deposite to kathy: "+act.getBalance());
		
		
		
		System.out.println(act1);
	}

}
