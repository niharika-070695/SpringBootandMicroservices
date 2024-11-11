package com.example.niharika.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.niharika.dao.CustomerDao;
import com.example.niharika.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	@Autowired
	private CustomerDao customerDao;

	@Override
	public Customer createNewBrandCustomerUsingSaveAndFlush(Customer customer) {
		
		//we are using JPARepository interface methods
		Customer savedCustomer = customerDao.saveAndFlush(customer);
		return savedCustomer;
		
	}

	@Override
	public void terminateCustomers(List<Integer> customerIds) {
		//we are using JPARepository interface methods
		customerDao.deleteAllByIdInBatch(customerIds);
	}

	@Override
	public Customer fetchCustomerDetailsById(Integer customerId) {
		//we are using JPARepository interface methods
		//If supplied customerId is not present will throw an EntityNotFoundException
		Customer customerDetails = customerDao.getReferenceById(customerId);
		return customerDetails;
	}

	@Override
	public void fetchAllCustomers(Customer customer) {
		//we are using JPARepository interface methods
		List<Customer> allCustomers  = customerDao.findAll(Example.of(customer),Sort.by(Direction.DESC,"customerName"));
		//processing the collection
		allCustomers.forEach(System.out::println);
		
	}
}
