package com.AExVeS.AExVeS.Infraestructura.Config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.AExVeS.AExVeS.Aplicacion.Repository.SocioRepository;
import com.AExVeS.AExVeS.Dominio.Socio;

@EnableMongoRepositories(basePackageClasses = SocioRepository.class)
@Configuration
public class MongoConfig {

	@Bean
	CommandLineRunner commandLineRunner(SocioRepository socioRepository) {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				socioRepository.save(new Socio());
			}
		};
	}
	
}
