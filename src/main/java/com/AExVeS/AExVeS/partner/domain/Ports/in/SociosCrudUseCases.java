package com.AExVeS.AExVeS.partner.domain.Ports.in;

import java.util.List;
import java.util.Optional;

import com.AExVeS.AExVeS.partner.domain.Partner;

public interface SociosCrudUseCases {
    Partner createSocio(Partner socio);
    Optional<Partner> updateSocio(Partner socio);
    Optional<Partner> getTask(String id);
    List<Partner> getAllSocios();
    boolean deleteTask(String id);

}
