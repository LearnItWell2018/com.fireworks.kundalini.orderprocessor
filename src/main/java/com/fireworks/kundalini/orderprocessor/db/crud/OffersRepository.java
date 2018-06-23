package com.fireworks.kundalini.orderprocessor.db.crud;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fireworks.kundalini.orderprocessor.pojo.offer.Offers;

public interface OffersRepository extends MongoRepository<Offers, String>  {
	
	public Offers findByofferID(String offerID);
	
}