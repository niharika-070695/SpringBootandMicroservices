package com.niharika.client;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.niharika.beans.User;

public class DependencyObjectClient {

	public static void main(String[] args) {
		// Activating the Spring Container
		// DefaultListableBeanFactory is an implementation class for BeanFactory(I)
		DefaultListableBeanFactory dfb = new DefaultListableBeanFactory();

		// Loading the Spring configuration file
		XmlBeanDefinitionReader xmdr = new XmlBeanDefinitionReader(dfb);
		xmdr.loadBeanDefinitions("spring.xml");
		System.out.println("Spring Container got activated and " + "completed reading Spring Configuration file");

		// Requesting the spring bean from container by passing bean-id
		User u1 =  dfb.getBean(User.class);
		u1.getUserByRole("AT123");
	}
}
