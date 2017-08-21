package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Customer;

@Service
public interface Customerservice {
void saveCustomer(Customer customer);
List<Customer> getCustomers();

void update(Customer customer);
Customer getcustomerbyname(String name);
}
