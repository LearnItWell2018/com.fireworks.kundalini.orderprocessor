package com.fireworks.kundalini.orderprocessor.db.crud;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fireworks.kundalini.orderprocessor.pojo.customerorder.ReferOrder;

public interface ReferRepository extends MongoRepository<ReferOrder, String>{

	public List<ReferOrder> findBycustomerMail(String customerMail);
}
