package com.example.niharika.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages="com.example.niharika.repository.order",
entityManagerFactoryRef = "orderEntityManagerFactory",
transactionManagerRef ="getOrderPTM"
)
public class OrderDataSource {
	
	@Bean
	@ConfigurationProperties("order.datasource") //this is used for reading config from application.properties
	DataSourceProperties getDataSourceProperties() {
		return new DataSourceProperties();
	}
	
	@Bean
	@ConfigurationProperties("order.datasource.configuration") 
	DataSource getDatasource() {
		return getDataSourceProperties().initializeDataSourceBuilder().type(BasicDataSource.class).build();	
		
	}
	

}
