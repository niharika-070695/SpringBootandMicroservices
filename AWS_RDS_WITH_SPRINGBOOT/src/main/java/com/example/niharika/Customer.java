package com.example.niharika;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "shopping_customers")
public class Customer {
	
	@Id
	private Integer customerId;
	private String name;

	private String location;
	private String email;
	private String contactNo;

}
