package com.daoimpl;
import java.util.List;

import org.hibernate.Query;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CartItemdao;
import com.model.Cart;
import com.model.CartItem;
@EnableTransactionManagement
@Repository("cartitemdao")
@Transactional
public class Cartitemdaoimpl implements CartItemdao{
	@Autowired
	SessionFactory sessionfactory;
    public Cartitemdaoimpl(SessionFactory sessionfactory){
    	this.sessionfactory=sessionfactory;
    }

	public boolean save(CartItem cartitem) {
		try{
			sessionfactory.getCurrentSession().save(cartitem);
			return true;
		}catch(HibernateException e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean update(CartItem cartitems) {
	 try{	
		sessionfactory.getCurrentSession().update(cartitems);
		return true;
	 }catch(Exception e){
		return false;
	 }
	}

	public boolean delete(CartItem cartitems) {
try{
			
			sessionfactory.getCurrentSession().delete(cartitems);	
				
			 return true;	
			}catch(Exception e){e.printStackTrace();}
			return false;

		
	}
	public CartItem get(int id) {
		return (CartItem) sessionfactory.getCurrentSession().get(CartItem.class, Integer.valueOf(id));
	} 

	public List<CartItem> list(Cart cart) {
				try{
List<CartItem> list = ((Query) sessionfactory.getCurrentSession().createQuery("from CartItem where cart_id = :id").setParameter("id", cart.getId())).list();
			return list;
		}catch(Exception e){
			System.out.println(e);
			return null;
		}	
		}
	public void deletecartitemById(int id) {
		try{
		CartItem cartitem=new CartItem();
		cartitem.setId(id);
		sessionfactory.getCurrentSession().delete(cartitem);
		return;
		}catch(Exception e){
			System.out.println(e);
			return ;
		}
	}

	public CartItem getCartItemWithCartAndProduct(int productid, int cartid) {
		try{
		Query q=(Query) sessionfactory.getCurrentSession().createQuery("From CartItem where cart_id=:cartid and product_id=:proid");
		q.setParameter("cartid", cartid);
		q.setParameter("proid", productid);
		return (CartItem)q.list();
		}catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public boolean deleteAll(Integer cartId) {
		try {
			sessionfactory.getCurrentSession().createQuery("Delete from CartItems where cart_id=:id")
			.setParameter("id", cartId).executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
}
