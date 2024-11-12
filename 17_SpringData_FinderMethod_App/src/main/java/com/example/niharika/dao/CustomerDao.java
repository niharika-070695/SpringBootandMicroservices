package com.example.niharika.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import com.example.niharika.entity.Customer;

public interface CustomerDao extends CrudRepository<Customer,Serializable>{
	
	//1.single column finder methods
	public List<Customer> findByName(String name);
	
	public List<Customer> findByLocation(String location);
	
	//2. single column finder method with pagination support
	public Page<Customer> findByLocation(String location,Pageable pageable);
	
	//3. Multiple columns finder methods using conjunction operator 
	public List<Customer> findByNameAndLocation(String name, String location);
	
	//4.Multiple columns finder methods using conjunction operator with sorting capability
	public List<Customer> findByNameAndLocation(String name, String location,Sort sort);
	
	public Integer countByName(String name);
	
	//5. finder methods on billAmount field
	public Iterable<Customer> findByBillAmountLessThan(float billAmount);
	
	public Iterable<Customer> findByBillAmountGreaterThan(float billAmount);
	
	public Iterable<Customer> findByBillAmountBetween(float startBillAmount, float endBillAmount);
	
	public List<Customer> findByNameAndBillAmount(String name, float billAmount);
	
	
	
	

}
