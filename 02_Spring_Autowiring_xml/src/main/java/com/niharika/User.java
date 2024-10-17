package com.niharika;

public class User {
	
	private Address address;
	private Role role;
	private String name;
	public User(Address address, Role role,String name) {
		System.out.println("User class constructor called....");
		this.address =address;
		this.role=role;
		this.name = name;
	}
	public void setAddress(Address address) {
		System.out.println("setterforAddress called");
		this.address = address;
	}
	public void setRole(Role role) {
		System.out.println("setterforRole called");
		this.role = role;
	}
	
	//Business method
	public void getUserDetails(String userId) {
		System.out.println("UserID:" + userId);
		System.out.println("User Address details:"+ address);
		System.out.println("User role details:"+ role);
		System.out.println("User name::"+ name);
	}

}