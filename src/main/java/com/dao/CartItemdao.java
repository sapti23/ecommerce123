package com.dao;

import java.util.List;

import com.model.Cart;
import com.model.CartItem;

public interface CartItemdao {
	public boolean save(CartItem cartitem);
	public boolean update(CartItem cartitem);
	public boolean delete(CartItem cartitem);
	public CartItem get(int id);
	public List<CartItem> list(Cart cart);
	public void deletecartitemById(int id);
	public CartItem getCartItemWithCartAndProduct(int productid,int cartid);
	boolean deleteAll(Integer cartId);

	
}
