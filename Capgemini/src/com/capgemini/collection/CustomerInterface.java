package com.capgemini.collection;

import java.util.List;

public interface CustomerInterface {
	public void addCustomer(CusCollection c);
	public List<CusCollection> displayCustomer();
	public boolean deleteCustomer(int accno);
	public boolean updateCustomer(int accno,String updateName);
		
	
}
