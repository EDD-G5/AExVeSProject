package com.AExVeS.AExVeS.partner.application.useCases;

import java.util.List;
import java.util.Optional;

import com.AExVeS.AExVeS.partner.domain.Partner;
import com.AExVeS.AExVeS.partner.domain.Ports.in.SociosCrudUseCases;
import com.AExVeS.AExVeS.partner.domain.Ports.out.SocioRepositoryPort;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class partnerCRUDUseCasesImpl  implements SociosCrudUseCases {
    private final SocioRepositoryPort socioRepositoryPort;

    @Override
    public Partner createSocio(Partner socio) {
        return socioRepositoryPort.save(socio);
    }

    @Override
    public Optional<Partner> updateSocio(Partner socio) {
        return socioRepositoryPort.update(socio);
    }

    @Override
    public Optional<Partner> getTask(String id) {
        return socioRepositoryPort.findById(id);
    }

    @Override
    public List<Partner> getAllSocios() {
        return socioRepositoryPort.findAll();
    }

    @Override
    public boolean deleteTask(String id) {
        return socioRepositoryPort.deleteById(id);
    }
}
