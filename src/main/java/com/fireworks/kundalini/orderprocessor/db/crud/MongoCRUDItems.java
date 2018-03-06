package com.fireworks.kundalini.orderprocessor.db.crud;

import org.bson.Document;

import com.mongodb.client.MongoCollection;

public class MongoCRUDItems {
	
	private final MongoCollection<Document> mongoCollection;

	public MongoCRUDItems(MongoCollection<Document> mongoCollection) {
		this.mongoCollection = mongoCollection;
	}

}
