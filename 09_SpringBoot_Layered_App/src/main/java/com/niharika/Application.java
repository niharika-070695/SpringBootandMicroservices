package com.niharika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.niharika.controller.EmployeeController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeController empController = context.getBean(EmployeeController.class);
		
		//calling single record empController
		//empController.addingNewEmployee();
		
		//calling bulk employees
		//empController.addingNewEmployees();
		
		//calling single record namedParameterJDBC empController
		empController.addingNewEmployeeNamedParameterJDBC();
	}

}
