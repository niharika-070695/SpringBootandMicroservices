package com.niharika.dao;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.niharika.bean.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public boolean createNewEmployee(Employee emp) {
		int rowCount = jdbcTemplate.update("insert into niharika_emps values(?,?,?,?,?)",
				emp.getEmpId(),emp.getEmpName(),emp.getEmailId(),
				new java.sql.Date(new java.util.Date().getTime()),
				emp.getEmpName());
		
		return rowCount > 0;
	}

	@Override
	public int createNewEmployees(List<Employee> employeesList) {
		int rowCount = 0;
		for(Employee emp : employeesList) {
			rowCount += jdbcTemplate.update("insert into niharika_emps values(?,?,?,?,?)",
					                       emp.getEmpId(),emp.getEmpName(),emp.getEmailId(),
					                       new java.sql.Date(new java.util.Date().getTime()),
					                       emp.getEmpName());
			
		}
		//Ensuring that text file data and inserted no of rows matching or not
		if(employeesList.size() == rowCount) {
			System.out.println("All Records are processed succesfully in DAO....");
		}
		return rowCount;
		    
	}

	@Override
	public boolean createNewEmployeeWithNamedParameterJdbcTemplate(Employee emp) {
		//Passing named parameter values through Map object
		Map<String,Object> empMap = new HashMap<>();
		empMap.put("empId", emp.getEmpId());
		empMap.put("empName",emp.getEmpName());
		empMap.put("emailId",emp.getEmailId());
		empMap.put("createdDate",new java.sql.Date(new java.util.Date().getTime()));
		empMap.put("createdBy",emp.getEmpName());
		//passing empMap object to insert in db
		int rowCount = namedParameterJdbcTemplate.update("insert "
				+ "into niharika_emps values(:empId,:empName,:emailId,:createdDate,:createdBy)",empMap);
		System.out.println("Inserting into database through NamedParameterJdbc Template.....");
		return rowCount>0;
		
	}

	@Override
	public Map<String, Object> findEmployeeById(int employeeId) {
		Map<String,Object> employeeInfo  =jdbcTemplate.queryForMap("select * from niharika_emps"
				+ "where emp_id=?", employeeId);
		return employeeInfo;
	}

	@Override
	public List<Employee> findAllEmployees() {
		List<Employee> employees = jdbcTemplate.query("select * from niharika_emps",
				(resultSet,rowNumber)->{
					sysout
				});
	}
	
	

}
