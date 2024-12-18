package com.niharika;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.niharika.controller.CustomerController;
import com.niharika.entity.Customer;
import com.niharika.service.CustomerServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		Customer customer = new Customer(101,"Samantha","Pennsylvania","samantha@infosys.com","9978653245");
//		CustomerController controller = context.getBean(CustomerController.class);
//		controller.createNewCustomer(customer);
		
		Customer customerA = new Customer(102,"Dhoni","Kansas","dhoni@google.com","8878676545");
//		CustomerServiceImpl csi = context.getBean(CustomerServiceImpl.class);
//		csi.createNewBrandCustomer(customer);
		
		Customer customer1 = new Customer(103,"Karthik","Denver","karthik@deloitte.com","9954453245");
		Customer customer2 = new Customer(104,"Mahesh","StLouis","mahesh@deloitte.com","9954453245");
		Customer customer3 = new Customer(105,"Kristina","Denver","kristina@deloitte.com","4254621245");
		Customer customer4 = new Customer(106,"Angela","Omaha","angela@deloitte.com","6754478945");
		
		CustomerController controller = context.getBean(CustomerController.class);
		controller.createNewCustomers(List.of(customer,customerA,customer1,customer2,customer3,customer4));
		
		
//		controller.fetchCustomerDetailsById(109);
		
//		controller.fetchAllCustomerDetailsByIds(List.of(103,104,101,105,108));
		
		controller.fetchAllCustomerDetails();
//		controller.fetchTotalCustomerCount();
		
//		Customer deletingCustomer = new Customer();
//		deletingCustomer.setCustomerId(106);
//		controller.removeCustomer(deletingCustomer);
		
//		controller.removeCustomerById(105);
		
		
		
	}
}
