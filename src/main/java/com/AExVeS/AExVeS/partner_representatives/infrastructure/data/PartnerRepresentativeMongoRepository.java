package com.AExVeS.AExVeS.partner_representatives.infrastructure.data;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.AExVeS.AExVeS.partner_representatives.infrastructure.data.Entities.PartnerRepresentativeEntity;

public interface PartnerRepresentativeMongoRepository extends MongoRepository<PartnerRepresentativeEntity, String> {
}
