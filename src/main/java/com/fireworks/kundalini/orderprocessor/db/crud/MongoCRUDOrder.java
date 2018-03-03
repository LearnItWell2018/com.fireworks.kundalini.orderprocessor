package com.fireworks.kundalini.orderprocessor.db.crud;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.fireworks.kundalini.orderprocessor.helper.Helper;
import com.fireworks.kundalini.orderprocessor.pojo.Order;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;

public class MongoCRUDOrder {
	
	
	private final MongoCollection<Document> mongoCollection;
	
	public MongoCRUDOrder(MongoCollection<Document> mongoCollection) {
		this.mongoCollection = mongoCollection;
	}
	
	public String create(Order order) {
		Document documnent = new Document();
		documnent.append("order", Helper.provideJSON4POJO(order));
		this.mongoCollection.insertOne(documnent);
		return documnent.getObjectId("_id").toString();
	}
	
	public String read(String objectId) {
		return this.mongoCollection.find(eq("_id", new ObjectId(objectId))).first().getString("order");
	}
	
}
