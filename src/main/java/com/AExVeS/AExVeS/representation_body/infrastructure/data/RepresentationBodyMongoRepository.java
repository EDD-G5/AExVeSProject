package com.AExVeS.AExVeS.representation_body.infrastructure.data;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.AExVeS.AExVeS.partner.infrastructure.data.Entities.PartnerEntity;
import com.AExVeS.AExVeS.representation_body.domain.RepresentationBody;
import com.AExVeS.AExVeS.representation_body.infrastructure.data.Entities.RepresentationBodyEntity;

public interface RepresentationBodyMongoRepository extends MongoRepository<RepresentationBodyEntity, String> {
}
