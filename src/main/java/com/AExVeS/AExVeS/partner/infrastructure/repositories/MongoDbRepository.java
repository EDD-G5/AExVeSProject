package com.AExVeS.AExVeS.partner.infrastructure.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.AExVeS.AExVeS.partner.domain.Partner;

public interface MongoDbRepository extends MongoRepository<Partner,String> {
}
