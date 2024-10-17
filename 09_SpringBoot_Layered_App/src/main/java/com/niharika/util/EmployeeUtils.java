package com.niharika.util;
import java.util.List;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import org.springframework.stereotype.Component;

import com.niharika.bean.Employee;

@Component
public class EmployeeUtils {
	
	
	//Returning the List<Employee>
	public List<Employee> getAllEmployeesInfo(){
		
		List<Employee> empList = new ArrayList<>();
		try(FileReader fr = new FileReader("src/main/resources/niharika_employees.txt");
			BufferedReader br = new BufferedReader(fr);){
			String currentRecord;
			while((currentRecord = br.readLine()) != null) {
				
				 //getting the current line and splitting based on commas separated
				String recordValues[] = currentRecord.split(",");
			
				//extracting the values from each record
				Integer empId = Integer.valueOf(recordValues[0]);
				String empName = recordValues[1];
				String emailId = recordValues[2];
				
				//preparing employee object
				 empList.add(new Employee(empId,empName,emailId)) ; 
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return empList;
		
	}

}
