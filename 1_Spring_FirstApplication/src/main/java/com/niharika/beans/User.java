package com.niharika.beans;

public class User {
	
	//Requires role object
	private Role role;
	
	
	public User() {
		System.out.println("User class constructor");
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	public void getUserByRole(String userId) {
		String roleName = role.getRoleByUserId(userId);
		System.out.println("Role checking::::" + "HRADMIN".equals(roleName));
		
	}
}
