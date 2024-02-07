package com.sasi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sasi.model.Customer;

@Service

public interface CustomersService {

	public List<Customer>getAllCustomers();
	
	public Customer addCustomer(Customer customer);
	
	public Customer updateCustomer(Customer customer);
	
	public Customer deleteCustomer(int customerID);
	
	public Customer getCustomerByID(int customerID);
	
	
}
