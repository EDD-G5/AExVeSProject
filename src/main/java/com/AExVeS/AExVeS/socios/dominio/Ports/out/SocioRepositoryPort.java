package com.AExVeS.AExVeS.socios.dominio.Ports.out;

import java.util.List;
import java.util.Optional;

import com.AExVeS.AExVeS.socios.dominio.Socio;

public interface SocioRepositoryPort {
    Socio save(Socio socio);
    Optional<Socio> findById(String id);
    List<Socio> findAll();
    Optional<Socio> update(Socio socio);
    boolean deleteById(String id);
}
