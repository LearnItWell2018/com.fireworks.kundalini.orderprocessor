package com.fireworks.kundalini.orderprocessor.service.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

@EnableMongoRepositories("com.fireworks.kundalini.orderprocessor.db")
@Configuration 
@ComponentScan("com.fireworks.kundalini.orderprocessor.service") 
@PropertySources({@PropertySource("classpath:properties/kundalini.properties")})
public class ServiceConfiguration extends AbstractMongoConfiguration {
	
	@Autowired
	Environment env;
	
	@Override
	protected String getDatabaseName() {
		return "kundalini";
	}

	@Override
	public Mongo mongo() throws Exception {
		return new MongoClient(new ServerAddress("localhost", 27017));
	}
}