package com.ecom.service;

import java.util.List;

import com.ecom.entities.Cart;

public interface CartService {

	Cart addProductToCart(Long productId, Integer quantity);
	
	List<Cart> getAllProductsInCart();
	
	void deleteProductFromCart(Long productId);
}
