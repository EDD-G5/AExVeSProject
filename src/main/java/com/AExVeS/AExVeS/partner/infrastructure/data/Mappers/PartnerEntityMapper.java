package com.AExVeS.AExVeS.partner.infrastructure.data.Mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.AExVeS.AExVeS.partner.domain.Models.Partner;
import com.AExVeS.AExVeS.partner.infrastructure.data.Entities.PartnerEntity;

@Mapper(componentModel = "spring")
public interface PartnerEntityMapper {

	@Mapping(source = "_id", target = "_id")
	Partner toDomain(PartnerEntity partnerEntity);
	
	PartnerEntity toEntity(Partner partner);
}
