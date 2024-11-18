package com.example.niharika.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.niharika.entity.Customer;

public interface CustomerDao extends MongoRepository<Customer,Integer> {

}
