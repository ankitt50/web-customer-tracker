package com.luv2code.springdemo.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();
	public Customer getCustomer(int customerId);
	public void saveCustomer(Customer customer);
	public void delete(int customerId);
}
