package com.niharika.client;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.niharika.User;

public class SpringClient {
	
	public static void main(String[] args) {
		DefaultListableBeanFactory dflb = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xbdr = new XmlBeanDefinitionReader(dflb);
		xbdr.loadBeanDefinitions("spring.xml");
		User userBean = dflb.getBean(User.class);
		userBean.getUserDetails("AIT123");
		
		
		
	}
	
	

}
