package com.service;

import java.util.List;

import com.model.Customer;

public interface Customerservice {
void saveCustomer(Customer customer);
List<Customer> getCustomers();

void update(Customer customer);
Customer getcustomerbyname(String name);
}
