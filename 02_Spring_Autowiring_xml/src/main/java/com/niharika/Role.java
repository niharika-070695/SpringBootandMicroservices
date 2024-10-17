package com.niharika;

public class Role {
	
	private String roleName;
	public Role() {
		System.out.println("Role class constrcutor called...");
	}
	
	public void setRoleName(String roleName) {
		System.out.println("setterforRoleName called");
		this.roleName = roleName;
	}
	
	@Override
	public String toString() {
		
		return roleName;
	}

}
