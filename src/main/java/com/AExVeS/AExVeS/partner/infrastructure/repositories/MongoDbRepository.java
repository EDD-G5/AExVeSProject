package com.AExVeS.AExVeS.socios.infraestructura.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.AExVeS.AExVeS.socios.dominio.Socio;

public interface MongoDbRepository extends MongoRepository<Socio,String> {
}
