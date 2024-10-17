package com.niharika.dao;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.niharika.bean.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public EmployeeDao() {
		System.out.println("EmployeeDao class...");
	}
	
	//the below method will perform inserting record into database
	public boolean createNewEmployee(Employee employee) {
		String INSERT_QUERY =  "insert into niharika_emps values(?,?,?,?,?);";
		int rowCount = jdbcTemplate.update(INSERT_QUERY, employee.getEmployeeId(),employee.getEmpName(),
				employee.getEmailId(),LocalDate.now(),employee.getCreatedBy());
		
		return rowCount > 0;
		
	}
}
