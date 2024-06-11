package com.ecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Repository.CartRepository;
import com.ecom.Repository.ProductRepository;
import com.ecom.entities.Cart;
import com.ecom.entities.Product;

@Service
public class CartService {

	@Autowired
    private CartRepository cartRepository;

    @Autowired
    private ProductRepository productRepository;
	
	
	public Cart addProductToCart(Long productId, Integer quantity) {
		
		//Cart cart = cartRepository.findById(cartId).orElseThrow();
	//	Product product = productRepository.findById(productId).orElseThrow();
		
		Product product = productRepository.findById(productId).orElseThrow();
        Cart cart = new Cart();
        cart.setProductId(productId);
        cart.setQuantity(quantity);
      return  cartRepository.save(cart);
	
		//cart.getProducts().add(product);
	    //return cartRepository.save(cart);
	

	}
	 public List<Cart> getAllProductsInCart() {
         return cartRepository.findAll();
	}
	 
		 
	 public void deleteProductFromCart(Long productId) {
	        Cart cart = cartRepository.findCartByProductId(productId);
	        if (cart != null) {
	            cartRepository.delete(cart);

	        }
	 }
	 
}
