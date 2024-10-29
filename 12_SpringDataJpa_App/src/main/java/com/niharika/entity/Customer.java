package com.niharika.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "shopping_customers")
public class Customer {

	@Id
	//Database column name(customer_id)
	@Column(name = "customer_id")
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="customer_seq")
//	@SequenceGenerator(name="customer_seq",sequenceName="shopping_customers_seq",
//	                      initialValue=1000,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer customerId;

	//Database column name(name) //matches and @Column annotation is optional
	private String name;

	//Database column name(location) //matches and @Column annotation is optional
	private String location;

	//Database column name(email)
	private String email;

	//Database column name(contact_no)
	@Column(name = "contact_no")
	private String contactNo;

	public Customer() {
		System.out.println("Customer class Default constructor...");
	}

	public Customer(Integer customerId, String name, String location, String email, String contactNo) {

		this.customerId = customerId;
		this.name = name;
		this.location = location;
		this.email = email;
		this.contactNo = contactNo;
	}

	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", location=" + location + ", email=" + email
				+ ", contactNo=" + contactNo + "]";
	}




}
