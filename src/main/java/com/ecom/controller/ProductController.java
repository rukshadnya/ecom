package com.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.entities.Product;
import com.ecom.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	/*
	 * Api is to show all products to the user
	 */
	
	@GetMapping("/products")
	
	public List<Product> getAllProduct() {
		return productService.getAllProducts();
		
		
	/*	public ResponseEntity<List<Product>> getAllProducts() {
	        List<Product> products = productService.getAllProducts();
	        return new ResponseEntity<>(products, HttpStatus.OK); */
	    }
}
