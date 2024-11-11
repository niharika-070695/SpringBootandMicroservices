package com.example.niharika;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.niharika.entity.Customer;
import com.example.niharika.service.CustomerService;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private CustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		Customer customer = new Customer();
		customer.setCustomerName("Akash");
		customer.setCustomerLocation("Mumbai");
		//calling the saveCustomer
//		Customer savedCustomer = customerService.createNewBrandCustomerUsingSaveAndFlush(customer);
//		System.out.println(savedCustomer);
		
		//calling the delete customers
		//customerService.terminateCustomers(List.of(566,602,652));
		
		//getting customer details based on Id
		Customer customerInfo = customerService.fetchCustomerDetailsById(565);
		System.out.println(customerInfo);
		
		
//		Customer customerInfo = customerService.fetchCustomerDetailsById(552);
//		System.out.println(customerInfo);
	}
	
}
