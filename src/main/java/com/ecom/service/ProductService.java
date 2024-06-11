package com.ecom.service;

import java.util.List;

import com.ecom.entities.Product;

public interface ProductService {
	
	List<Product> getAllProducts();

	Product getProductById(Long productId) ;

}
