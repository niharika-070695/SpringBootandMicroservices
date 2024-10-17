package com.niharika.beans;

public class Course {
	
	private String id;
	
	private String name;
	private float fee;
	
	public Course() {
		System.out.println("Course class constructor..");
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setFee(float fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return name;
	}

}

