package com.sasi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name = "Customer ID")
	int customerID;
	
	@Column(name="Customer Name")
	String customerName;
    @Column(name="Email")
	String email;
    
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Customer(int customerID, String customerName, String email) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.email = email;
	}
    
    public Customer() {
    	
    }
    
}
