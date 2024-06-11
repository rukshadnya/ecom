package com.ecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Repository.ProductRepository;
import com.ecom.entities.Product;
@Service
public class ProductServiceImpl implements ProductService {

	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> getAllProducts() {
		
	List<Product> productList = productRepository.findAll();
		
		return productRepository.findAll();
		
	}

	@Override
	public Product getProductById(Long productId) {
		
		return productRepository.findById(productId).orElseThrow();
	}

}
