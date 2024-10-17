package com.niharika.client;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.niharika.beans.*;
public class SpringClient {
	
	public static void main(String[] args) {
		//Activating the Spring Container
		//DefaultListableBeanFactory is an implementation class for BeanFactory(I)
		DefaultListableBeanFactory dfb = new DefaultListableBeanFactory();
		
		//Loading the Spring configuration file
		XmlBeanDefinitionReader xmdr = new XmlBeanDefinitionReader(dfb);
		xmdr.loadBeanDefinitions("spring.xml");
		System.out.println("Spring Container got activated and "
				+ "completed reading Spring Configuration file");
		
		//Requesting the spring bean from container by passing bean-id
		Demo demoBean = (Demo)dfb.getBean("demo");
		Demo demoBean1 = (Demo)dfb.getBean("demo");
		Demo demoBean2 = (Demo)dfb.getBean("demo");
		System.out.println(demoBean.hashCode());
		System.out.println(demoBean1.hashCode());
		System.out.println(demoBean2.hashCode());
		System.out.println("Topic Name:::" + demoBean);  //internally calls toString() of Demo class
		System.out.println("*****************************");
		Welcome wel = (Welcome)dfb.getBean("welcome");
		Welcome wel1 = (Welcome)dfb.getBean("welcome");
		Welcome wel2 = (Welcome)dfb.getBean("welcome");
		System.out.println(wel.hashCode());
		System.out.println(wel1.hashCode());
		System.out.println(wel2.hashCode());
		System.out.println("Wish Message:::" + wel);  //internally calls toString() of Welcome class
		System.out.println("*****************************");
		Test test = (Test)dfb.getBean("test");
		Test test1 = (Test)dfb.getBean("test");
		Test test2 = (Test)dfb.getBean("test");
		System.out.println(test.hashCode());
		System.out.println(test1.hashCode());
		System.out.println(test2.hashCode());
		System.out.println("*****************************");
		Display dis = (Display)dfb.getBean("display");
		System.out.println(dis.hashCode());
		System.out.println("*****************************");
		Student std = (Student)dfb.getBean("student");
		std.displayData();
		//another form of requesting SpringBean
		Student std1 = dfb.getBean(Student.class);
		std1.displayData();
	}

}
