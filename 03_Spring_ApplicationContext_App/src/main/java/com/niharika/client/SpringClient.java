package com.niharika.client;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.niharika.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringClient {

	
	public static void main(String[] args) {
		
		//working with BeanFactory i.e onDemand objects are creating
		//System.out.println("Bean Factory container...");
		//DefaultListableBeanFactory dflb = new DefaultListableBeanFactory();
		//
		//XmlBeanDefinitionReader xmdr = new XmlBeanDefinitionReader(dflb);
		//xmdr.loadBeanDefinitions("spring.xml");

		
		//working with ApplicationContext i.e onDemand objects are creating
		ApplicationContext aplb = new ClassPathXmlApplicationContext("spring.xml");

//		Student std = aplb.getBean(Student.class);
//		System.out.println(std);
//		Course crs = aplb.getBean(Course.class);
//		System.out.println(crs);
			
		
	}
}
