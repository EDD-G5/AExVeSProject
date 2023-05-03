package com.AExVeS.AExVeS.partner.application.services;

import java.util.List;
import java.util.Optional;

import com.AExVeS.AExVeS.partner.domain.Partner;
import com.AExVeS.AExVeS.partner.domain.Ports.in.SociosCrudUseCases;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PartnerService implements SociosCrudUseCases {
    private final SociosCrudUseCases sociosCrudUseCases;
    @Override
    public Partner createSocio(Partner socio) {
        return sociosCrudUseCases.createSocio(socio);
    }

    @Override
    public Optional<Partner> updateSocio(Partner socio) {
        return sociosCrudUseCases.updateSocio(socio);
    }

    @Override
    public Optional<Partner> getTask(String id) {
        return sociosCrudUseCases.getTask(id);
    }

    @Override
    public List<Partner> getAllSocios() {
        return sociosCrudUseCases.getAllSocios();
    }

    @Override
    public boolean deleteTask(String id) {
        return sociosCrudUseCases.deleteTask(id);
    }
}
