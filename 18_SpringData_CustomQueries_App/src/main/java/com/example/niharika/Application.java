package com.example.niharika;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.niharika.dao.CustomerDao;
import com.example.niharika.service.CustomerService;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	public CustomerService customerService;
	
	@Autowired
	public CustomerDao customerDao;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("1.....Selecting data using Native query....");
		customerService.fetchCustomerDetailsUsingNativeQuery();
		
		System.out.println();
		System.out.println("2.....Selecting data using HQL....");
		customerService.fetchCustomerDetailsUsingHqlQuery();
		
		System.out.println();
		System.out.println("3.....Selecting columns data using Native Query...");
		customerService.fetchSelectedColumnsUsingNativeQuery();
		
		System.out.println();
		System.out.println("4.....Selecting columns data using Native Query...");
		customerService.fetchSelectedColumnsUsingHqlQuery();
		
		System.out.println();
		System.out.println("5.....Selecting Data Using HQL query based on Location with NamedParameters...");
		customerService.fetchCustomerDetailsByCity("Hyderabad");
		
		System.out.println();
		System.out.println("6.....Selecting Data Using HQL query based on Location with Index...");
		customerService.fetchCustomerDetailsByCity("Hyderabad");
		
		System.out.println();
		System.out.println("7.....Updating the customer details based on customerId using @Query...");
		customerDao.updateCustomerLocation("Hyderabad2", 752);
		
		System.out.println();
		System.out.println("8.....Deleting the customer details based on customerId using @Query...");
		int deleteCount = customerDao.deleteCustomersByLocation("Ranchi");
		System.out.println("Deleted customers..."+ deleteCount);
	}

}
