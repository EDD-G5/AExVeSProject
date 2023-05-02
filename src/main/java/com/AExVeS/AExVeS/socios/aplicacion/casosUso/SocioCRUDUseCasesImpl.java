package com.AExVeS.AExVeS.socios.aplicacion.casosUso;

import java.util.List;
import java.util.Optional;

import com.AExVeS.AExVeS.socios.dominio.Socio;
import com.AExVeS.AExVeS.socios.dominio.Ports.in.SociosCrudUseCases;
import com.AExVeS.AExVeS.socios.dominio.Ports.out.SocioRepositoryPort;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SocioCRUDUseCasesImpl  implements SociosCrudUseCases {
    private final SocioRepositoryPort socioRepositoryPort;

    @Override
    public Socio createSocio(Socio socio) {
        return socioRepositoryPort.save(socio);
    }

    @Override
    public Optional<Socio> updateSocio(Socio socio) {
        return socioRepositoryPort.update(socio);
    }

    @Override
    public Optional<Socio> getTask(String id) {
        return socioRepositoryPort.findById(id);
    }

    @Override
    public List<Socio> getAllSocios() {
        return socioRepositoryPort.findAll();
    }

    @Override
    public boolean deleteTask(String id) {
        return socioRepositoryPort.deleteById(id);
    }
}
