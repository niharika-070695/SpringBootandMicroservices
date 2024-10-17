package com.niharika.client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niharika.config.AppConfig;
import com.niharika.beans.*;

public class SpringClient {
	
	public static void main(String[] args) {
		
		//Instantiating spring container
		ApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
	
		//Requesting user Spring Bean from Spring container
		User userBean = context.getBean(User.class);
		System.out.println(userBean);
		
		System.out.println("**********");
		//Requesting student spring bean from Spring container
		Student studentBean = context.getBean(Student.class);
		System.out.println(studentBean);
		
		System.out.println("**********");
		Database databaseBean = context.getBean(Database.class);
		System.out.println(databaseBean);
		System.out.println("**********");
		Email emailBean = context.getBean(Email.class);
		System.out.println(emailBean);
		System.out.println("**********");
		Test testBean = context.getBean(Test.class);
		System.out.println(testBean);
		
		
	}

}
