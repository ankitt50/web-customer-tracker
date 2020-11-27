package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;


public interface CustomerService {

	public List<Customer> getCustomers();
//	public Customer getCustomer(int customerId);
	public void saveCustomer(Customer customer);
	public Customer getCustomer(int customerId);
	public void delete(int customerId);
}
