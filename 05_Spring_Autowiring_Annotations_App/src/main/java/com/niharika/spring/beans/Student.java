package com.niharika.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private String id;
	
	private String name;
	
	//Declaring Autowired annotation on top of field
	@Autowired
	@Qualifier("address1")
	private Address address;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void displayStudentDetails() {
		System.out.println("Student Id:::"+ id);
		System.out.println("Student Name:::"+ name);
		System.out.println(address);
		
	}

}
