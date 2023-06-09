package com.AExVeS.AExVeS.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {
	@Value("${spring.data.mongodb.host}")
	private String host;

	@Value("${spring.data.mongodb.port}")
	private int port;

	@Value("${spring.data.mongodb.database}")
	private String db;
  
	@Override
	protected String getDatabaseName() {
		return db;
	}

	@Override
	public MongoClient mongoClient() {
		return MongoClients.create("mongodb://" + host + ":" + port);
	} 

//	@Bean
//	ValidatingMongoEventListener validatingMongoEventListener(final LocalValidatorFactoryBean factory) {
//		return new ValidatingMongoEventListener(factory);
//	}
}
