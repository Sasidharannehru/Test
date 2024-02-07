package com.sasi.serviceIMP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sasi.model.Customer;
import com.sasi.repository.customerRepo;
import com.sasi.service.CustomersService;
@Service
public class CustomerServiceIMP  implements CustomersService {
	
	@Autowired
	public customerRepo repo;

	@Override
	public List<Customer> getAllCustomers() {
		
		return repo.findAll();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		
		repo.save(customer);
		return null;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		repo.saveAndFlush(customer);
		return null;
	}

	@Override
	public Customer deleteCustomer(int customerID) {
		repo.deleteById(customerID);
		return null;
	}

	@Override
	public Customer getCustomerByID(int customerID) {
	     repo.findById(customerID);
		return null;
	}
	
	
	

}
