package com.example.niharika.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.niharika.entity.Employee;

public interface EmployeeDao extends MongoRepository<Employee,String> {
	
	//Finder method
	public Optional<Employee> findByNameAndDesignation(String name, String designation);
	
	//Query method
	@Query(value= "{designation: ?0}")
	public List<Employee> getAllEmployeesByDesignation(String designation);

}
