package com.service;

import java.util.List;

import com.model.Cart;



public interface Cartservice {
	public boolean save(Cart cart);
	public boolean update(Cart cart);
	public boolean delete(Cart cart);
	public Cart get(int id);
	public List<Cart> list();

}
