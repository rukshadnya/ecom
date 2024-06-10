package com.ecom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Repository.CustomerRepository;
import com.ecom.entities.Customer;

@Service
public class CustomerLoginService {


	@Autowired
	private CustomerRepository customerRepository;
	 
	
	// for signup of new user
	public Customer registerCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
	// for login of user
	public Customer loginCustomer (String username, String password) {
		Customer customer = customerRepository.findByCustomerName(username);
		if(customer != null && customer.getPassword().equals(password)) {
			return customer;
		}
		else {
			return null;
		}
	}
}
