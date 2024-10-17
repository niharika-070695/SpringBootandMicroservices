package com.niharika.config;
import org.springframework.context.annotation.Configuration;
import com.niharika.beans.*;
import org.springframework.context.annotation.Bean;

@Configuration
public class EmailConfig {
	
	public EmailConfig() {
		System.out.println("Email config class constructor...");
	}
	
	//another spring bean definitions related to Email config
	@Bean
	public Email getEmailConfig() {
		return new Email();
		
	}
	

}
