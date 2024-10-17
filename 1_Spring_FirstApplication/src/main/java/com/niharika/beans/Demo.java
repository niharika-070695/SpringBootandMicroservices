package com.niharika.beans;

public class Demo {
	
	//Simple Dependency
	private String topicName;
	public Demo() {
		System.out.println("Demo class constructor....");
	}

	//setter method for topicName
	public void setTopicName(String topicName) {
		System.out.println("Spring Container using setter method to inject value for topicName property---");
		this.topicName = topicName;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return topicName;
	}

}
