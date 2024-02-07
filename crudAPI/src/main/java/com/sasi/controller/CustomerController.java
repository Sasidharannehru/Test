package com.sasi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sasi.model.Customer;
import com.sasi.service.CustomersService;

@RestController
@RequestMapping(value="customer")
public class CustomerController {
	@Autowired
	public CustomersService service;
	
	@GetMapping
	public List<Customer> getAllCustomer(){
		
		return service.getAllCustomers();
		
		
	}
	@PostMapping
	
	public ResponseEntity<String> createCustomer(@RequestBody Customer customer) {
		ResponseEntity<String> response =null;
		if(customer==null) {
			response =new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		else {
			customer=service.addCustomer(customer);
			response= new ResponseEntity<>(HttpStatus.CREATED);
		}
		
		return response;
	}
	
    @PutMapping
	public ResponseEntity<Customer>updateCustomer(@RequestBody Customer customer){
		ResponseEntity<Customer> response = null;
		if(customer== null) {
			response= new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		else {
			customer=service.updateCustomer(customer);
			response= new ResponseEntity<>(HttpStatus.ACCEPTED);
		}
	
		return response;
	}
    
    @DeleteMapping(value="/{customerID}")
    public Customer removeCustomer(@RequestParam int customerID) {
    	service.deleteCustomer(customerID);
    	return null;
    }
    
}
