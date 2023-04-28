package com.AExVeS.AExVeS.Aplicacion.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.AExVeS.AExVeS.Dominio.Socio;

public interface SocioRepository extends MongoRepository<Socio, String>{
}
