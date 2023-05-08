package com.AExVeS.AExVeS.partner.infrastructure.data;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.AExVeS.AExVeS.partner.infrastructure.data.Entities.PartnerEntity;

public interface PartnerMongoRepository extends MongoRepository<PartnerEntity, String> {
}
