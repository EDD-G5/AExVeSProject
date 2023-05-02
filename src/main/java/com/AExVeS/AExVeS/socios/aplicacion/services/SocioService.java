package com.AExVeS.AExVeS.socios.aplicacion.services;

import java.util.List;
import java.util.Optional;

import com.AExVeS.AExVeS.socios.dominio.Socio;
import com.AExVeS.AExVeS.socios.dominio.Ports.in.SociosCrudUseCases;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SocioService implements SociosCrudUseCases {
    private final SociosCrudUseCases sociosCrudUseCases;
    @Override
    public Socio createSocio(Socio socio) {
        return sociosCrudUseCases.createSocio(socio);
    }

    @Override
    public Optional<Socio> updateSocio(Socio socio) {
        return sociosCrudUseCases.updateSocio(socio);
    }

    @Override
    public Optional<Socio> getTask(String id) {
        return sociosCrudUseCases.getTask(id);
    }

    @Override
    public List<Socio> getAllSocios() {
        return sociosCrudUseCases.getAllSocios();
    }

    @Override
    public boolean deleteTask(String id) {
        return sociosCrudUseCases.deleteTask(id);
    }
}
