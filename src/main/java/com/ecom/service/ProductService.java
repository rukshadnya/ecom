package com.ecom.service;

import java.util.List;

import com.ecom.entities.Product;

public interface ProductService {
	
	List<Product> getAllProducts();

	static Product getProductById(Long productId) {
		// TODO Auto-generated method stub
		return null;
	}


}
