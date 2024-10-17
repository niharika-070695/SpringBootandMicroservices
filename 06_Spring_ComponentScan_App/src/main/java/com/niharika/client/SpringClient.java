package com.niharika.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import com.niharika.controller.UserController;
import com.niharika.services.UserService;

public class SpringClient {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		UserController uc =context.getBean(UserController.class);
		System.out.println(uc);
		uc.display();
		UserService us =context.getBean(UserService.class);
		System.out.println(us);
		us.display();
	}
}
