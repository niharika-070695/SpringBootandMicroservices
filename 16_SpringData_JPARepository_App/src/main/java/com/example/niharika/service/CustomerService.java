package com.example.niharika.service;

import java.util.List;

import com.example.niharika.entity.Customer;

public interface CustomerService {
	
	//saving the new customer
	public Customer createNewBrandCustomerUsingSaveAndFlush(Customer customer);
	
	//deleting all customers based on customerids
	public void terminateCustomers(List<Integer> customerIds);
	
	//Getting customerDetails based on customerId
	public Customer fetchCustomerDetailsById(Integer CustomerId);
	
	//Fetching all customer details based on Example object
	public void fetchAllCustomers(Customer customer);

}
