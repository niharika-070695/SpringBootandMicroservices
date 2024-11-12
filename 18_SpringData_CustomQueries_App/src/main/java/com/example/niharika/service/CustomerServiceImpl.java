package com.example.niharika.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.niharika.dao.CustomerDao;
import com.example.niharika.entity.Customer;


@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	@Autowired
	private CustomerDao customerDao;

	@Override
	public void fetchCustomerDetailsUsingNativeQuery() {
		List<Customer> allCustomers = customerDao.getAllCustomersByNativeQuery();
		allCustomers.forEach(System.out::println);
	}

	@Override
	public void fetchCustomerDetailsUsingHqlQuery() {
		List<Customer> allCustomers = customerDao.getAllCustomers();
		allCustomers.forEach(System.out::println);
		
	}

	@Override
	public void fetchSelectedColumnsUsingNativeQuery() {
		List<Object[]> allCustomers = customerDao.getAllCustomersInfo();
		allCustomers.forEach(e->System.out.println(e[0]+"-----"+e[1]));

	}

	@Override
	public void fetchSelectedColumnsUsingHqlQuery() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fetchCustomerDetailsByCity(String location) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fetchCustomerDetailsByLocation(String location) {
		// TODO Auto-generated method stub

	}

}
