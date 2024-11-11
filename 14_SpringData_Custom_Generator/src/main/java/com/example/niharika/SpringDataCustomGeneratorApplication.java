package com.example.niharika;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.niharika.dao.EmployeeDao;
import com.example.niharika.entity.Employee;

@SpringBootApplication
public class SpringDataCustomGeneratorApplication implements CommandLineRunner {

	@Autowired
	private EmployeeDao employeeDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringDataCustomGeneratorApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Employee e = new Employee();
		e.setEmployeeName("Sachin");
		e.setEmployeeSalary(25000);
		Employee savedEmployee = employeeDao.save(e);
		System.out.println("Employee Id::::"+ savedEmployee.getEmployeeId());
		
	}
	
	

}
