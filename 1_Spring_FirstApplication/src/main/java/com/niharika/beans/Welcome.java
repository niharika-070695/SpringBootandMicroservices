package com.niharika.beans;

public class Welcome {
	
	//simple dependency
	private String wishMessage;
	private String courseName;
	public Welcome() {
		System.out.println("Welcome class constructor....");
	}
   //Defining the parameterized constructor
	public Welcome(String wishMessage) {
		System.out.println("Spring container using Constructor to inject value for wishMessage property...");
		this.wishMessage = wishMessage;
		
	}
	//constructor with two arguments
	public Welcome(String wishMessage, String courseName) {
		System.out.println("Spring container using two-argument Constructor to inject value for wishMessage property and courseName property...");
		this.wishMessage = wishMessage;
		this.courseName = courseName;
	}
	
	@Override
	public String toString() {
		return wishMessage+ " "+courseName;
	}
}
