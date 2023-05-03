package com.AExVeS.AExVeS.partner.domain.Ports.out;

import java.util.List;
import java.util.Optional;

import com.AExVeS.AExVeS.partner.domain.Partner;

public interface SocioRepositoryPort {
    Partner save(Partner socio);
    Optional<Partner> findById(String id);
    List<Partner> findAll();
    Optional<Partner> update(Partner socio);
    boolean deleteById(String id);
}
