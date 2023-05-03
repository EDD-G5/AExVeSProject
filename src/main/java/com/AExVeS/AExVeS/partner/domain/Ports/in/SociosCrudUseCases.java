package com.AExVeS.AExVeS.socios.dominio.Ports.in;

import java.util.List;
import java.util.Optional;

import com.AExVeS.AExVeS.socios.dominio.Socio;

public interface SociosCrudUseCases {
    Socio createSocio(Socio socio);
    Optional<Socio> updateSocio(Socio socio);
    Optional<Socio> getTask(String id);
    List<Socio> getAllSocios();
    boolean deleteTask(String id);

}
