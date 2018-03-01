package com.fireworks.kundalini.orderprocessor.db.crud;

import org.bson.Document;

import com.mongodb.client.MongoCollection;

public class MongoCRUD {
	
	
	private final MongoCollection<Document> mongoCollection;
	
	public MongoCRUD(MongoCollection<Document> mongoCollection) {
		this.mongoCollection = mongoCollection;
	}
	
	public void create(Object obj) {
		Document documnent = new Document("order", obj);
		this.mongoCollection.insertOne(documnent);
	}

}
