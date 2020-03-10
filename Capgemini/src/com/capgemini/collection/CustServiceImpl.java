package com.capgemini.collection;

import java.util.ArrayList;
import java.util.List;

public class CustServiceImpl implements CustomerInterface
{
List <CusCollection> cusList=new ArrayList<CusCollection>();
	@Override
	public void addCustomer(CusCollection cust) {
		// TODO Auto-generated method stub
		System.out.println(cust);
		cusList.add(cust);
	}

	@Override
	public List<CusCollection> displayCustomer() {
		// TODO Auto-generated method stub
		return cusList;
	}

	@Override
	public boolean deleteCustomer(int accno) {
		// TODO Auto-generated method stub
		boolean available=false;
		for(CusCollection c1:cusList) {
			if(c1.getAccountNo()==accno) {
				cusList.remove(c1);
				available=true;
				break;
			}
		}
		return available;
	}

	@Override
	public boolean updateCustomer(int accno, String updateName) {
		// TODO Auto-generated method stub
		boolean available=false;
		for(CusCollection c1:cusList) {
			if(c1.getAccountNo()==accno) {
				c1.setName(updateName);
				available=true;
				break;
			}
		}
		return available;
	}
	
}
