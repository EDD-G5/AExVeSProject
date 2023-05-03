package com.AExVeS.AExVeS.partner.infrastructure.repositories;

import com.AExVeS.AExVeS.i.dominio.Socio;
import com.AExVeS.AExVeS.dominio.Ports.out.SocioRepositoryPort;
import com.AExVeS.AExVeS.Infraestructura.entities.SocioEntity;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class MongoDbRepositoryAdapter implements SocioRepositoryPort {
    private final MongoDbRepository mongoDbRepository;
    @Override
    public Partner save(Partner socio) {
        SocioEntity socioEntity = SocioEntity.fromDomainModel(socio);
        SocioEntity saved = mongoDbRepository.save(socioEntity);
        return saved.toDomainModel;
    }

    @Override
    public Optional<Partner> findById(String id) {
        return Optional.empty();
    }

    @Override
    public List<Partner> findAll() {
        return null;
    }

    @Override
    public Optional<Partner> update(Partner socio) {
        return Optional.empty();
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }
}
