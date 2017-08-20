package com.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
	
	@NotEmpty
private String firstname;
	
private String lastname;

@Column(unique=true,nullable=false)
@NotEmpty
@Email
private String email;

@Size(min=10,max=10)
private String phone;

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="user_id")
@Valid
private User user1;

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="shipping_id")
@Valid
private ShippingAddress shippingAddress;

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="cart_id")
@Valid
private Cart cart;

private User user;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public User getUsers(User user) {
	return user;
}
public void setUser(User user) {
	this.user1 = user;
}
public ShippingAddress getShippingAddress() {
	return shippingAddress;
}
public void setShippingAddress(ShippingAddress shippingAddress) {
	this.shippingAddress = shippingAddress;
}
public Cart getCart() {
	return cart;
}
public void setCart(Cart cart) {
	this.cart = cart;
}
public Object getUser() {
	// TODO Auto-generated method stub
	return null;
}
public Object getUser1() {
	// TODO Auto-generated method stub
	return null;
}

}
