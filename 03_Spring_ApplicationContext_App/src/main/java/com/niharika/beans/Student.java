package com.niharika.beans;

public class Student {

	private String id;
	private String name;
	
	
	public Student() {
		System.out.println("Student class constructor..");
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return name;
		
	}
}
