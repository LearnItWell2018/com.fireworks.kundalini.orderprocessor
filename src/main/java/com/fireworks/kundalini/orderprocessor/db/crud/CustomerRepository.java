package com.fireworks.kundalini.orderprocessor.db.crud;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fireworks.kundalini.orderprocessor.pojo.customer.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String>  {
	
	public Customer findBycustomerMail(String customerMail);
	
}