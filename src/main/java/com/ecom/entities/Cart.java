package com.ecom.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;




@Entity
@Table(name = "cart")
public class Cart {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CartId;
	private Long ProductId;
	private Integer quantity;
	
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "productid")
	 * 
	 * @Autowired private Product product;
	 */
	private List<Product> products = new ArrayList<>();
	
    public Cart() {
		super();
		
	}

	public Cart(Long cartId, Long productId, Integer quantity, List<Product> products) {
		super();
		CartId = cartId;
		ProductId = productId;
		this.quantity = quantity;
		this.products = products;
	}

	public Long getCartId() {
		return CartId;
	}

	public void setCartId(Long cartId) {
		CartId = cartId;
	}

	public Long getProductId() {
		return ProductId;
	}

	public void setProductId(Long productId) {
		ProductId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Cart [CartId=" + CartId + ", ProductId=" + ProductId + ", quantity=" + quantity + ", products="
				+ products + ", getCartId()=" + getCartId() + ", getProductId()=" + getProductId() + ", getQuantity()="
				+ getQuantity() + ", getProducts()=" + getProducts() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
    
}
