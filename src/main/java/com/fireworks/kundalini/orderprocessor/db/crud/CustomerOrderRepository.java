package com.fireworks.kundalini.orderprocessor.db.crud;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fireworks.kundalini.orderprocessor.pojo.customerorder.CustomerOrder;

public interface CustomerOrderRepository extends MongoRepository<CustomerOrder, String>  {
	
	public CustomerOrder findBycustomerMail(String customerMail);
	
}