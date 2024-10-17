package com.niharika.spring.client;
import org.springframework.context.ApplicationContext;

import com.niharika.spring.beans.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringClient {
	
	public static void main(String[] args) {
		
		//Instantiating spring container
		ApplicationContext  dflb = new ClassPathXmlApplicationContext("spring.xml");
	
		//Requesting user Spring Bean from Spring container
		Student studentBean = dflb.getBean(Student.class);
		studentBean.displayStudentDetails();
		System.out.println(studentBean);
		
		 java.util.Date currentDate = dflb.getBean(java.util.Date.class);
		 System.out.println(currentDate);
	
	}
}
