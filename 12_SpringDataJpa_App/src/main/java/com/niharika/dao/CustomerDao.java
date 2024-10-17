package com.niharika.dao;

import org.springframework.data.repository.CrudRepository;

import com.niharika.entity.Customer;

//Automatically considers as spring bean and we can auto wire anywhere in application
public interface CustomerDao extends CrudRepository<Customer, Integer> {

}
