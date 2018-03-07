package com.fireworks.kundalini.orderprocessor.db.crud;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.fireworks.kundalini.orderprocessor.pojo.items.KundaliniItems;

public interface ItemsRepository extends MongoRepository<KundaliniItems, String>  {
	
}