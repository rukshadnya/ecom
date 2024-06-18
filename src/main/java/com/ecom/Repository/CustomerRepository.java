package com.ecom.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

	Customer findByCustomerName(String username);
}
