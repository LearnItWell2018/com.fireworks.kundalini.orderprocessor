package com.fireworks.kundalini.orderprocessor.conf.service;

import java.util.Date;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

import com.fireworks.kundalini.orderprocessor.db.crud.MongoCRUD;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Configuration 
@ComponentScan("com.fireworks.kundalini.orderprocessor") 
@PropertySources({@PropertySource("classpath:properties/kundalini.properties")})
public class ServiceConfiguration {
	
	@Autowired
	Environment env;
	
	private MongoCollection<Document> getMongoConnection() {
		MongoClient mongo = new MongoClient(env.getProperty("mongo.host"), Integer.parseInt(env.getProperty("mongo.port")));
		MongoDatabase db = mongo.getDatabase("order");
		return db.getCollection("orders");
	}
	
	@Bean("mongoCollection")
	public MongoCRUD getMongoCRUD() {
		return new MongoCRUD(getMongoConnection());

	}
	
	
	
	
}