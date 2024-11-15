package com.niharika.controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.niharika.entity.Customer;
import com.niharika.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	public void createNewCustomer(Customer customer) {
		//calling the service method from controller
		Customer customerDetails = customerService.createNewBrandCustomer(customer);

		//business logic
		if(Objects.nonNull(customerDetails)) {
			System.out.println("Customer created successfully......");
		    System.out.println(customerDetails);
		}else {
			System.out.println("Customer not created...");
		}
	}
	
	public void createNewCustomers(List<Customer> customers) {
		Iterable<Customer> allCustomers = customerService.createBulkNewBrandCustomer(customers);
		
		//Java8-foreach
		allCustomers.forEach(eachCustomer -> System.out.println(eachCustomer));
	}
	
	public void fetchCustomerDetailsById(Integer customerId) {
		Optional<Customer> customerDetails = customerService.getCustomerById(customerId);
		//Ensuring the data from optional object
		if(customerDetails.isPresent()) {
			//Data is present and need to get that customer data
			Customer customerData = customerDetails.get();
			System.out.println(customerData);
		}else {
			System.out.println("Customer details not found for given Id:::"+ customerId);
		}
	}
	
	public void fetchAllCustomerDetailsByIds(List<Integer> ids) {
		Optional<Iterable<Customer>> allcustomerDetails = customerService.getAllCustomersByIds(ids);
		allcustomerDetails.ifPresent(customers -> {
		    for (Customer customer : customers) {
		        System.out.println(customer);
		    }
		});
		
	}
	
	public void fetchAllCustomerDetails() {
		Optional<Iterable<Customer>> allCustomers = customerService.getAllCustomers();
		allCustomers.ifPresent(customers -> {
		    for (Customer customer : customers) {
		        System.out.println(customer);
		    }
		});
	}
	
	public void fetchTotalCustomerCount() {
		int totalcount = customerService.getCountOfAllRecords();
		System.out.println("Total no of customers present in table are::"+ totalcount);
	}
	
	public void removeCustomer(Customer customer) {
		customerService.deleteCustomer(customer);
		System.out.println("Customer deleted based on given entity....");
	}
	
	public void removeCustomerById(Integer custId) {
		customerService.deleteCustomerById(custId);
		System.out.println("Customer deleted based on given customer id...");
	}
}
