package com.niharika.beans;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Properties;

public class Student {
	//simple dependencies
	private String id;
	private String name;
	
	//Collection dependencies
	private Set<String> contactNos;
	private List<String> emailId;
	private Map<String,String> qualifications;
	private String[] courseNames;
	private Properties dbProperties;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setContactNos(Set<String> contactNos) {
		this.contactNos = contactNos;
	}
	
	public void setEmailId(List<String> emailId) {
		this.emailId = emailId;
	}
	
	public void setQualifications(Map<String, String> qualifications) {
		this.qualifications = qualifications;
	}
	
	public void setCourseNames(String[] courseNames) {
		this.courseNames = courseNames;
	}
	public void setDbProperties(Properties dbProperties) {
		this.dbProperties = dbProperties;
	}
	
	//service method to display data
	public void displayData() {
		System.out.println("Student Id ::::"+ id);
		System.out.println("Student Name ::::"+ name);
		System.out.println("Student Contact ::::"+ contactNos);
		System.out.println("Student Qualification ::::"+ qualifications);
		System.out.println("Student Courses:::"+ Arrays.toString(courseNames));
		System.out.println("Student EmailIds:::"+ emailId);
		System.out.println("Database Properties:::"+ dbProperties);
	}
	

}
