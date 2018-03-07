package com.fireworks.kundalini.orderprocessor.db.crud;

import org.bson.Document;

import com.fireworks.kundalini.orderprocessor.helper.Helper;
import com.fireworks.kundalini.orderprocessor.pojo.items.KundaliniItems;
import com.mongodb.client.MongoCollection;

public class MongoCRUDItems {
	
	private final MongoCollection<Document> mongoCollection;

	public MongoCRUDItems(MongoCollection<Document> mongoCollection) {
		this.mongoCollection = mongoCollection;
	}

	public String create(KundaliniItems order) {
		Document documnent = new Document();
		documnent.append("items", Helper.provideJSON4POJO(order));
		this.mongoCollection.insertOne(documnent);
		return documnent.getObjectId("_id").toString();
	}
	
}
