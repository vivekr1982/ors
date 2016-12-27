package com.mo.ors.app.service;

import com.mo.ors.app.model.Cart;

public interface CartService {

	Long save(Cart cart);
	void add(Long idCart, Long idProduct, Integer quantity);
	Long ordered(Long idCart);

}
