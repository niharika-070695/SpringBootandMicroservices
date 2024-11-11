package com.example.niharika.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="niharika_employees")
public class Employee {
	
	@Id
	@Column(name="employee_id")
	@GenericGenerator(name="niharika_emp_seq",strategy = "com.example.niharika.generator.EmployeeGenerator")
	@GeneratedValue(generator = "niharika_emp_seq")
	private String employeeId;
	
	@Column(name = "employee_name")
	private String employeeName;
	
	@Column(name = "employee_salary")
	private Integer employeeSalary;
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Integer getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Integer employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	

}
