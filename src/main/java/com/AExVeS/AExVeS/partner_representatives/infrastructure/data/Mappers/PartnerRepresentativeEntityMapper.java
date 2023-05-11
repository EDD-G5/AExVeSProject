package com.AExVeS.AExVeS.partner_representatives.infrastructure.data.Mappers;

import org.mapstruct.Mapper;

import com.AExVeS.AExVeS.partner_representatives.domain.PartnerRepresentative;
import com.AExVeS.AExVeS.partner_representatives.infrastructure.data.Entities.PartnerRepresentativeEntity;

@Mapper(componentModel = "spring")
public interface PartnerRepresentativeEntityMapper {
	PartnerRepresentative toDomain(PartnerRepresentativeEntity partnerRepresentativeEntity);

	PartnerRepresentativeEntity toEntity(PartnerRepresentative partnerRepresentative);
}
