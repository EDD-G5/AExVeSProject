package com.AExVeS.AExVeS.socios.infraestructura.repositories;

import java.util.List;
import java.util.Optional;

import com.AExVeS.AExVeS.socios.dominio.Socio;
import com.AExVeS.AExVeS.socios.dominio.Ports.out.SocioRepositoryPort;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MongoDbRepositoryAdapter implements SocioRepositoryPort {
	
    private final MongoDbRepository mongoDbRepository;
    @Override
    public Socio save(Socio socio) {
        Socio socioEntity = Socio.fromDomainModel(socio);
        Socio saved = mongoDbRepository.save(socioEntity);
        return saved.toDomainModel;
    }

    @Override
    public Optional<Socio> findById(String id) {
        return Optional.empty();
    }

    @Override
    public List<Socio> findAll() {
        return null;
    }

    @Override
    public Optional<Socio> update(Socio socio) {
        return Optional.empty();
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }
}
