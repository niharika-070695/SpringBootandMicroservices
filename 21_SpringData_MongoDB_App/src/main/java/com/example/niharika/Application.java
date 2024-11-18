package com.example.niharika;

import java.util.UUID;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.niharika.dao.CustomerDao;
import com.example.niharika.dao.EmployeeDao;
import com.example.niharika.entity.Employee;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private EmployeeDao employeeDao;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//creating Employee object
		Employee emp = new Employee();
		//setting id property value explicitly
// 	    System.out.println("UUID.randomUUID().toString()" + UUID.randomUUID().toString());
		emp.setId(UUID.randomUUID().toString());
     	emp.setName("Rahul");
		emp.setEmailIds(new String[] {"rahul@gmail.com","kalyan@yahoo.com"});
		emp.setDesignation("Data Engineer");
		emp.setContactNo("989765432");
		
		//saving the emp object information
		Employee savedEmployee = employeeDao.insert(emp);
		
		//displaying the saved employee
		System.out.println("Employee Record got created::::" + savedEmployee);
		System.out.println("********************");
//
		Optional<Employee> employeeOpt = employeeDao.findByNameAndDesignation("Paavan", "System Engineer");
		if(employeeOpt.isPresent()) {
			System.out.println(employeeOpt.get());
		}
		else {
			System.out.println("Employee Not Found");
		}
		
		System.out.println("*****************");
		List<Employee>  allEmployees = employeeDao.getAllEmployeesByDesignation("System Engineer");
		allEmployees.forEach(System.out::println);
	}

}
