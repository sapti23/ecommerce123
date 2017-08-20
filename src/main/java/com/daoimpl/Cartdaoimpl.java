package com.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.dao.Cartdao;
import com.model.Cart;
@EnableTransactionManagement
@Repository("cartdao")
@Transactional
public class Cartdaoimpl implements Cartdao	 {
	
	    @Autowired
		SessionFactory sessionfactory;
	    public Cartdaoimpl(SessionFactory sessionfactory){
	    	try{
	    	
	    	this.sessionfactory=sessionfactory;
	    	}catch(Exception e){
	    		e.printStackTrace();
	    	}
	    }
		
		public boolean save(Cart cart) {
			try{
				sessionfactory.getCurrentSession().save(cart);
				return true;
			}catch(HibernateException e){
				e.printStackTrace();
				return false;
			}
			
		}


		public boolean update(Cart cart) {
			sessionfactory.getCurrentSession().update(cart);
			return false;	
		
		}

		public boolean delete(Cart cart) {
			
			
			try{
				
				sessionfactory.getCurrentSession().delete(cart);	
					
				 return true;	
				}catch(Exception e){e.printStackTrace();}
				return false;
	}

		public Cart get(int id) {
			// TODO Auto-generated method stub
			return (Cart) sessionfactory.getCurrentSession().get(Cart.class, Integer.valueOf(id));
		}
		public List<Cart> list() {
		  
				
			return sessionfactory.getCurrentSession().createQuery("from Cart").list();
			 
		}
}
			
	