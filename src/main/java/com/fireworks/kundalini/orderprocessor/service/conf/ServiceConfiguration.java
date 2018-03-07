package com.fireworks.kundalini.orderprocessor.service.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.fireworks.kundalini.orderprocessor.db.crud.MongoCRUDOrder;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;

@EnableMongoRepositories("com.fireworks.kundalini.orderprocessor.db")
@Configuration 
@ComponentScan("com.fireworks.kundalini.orderprocessor.service") 
@PropertySources({@PropertySource("classpath:properties/kundalini.properties")})
public class ServiceConfiguration extends AbstractMongoConfiguration {
	
	@Autowired
	Environment env;
	
	
	/*private MongoDatabase getMongoConnection() {
		MongoClient mongo = new MongoClient(env.getProperty("mongo.host"), Integer.parseInt(env.getProperty("mongo.port")));
		return mongo.getDatabase("kundalini");
	}*/
	
/*	@Bean("mongoCollectionOrder")
	public MongoCRUDOrder getMongoCRUDOrder() {
		return new MongoCRUDOrder(getMongoConnection().getCollection("orders"));

	}
	
	@Bean("mongoCollectionItems")
	public MongoCRUDOrder getMongoCRUDItems() {
		return new MongoCRUDOrder(getMongoConnection().getCollection("items"));

	}*/

	@Override
	protected String getDatabaseName() {
		return "kundalini";
	}

	@Override
	public Mongo mongo() throws Exception {
		return new MongoClient(new ServerAddress("localhost", 27017));
	}
}