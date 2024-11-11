package com.example.niharika.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.niharika.Dao.CustomerDao;
import com.example.niharika.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	//Injecting Dao object
	@Autowired
	private CustomerDao customerDao;
	
	
	@Override
	public Iterable<Customer> saveAllCustomers(List<Customer> customers) {
		Iterable<Customer> savedCustomers = customerDao.saveAll(customers);
		return savedCustomers;
	}

	@Override
	public List<Customer> getCustomerInfo(int pageNo, int pageSize) {
		
		//Creating Page Request for pulling customer based on pageNo and pageSize
		PageRequest pageableCustomer = PageRequest.of(pageNo, pageSize);
		
		//passing the page request object to findAll
		Page<Customer> pageCustomers = customerDao.findAll(pageableCustomer);
		
		//getting the content of page
		List<Customer> customerList = pageCustomers.getContent();
		
		return customerList;
	}

	@Override
	public void getAllCustomerInSortingOrder(String direction, String... sortedFieldName) {
		
		//Preparing the sort object
		Sort sortObj = Sort.by("ASC".equalsIgnoreCase(direction.toUpperCase())? Direction.ASC:Direction.DESC,sortedFieldName);
        Iterable<Customer> allCustomers = customerDao.findAll(sortObj);
        allCustomers.forEach(System.out::println);
	}

	@Override
	public void getCustomerInfo() {
		// TODO Auto-generated method stub
		//wanted to display all pages of information
				int pageSize = 5;
				//Getting the customers count from database table
				long customerCount = customerDao.count();
				
				//Find the page count
				long pageCount = customerCount/pageSize;
				
				//Modifying the pageCount
				pageCount = (customerCount % pageSize == 0)? pageCount : ++pageCount;
				
				//displaying the records page by page 
				for(int pageNo = 0; pageNo < pageCount; pageNo++) {
					
					PageRequest pageCustomers = PageRequest.of(pageNo, pageSize);
					//PageRequest pageCustomers = PageRequest.of(pageNo, pageSize,Sort.by(Direction.DESC,"customerName"));
					
					//Passing PageRequest object to findAll() 
					Page<Customer> customersPage = customerDao.findAll(pageCustomers);
					
					//getting the content from page
					System.out.println("Page No :: "+(pageNo+1)+ "  Records......");
					customersPage.getContent().forEach(System.out::println);
					
				}

	}

}
