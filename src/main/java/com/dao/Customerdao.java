package com.dao;

import java.util.List;

import com.model.Customer;

public interface Customerdao {
void saveCustomer(Customer customer);
List<Customer> getCustomers();//duplicate username and email

void update(Customer customer);
Customer getcustomerbyname(String name);

}
