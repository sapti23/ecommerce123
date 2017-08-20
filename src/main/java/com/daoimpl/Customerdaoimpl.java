package com.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.Customerdao;
import com.model.Authorities;
import com.model.Cart;
import com.model.Customer;
import com.model.User;
@Repository
public class Customerdaoimpl implements Customerdao {
	@Autowired
private SessionFactory sessionFactory;
	
	
	public void saveCustomer(Customer customer) {
		User user=(User) customer.getUser();
		user.setEnabled(true);
		//0,john,123,true
		Authorities authorities=new Authorities();
		authorities.setUsername(user.getUsername());
		authorities.setRole("ROLE_USER");
		
		Session session=sessionFactory.openSession();
		session.save(authorities);//Authorities table //insert into authorities values (1,'john','ROLE_USER')
		
		Cart cart=new Cart();
		cart.setCustomer(customer); // update the value of customer_id column in the cart table.
		customer.setCart(cart);//update the cart_id in customer table
		session.save(customer); // Users,Customer,BillingAddress,ShippingAddress,Cart
		session.flush();
		session.close();
		
		
	}


	public List<Customer> getCustomers() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Customer");
		List<Customer> customers=query.list();
		session.close();
		return customers;
	}

	 public void update(Customer customer){
		 Session session=sessionFactory.openSession();
			System.out.println("CUSTOMER ID BEFORE INSERTION " + customer.getId());
			session.update(customer);
			System.out.println("PRODUCT ID AFTER INSERTION " + customer.getId());
			session.flush();
			session.close();
}


	public Customer getcustomerbyname(String name) {
		Session session=sessionFactory.openSession();
        User u = (User)session.createQuery("from Users u where username = :name").setString("name", name).list().get(0);
        Customer customer=(Customer)session.createQuery("from Customer c where user_id= :id").setInteger("id", u.getId()).list().get(0);
        
        System.out.println(customer);
        
        session.close();
        return customer;
	}
}
