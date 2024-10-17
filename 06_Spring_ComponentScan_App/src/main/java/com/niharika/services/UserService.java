package com.niharika.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niharika.dao.UserDao;


@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public UserService() {
		System.out.println("UserService - Class");
		
	}
	
	public void display() {
		System.out.println("UserDao:::" + userDao);
	}

}
