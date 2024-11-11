package com.example.niharika;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.example.niharika.Dao.CustomerDao;
import com.example.niharika.Services.CustomerService;
import com.example.niharika.entity.Customer;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private CustomerDao customerDao;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args)	throws Exception{
		
		//save all the customers information 
		//customerService.saveAllCustomers(getCustomersData());
		
		//PageSize = 5, pageNo= 0 ,TotalRecords = 15, No of pages = 3(0 to 2)
//		List<Customer> customers = customerService.getCustomerInfo(2,5);
		
		//Displaying the page of customers information
       // customers.forEach(e->System.out.println(e));
		
		//customerName --- Entity class FieldName
		//customerService.getAllCustomerInSortingOrder("asc","customerName","customerLocation","customerId");
		
		customerService.getCustomerInfo();
	}
	
	
	public List<Customer> getCustomersData(){
		Customer customer1 = new Customer("Mahesh","Hyderabad1");
		Customer customer2 = new Customer("Suresh","Hyderabad2");
		Customer customer3 = new Customer("Rajesh","Hyderabad3");
		Customer customer4 = new Customer("Venkat","Hyderabad4");
		Customer customer5 = new Customer("Anil","Hyderabad5");
		Customer customer6 = new Customer("Kalyan","Hyderabad6");
		Customer customer7 = new Customer("Pavan","Hyderabad7");
		Customer customer8 = new Customer("Vishal","Hyderabad8");
		Customer customer9 = new Customer("Murali","Hyderabad9");
		Customer customer10 = new Customer("Manoj","Hyderabad10");
		Customer customer11 = new Customer("Sudeep","Hyderabad11");
		Customer customer12 = new Customer("Suman","Hyderabad11");
		Customer customer13 = new Customer("Vinay","Hyderabad13");
		Customer customer14 = new Customer("Rajesh","Hyderabad14");
		Customer customer15 = new Customer("Ramya","Hyderabad15");
		
		//Java9 style for creating Immutable collection
		List<Customer> customers = 
				List.of(customer1,customer2,customer3,customer4,customer5,customer6,
						customer7,customer8,customer9,customer10,customer11,customer12,
						customer13,customer14,customer15);
		return customers;
	}

}
