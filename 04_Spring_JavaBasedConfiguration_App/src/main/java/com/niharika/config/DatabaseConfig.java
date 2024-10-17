package com.niharika.config;
import org.springframework.context.annotation.Configuration;
import com.niharika.beans.*;
import org.springframework.context.annotation.Bean;

@Configuration
public class DatabaseConfig {
	
	public DatabaseConfig() {
		System.out.println("Database config class constructor...");
	}
	
	//another spring bean definitions related to Database config
	@Bean
	public Database getDataSource() {
		return new Database();
	}

}
