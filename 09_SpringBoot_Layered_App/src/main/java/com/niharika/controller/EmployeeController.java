package com.niharika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.niharika.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	public void addingNewEmployee() {
		employeeService.createBrandNewEmployee();
		
	}
    public void addingNewEmployees() {
    	employeeService.createBrandNewEmployees();
    }
    
    public void addingNewEmployeeNamedParameterJDBC() {
    	employeeService.createBrandNewEmployeeNamedParameter();
    }
}
