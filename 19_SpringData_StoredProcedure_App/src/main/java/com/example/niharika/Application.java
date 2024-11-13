package com.example.niharika;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.niharika.service.CustomerService;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private CustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("1. Executing stored procedures with one input and one output....");
		customerService.getCustomerNameByCustomerId(760);
		
		System.out.println();
		System.out.println("2.Executing stored procedures with one input and one output as Map object...");
		customerService.getCustomerDetailsInfo(760);
		
		System.out.println();
		System.out.println("3.Executing stored procedures with one input and object as input...");
		customerService.getCustomerDetailsById(760);
		
		System.out.println();
		System.out.println("4.Executing stored procedures with object as output list of customers...");
		customerService.getAllCustomers();
	}

}
