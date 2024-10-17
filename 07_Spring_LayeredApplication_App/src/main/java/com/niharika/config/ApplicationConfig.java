package com.niharika.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource(value = "database.properties")
public class ApplicationConfig {
	
	
	@Value("${driverClassName}")
	private String driverClassName;
	
	@Value("${driverUrl}")
	private String driverUrl;
	
	@Value("${dbUserName}")
	private String userName;
	
	@Value("${dbPassword}")
	private String password;
	
	//preparing the DriverManagerDataSource Object
	
	@Bean
	public DriverManagerDataSource getDataSource() {
		
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName(driverClassName);
		dmds.setUrl(driverUrl);
		dmds.setUsername(userName);
		dmds.setPassword(password);
		return dmds;
		
	}
	
	//Preparing the JDBC template object
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(getDataSource());
		return jt;
		
	}

}
