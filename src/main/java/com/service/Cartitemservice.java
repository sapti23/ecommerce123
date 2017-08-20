package com.service;

import java.util.List;

import com.model.Cart;
import com.model.CartItem;

public interface Cartitemservice  {
	public boolean save(CartItem cartitem);
	public boolean update(CartItem cartitems);
	public boolean delete(CartItem cartitems);
	public CartItem get(int id);
	public List<CartItem> list(Cart cart);
	public void deletecartitemById(int id);
	public CartItem getCartItemWithCartAndProduct(int productid,int cartid);
	boolean deleteAll(Integer cartId);
	
}

