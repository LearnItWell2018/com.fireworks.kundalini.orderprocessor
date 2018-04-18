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

import com.fireworks.kundalini.orderprocessor.mail.Mailer;
import com.fireworks.kundalini.orderprocessor.pdf.OrderBill;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

@EnableMongoRepositories("com.fireworks.kundalini.orderprocessor.db")
@Configuration 
@ComponentScan("com.fireworks.kundalini.orderprocessor.service") 
@PropertySources({@PropertySource("classpath:properties/kundalini.properties")})
public class ServiceConfiguration extends AbstractMongoConfiguration {
	
	@Autowired
	Environment env;
	
	@Override
	protected String getDatabaseName() {
		return env.getProperty("mongo.db");
	}

	@Bean("orderbill")
	public OrderBill getOrderBill () {
		return new OrderBill(); 
	}
	
	@Bean("mailer")
	public Mailer getMailer () {
		return new Mailer(); 
	}
	
	@Override
	public Mongo mongo() throws Exception {
		MongoClientURI uri = new MongoClientURI(env.getProperty("mongo.uri"));
		return new MongoClient(uri);
	}
}
