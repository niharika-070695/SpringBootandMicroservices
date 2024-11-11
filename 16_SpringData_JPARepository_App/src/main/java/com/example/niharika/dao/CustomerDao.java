package com.example.niharika.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.niharika.entity.Customer;

public interface CustomerDao extends JpaRepository<Customer,Integer> {

}
