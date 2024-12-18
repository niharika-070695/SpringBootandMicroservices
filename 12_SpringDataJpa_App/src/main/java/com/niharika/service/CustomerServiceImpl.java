package com.niharika.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niharika.dao.CustomerDao;
import com.niharika.entity.Customer;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;   //Here CustomerDao is an interface. Implementation class
	                                     //will be injected internally

	@Override
	public Customer createNewBrandCustomer(Customer customer) {
		  //Creating record in the database table
		  Customer customerInfo = customerDao.save(customer);   // save method will return
		                                                        //inserted customer information
		  return customerInfo;
	}

	@Override
	public Iterable<Customer> createBulkNewBrandCustomer(List<Customer> customers) {
		 Iterable<Customer> savedCustomersInfo = customerDao.saveAll(customers);
		 return savedCustomersInfo;
	}

	@Override
	public Optional<Customer> getCustomerById(Integer customerId) {
		    Optional<Customer> customerDetails = customerDao.findById(customerId);
		    return customerDetails;
	}

	@Override
	public Optional<Iterable<Customer>> getAllCustomersByIds(List<Integer> ids) {
		Iterable<Customer> allCustomerDetails = customerDao.findAllById(ids);
		if(allCustomerDetails.iterator().hasNext()) {
			return Optional.of(allCustomerDetails);
		}else {
			return Optional.empty();
		}	
	}

	@Override
	public Optional<Iterable<Customer>> getAllCustomers() {
		Iterable<Customer> allCustomers = customerDao.findAll();
		if(allCustomers.iterator().hasNext()) {
			return Optional.of(allCustomers);
		}else {
			return Optional.empty();
		}	
		
	}

	@Override
	public int getCountOfAllRecords() {
		int count = (int)customerDao.count();
		return count;
	}

	@Override
	public void deleteCustomer(Customer customer) {
		customerDao.delete(customer);
	}

	@Override
	public void deleteCustomerById(Integer customerId) {
		customerDao.deleteById(customerId);
		
	}

	
}
