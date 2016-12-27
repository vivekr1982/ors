package com.mo.ors.app.dao;

import com.mo.ors.app.model.Cart;

public interface CartDao {

	Cart findBy(Long idCart);
	Long save(Cart cart);
	void update(Cart cart);
	
}
