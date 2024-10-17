package com.niharika.dao;

import java.util.List;
import java.util.Map;

import com.niharika.bean.Employee;

public interface EmployeeDao {
	
	
	//create one new employee
	public boolean createNewEmployee(Employee employee);
	
	//creating bulk of new employees
	public int createNewEmployees(List<Employee> employeesList);
	
	//creating new employee with NamedParameterJdbcTemplate
	public boolean createNewEmployeeWithNamedParameterJdbcTemplate(Employee emp);
	
	//Performing the select queries
	public Map<String,Object> findEmployeeById(int employeeId);
	
	public List<Employee> findAllEmployees();

}
