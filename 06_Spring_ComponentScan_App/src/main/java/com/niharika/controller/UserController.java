package com.niharika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.niharika.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	public UserController() {
		System.out.println("UserController - Class");
		
	}
	
	public void display() {
		System.out.println("UserService :::"+ userService);
	}

}
