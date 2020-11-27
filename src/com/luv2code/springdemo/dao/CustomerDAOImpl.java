package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Customer> query = currentSession.createQuery("from Customer", Customer.class);
		
		return query.getResultList();
		
	}
	
	@Override
	public void saveCustomer(Customer customer) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
//		currentSession.save(customer);
//		currentSession.update(customer);
		currentSession.saveOrUpdate(customer);

		
	}

	@Override
	public Customer getCustomer(int customerId) {
		
        Session currentSession = sessionFactory.getCurrentSession();
		
		Customer customer = currentSession.get(Customer.class, customerId);
		
		return customer;
	}

	@Override
	public void delete(int customerId) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query theQuery = currentSession.createQuery("delete from Customer where id=:customerId");

		theQuery.setParameter("customerId", customerId);
		
		theQuery.executeUpdate();
	}
	
	/*
	@Override
	public Customer getCustomer(int customerId) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Customer customer = currentSession.find(Customer.class, customerId);
		
		return customer;
	}
	*/

}
