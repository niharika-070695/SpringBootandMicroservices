package com.example.niharika.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.niharika.dao.CustomerDao;
import com.example.niharika.entity.Customer;

import jakarta.transaction.Transactional;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	
	@Transactional
	public void getCustomerNameByCustomerId(int customerId) {
		String customerName = customerDao.fetchCustomerNameById(customerId);
		System.out.println("CustomerName :::" + customerName);
	}
	
	@Transactional
	public void getCustomerDetailsInfo(int customerId) {
		Map<String,Object> customerDetails = customerDao.fetchCustomerDetailsById(customerId);
		System.out.println("CustomerDetails Info :::"+ customerDetails);
	}
	
	@Transactional
	public void getCustomerDetailsById(int customerId) {
		Customer customerDetails = customerDao.fetchCustomerDetailsByCustomerId(customerId);
		System.out.println("Customer details::::"+ customerDetails);
	}
	
	@Transactional
	public void getAllCustomers() {
		List<Customer> customerDetails = customerDao.getAllCustomers();
		customerDetails.stream().forEach(c->System.out.println(c));
		
	}
	

}
