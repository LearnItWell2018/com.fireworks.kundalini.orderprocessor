package com.fireworks.kundalini.orderprocessor.db.connect;

import java.util.Date;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoConnector {
	
	public static void main(String[] args) {
		MongoClient mongo = new MongoClient("localhost", 27017);
		MongoDatabase db = mongo.getDatabase("order");
		MongoCollection<Document> table = db.getCollection("orders");
		Document document = new Document();
		document.append("name", "suparna ghosh");
		document.put("age", 29);
		document.put("createdDate", new Date());
		table.insertOne(document);
	}

}
