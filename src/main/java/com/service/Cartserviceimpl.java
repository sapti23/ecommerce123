package com.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Cartdao;
import com.model.Cart;
@Service
public class Cartserviceimpl implements Cartservice{
	
	
	@Autowired	
	private Cartdao cartDao;
	public boolean save(Cart cart) {
		   return cartDao.save(cart);
			
		}
	public boolean update(Cart cart) {
			return cartDao.update(cart);
		}
	public boolean delete(Cart cart) {
			return cartDao.delete(cart);
		}
	public Cart get(int id){
	return cartDao.get(id);
	}
	public List<Cart> list() {
		return	cartDao.list();
			
		}

	}
