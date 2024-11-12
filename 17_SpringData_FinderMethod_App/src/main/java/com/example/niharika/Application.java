package com.example.niharika;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.niharika.dao.CustomerDao;
import com.example.niharika.entity.Customer;
import com.example.niharika.services.CustomerService;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	public CustomerService customerService;
	
	@Autowired
	public CustomerDao customerDao;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		//Creating the customers
		//customerDao.saveAll(getCustomersData());
		
		//Fetching the customers
		System.out.println("1..... Finding the customers based on name..");
		customerService.fetchCustomersByName("Sachin");
		
		System.out.println("2..... Finding the customers based on name and location..");
		customerService.fetchCustomersByNameAndLocation("Kohli","Delhi");
		
		System.out.println("3..... Finding the customers based on location..");
		//2...records per page
		//1..Page no
		customerService.fetchCustomersByLocationWithPagination("Bangalore",2,1);
		
		System.out.println("4..... Finding the customers count based on customername..");
		customerService.getCountOfCustomerName("Dhoni");
		
		System.out.println("5..... Finding the customers count based on billamount..");
		customerService.fetchCustomersBetweenBillAmount(25000, 55000);
		
		
	}
	
	public List<Customer> getCustomersData(){
		Customer cust1 = new Customer("Sachin","Mumbai",35000);
		Customer cust2 = new Customer("Dravid","Bangalore",25000);
		Customer cust3 = new Customer("Ganguly","Kolkota",45000);
		Customer cust4 = new Customer("Dhoni","Ranchi",65000);
		Customer cust5 = new Customer("Kohli","Delhi",85000);
		Customer cust6 = new Customer("Gambhir","Delhi",45000);
		Customer cust7 = new Customer("Rohit","Mumbai",55000);
		Customer cust8 = new Customer("Bhuvaneswar","Bangalore",43000);
		Customer cust9 = new Customer("Ashwin","Mumbai",60000);
		Customer cust10 = new Customer("Yuvraj","Bhopal",72000);
		Customer cust11 = new Customer("KLRahul","Bangalore",58000);
		
		//Java9 style for creating Immutable collection
		List<Customer> customers = List.of(cust1,cust2,cust3,cust4,cust5,cust6,cust7,cust8,cust9,cust10,cust11);
		return customers;
	}

}
