package com.niharika.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import com.niharika.beans.*;

//Representing Java class as Spring Configuration class which is equivalent to xml file
@Configuration
//Inheriting bean definitions from another configuration classes
@Import(value = {DatabaseConfig.class,EmailConfig.class})
@ImportResource("spring.xml")
//Informing about properties file to Spring container
@PropertySource(value= "database.properties")
public class AppConfig {
	
	@Value("${databaseUsername}")
	private String dbUserName;
	
	@Value("${databasePassword}")
	private String dbPassword;
	
	//Default constructor
	public AppConfig() {
		System.out.println("AppConfig class constructor...");
		
	}
	
	//Representing Java method as spring bean equivalent to Bean definition
	
	@Bean
	public User getUserObject() {
		
		
		Address address = getAddressObject();
		//Creating user object and injecting properties using Constructor injection
		User user = new User("Niharika","niharika@123",address);
		System.out.println("Databaseusername:::" + dbUserName);
		System.out.println("Databasepassword:::" + dbPassword);
		return user;
	}
	
	@Bean
	public Student getStudentObject() {
		
		//creating the student object
		Student student = new Student();
		
		//setting the values
		student.setId("AIT123");
		student.setName("Niharika");
		student.setLocation("Pennsylvania");
		//Injecting the address object into Student object
		student.setAddress(getAddressObject());
		
		return student;
		
	}
	
	@Bean
	public Address getAddressObject() {
		
		//creating the address object
		Address address = new Address();
		//setting values
		address.setDoorNo("420");
		address.setStreetName("Maywood");
		address.setCity("Mechanicsburg");
		
		return address;
		
	}

}
