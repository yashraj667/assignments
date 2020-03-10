package com.capgemini.lab4;


public abstract class Account {

		private static long accNo=10000;
		private double balance;
		private Person accHolder;
		
	/* Another way to initialize static variable	
		static {
			accNo=1000;
		}
	*/
		
		Account(){
			accNo++;
		}
		
		public static long getAccNo() {
			return accNo;
		}
		public static void setAccNo(long accNo) {
			Account.accNo = accNo;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public Person getAccHolder() {
			return accHolder;
		}
		public void setAccHolder(Person accHolder) {
			this.accHolder = accHolder;
		}
		
		public void deposite(double depositeAmount) {
			 this.balance+=depositeAmount;
		}
		
		public abstract boolean withdrawsaving(double withdr);
		public abstract boolean withdrawcurrent(double withdr);
		
		
		@Override
		public String toString() {
			return "Account [accNo=" + accNo + ", balance=" + balance + ", accHolder=" + accHolder + "]";
		}
}

