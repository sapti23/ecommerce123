package com.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CartItemdao;
import com.model.Cart;
import com.model.CartItem;
@Service
public class Cartitemserviceimpl implements Cartitemservice{
	@Autowired	
	private CartItemdao CartItemdao;
	public boolean save(CartItem cartitems){
		return CartItemdao.save(cartitems);
	}
	public boolean update(CartItem cartitems){
		return CartItemdao.update(cartitems);
	}
	public boolean delete(CartItem cartitems){
		return CartItemdao.delete(cartitems);
	}
	public CartItem get(int id){
		return CartItemdao.get(id);
	}
	public List<CartItem> list(Cart cart){
		return CartItemdao.list(cart);
	}
	public void deletecartitemById(int id){
	 return;
	}

	public CartItem getCartItemWithCartAndProduct(int productid,int cartid){
		return CartItemdao.getCartItemWithCartAndProduct(productid,cartid);
	}
	
	public boolean deleteAll(Integer cartId){
		return CartItemdao.deleteAll(cartId);
		}
		
	}
