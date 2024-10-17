package com.niharika.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niharika.bean.Employee;
import com.niharika.dao.EmployeeDao;
import com.niharika.util.EmployeeUtils;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private EmployeeUtils employeeUtils;
	
	

	@Override
	public void createBrandNewEmployee() {
		//Get the single record from employeeUtility method
		Employee emp = employeeUtils.getAllEmployeesInfo().get(0);
		
		//passing this employee object to DAO method
		boolean recordStatus = employeeDao.createNewEmployee(emp);
		if(recordStatus) {
			System.out.println("Employee Record is created....");
		}else {
			System.out.println("Employee record is not created....");
		}

	}

	@Override
	public void createBrandNewEmployees() {
		//getting all the records from employee utility method
		List<Employee> allEmployees = employeeUtils.getAllEmployeesInfo();
		
		//calling DAO method
		int createdCount = employeeDao.createNewEmployees(allEmployees);
		
		//checking logic
		if(allEmployees.size() == createdCount) {
			System.out.println("All records are processed successfully in Service layer.....");
		}
		
	}

	@Override
	public void createBrandNewEmployeeNamedParameter() {
		//Get the single record from employeeUtility method
				Employee emp = employeeUtils.getAllEmployeesInfo().get(0);
				//passing this employee object to DAO method
				boolean recordStatus = employeeDao.createNewEmployeeWithNamedParameterJdbcTemplate(emp);
				if(recordStatus) {
					System.out.println("Employee Record is created ....");
				}else {
					System.out.println("Employee record is not created....");
				}
		
		
	}

}
