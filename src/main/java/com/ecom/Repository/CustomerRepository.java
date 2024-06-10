package com.ecom.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

	Customer findByCustomerName(String username);
}
