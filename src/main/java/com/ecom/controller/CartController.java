package com.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.entities.Cart;
import com.ecom.service.CartService;

@RestController
@RequestMapping

public class CartController {

	@Autowired
    private CartService cartService;


 @PostMapping("/addProduct/{productId}/{quantity}")
    public ResponseEntity<String> addProductToCart(@PathVariable Long productId,@PathVariable Integer quantity, @RequestBody Cart cart) {
        cartService.addProductToCart( productId, quantity);
        return ResponseEntity.ok("Product added to cart successfully");
        
    }
 
 @GetMapping("/cart")
 public ResponseEntity<List<Cart>> getAllProductsInCart() {
     List<Cart> carts = cartService.getAllProductsInCart();
     return ResponseEntity.ok(carts);
     
    
 }
 
 @DeleteMapping("/{productId}")
 public ResponseEntity<String> deleteProductFromCart(@PathVariable Long productId) {
     cartService.deleteProductFromCart(productId);
     return ResponseEntity.ok("Product deleted from cart successfully");
 }
}
