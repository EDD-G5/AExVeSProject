package com.AExVeS.AExVeS.representation_body.domain.Ports.in;

import java.util.List;
import java.util.Optional;

import com.AExVeS.AExVeS.partner.domain.Models.Partner;

public interface PartnerCrudUseCases {
    Partner createPartner(Partner socio);

    Optional<Partner> updatePartner(Partner socio);

    Optional<Partner> getPartner(String id);

    List<Partner> getAllPartners();

    boolean deletePartnerById(String id);
}
