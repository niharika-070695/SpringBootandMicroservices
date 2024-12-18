package com.niharika.service;

import java.util.List;
import java.util.Optional;

import com.niharika.entity.Customer;

public interface CustomerService {

	public Customer createNewBrandCustomer(Customer customer);
	
	public Iterable<Customer> createBulkNewBrandCustomer(List<Customer> customers);
	
	public Optional<Customer> getCustomerById(Integer customerId);
	
	public Optional<Iterable<Customer>> getAllCustomersByIds(List<Integer> ids);
	
	public Optional<Iterable<Customer>> getAllCustomers();
	
	public int getCountOfAllRecords();
	public void deleteCustomer(Customer customer);
	public void deleteCustomerById(Integer customerId);

}
