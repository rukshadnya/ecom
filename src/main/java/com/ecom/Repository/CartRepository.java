package com.ecom.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.entities.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

	Cart findCartByProductId(Long productId);

}
