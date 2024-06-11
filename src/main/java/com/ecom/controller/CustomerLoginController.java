package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.entities.Customer;
import com.ecom.service.CustomerLoginService;

@RestController
public class CustomerLoginController {

	@Autowired
	private CustomerLoginService customerLoginService;
	
	@PostMapping("/signup")  
	public ResponseEntity<Customer> signup(@RequestBody Customer customer){
		Customer registeredCustomer = customerLoginService.registerCustomer(customer);
		return new ResponseEntity<Customer>(registeredCustomer,HttpStatus.CREATED);
	}

	 @PostMapping("/login")    
	 public ResponseEntity<Customer> login(@RequestBody Customer customer){
		 Customer loggedCustomer = customerLoginService
				 .loginCustomer(customer.getUsername(),customer.getPassword());
		 if(loggedCustomer != null) {
			 return new ResponseEntity<>(loggedCustomer,HttpStatus.OK);
		 }else {
			 return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		 }
	 }
}
