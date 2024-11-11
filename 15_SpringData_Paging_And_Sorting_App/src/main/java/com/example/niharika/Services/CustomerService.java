package com.example.niharika.Services;

import java.util.List;

import com.example.niharika.entity.Customer;

public interface CustomerService {
	
	//1. Method for saving customers information for dummy data
	public Iterable<Customer> saveAllCustomers(List<Customer> customers);
	
	//2.Method for Fetching records based on supplied pageNo
	public List<Customer> getCustomerInfo(int pageNo,int pageSize);
	
	//3.Method to perform sorting
	public void getAllCustomerInSortingOrder(String direction,String... args);
	
	//4.Method for Fetching all the pages of records
	public void getCustomerInfo();
	
	

}
