package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Customerdao;
import com.model.Customer;
@Service
public class Customerserviceimpl implements Customerservice {
	@Autowired
private Customerdao customerDao;
	public void saveCustomer(Customer customer) {
	   customerDao.saveCustomer(customer);
	}
	public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}
	public Customer getcustomerbyname(String name){
		return customerDao.getcustomerbyname(name);
	}
	public void update(Customer customer){
	customerDao.update(customer);
	}
}

