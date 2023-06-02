package com.AExVeS.AExVeS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
@EnableMongoRepositories("com.AExVeS.AExVeS")
@ComponentScan(basePackages = { "com.AExVeS.AExVeS" })
public class AExVeSApplication {
	public static void main(String[] args) {
		SpringApplication.run(AExVeSApplication.class, args);
	}

}
