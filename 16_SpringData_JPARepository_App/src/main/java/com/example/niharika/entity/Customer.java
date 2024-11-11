package com.example.niharika.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "niharika_customers")
public class Customer {
	
	@Id
	@GeneratedValue // Auto Strategy
	@Column(name = "customer_id")
	private Integer customerId;
	
	private String customerName;
	
	private String customerLocation;
	
	public Customer() {
		
	}

	public Customer(Integer customerId, String customerName, String customerLocation) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerLocation = customerLocation;
	}

	public Customer(String customerName, String customerLocation) {
		this.customerName = customerName;
		this.customerLocation = customerLocation;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerLocation() {
		return customerLocation;
	}

	public void setCustomerLocation(String customerLocation) {
		this.customerLocation = customerLocation;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerLocation="
				+ customerLocation + "]";
	}
	
}
