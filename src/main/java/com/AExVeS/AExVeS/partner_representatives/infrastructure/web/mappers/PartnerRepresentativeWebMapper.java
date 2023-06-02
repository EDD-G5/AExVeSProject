package com.AExVeS.AExVeS.partner_representatives.infrastructure.web.mappers;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.AExVeS.AExVeS.partner_representatives.domain.PartnerRepresentative;
import com.AExVeS.AExVeS.partner_representatives.infrastructure.web.dto.PartnerRepresentativeWebDto;

@Mapper
public interface PartnerRepresentativeWebMapper {
	@Mapping(source = "_id", target = "id")
	PartnerRepresentativeWebDto toDto(PartnerRepresentative partnerRepresentative);
	@InheritInverseConfiguration
	PartnerRepresentative fromDto(PartnerRepresentativeWebDto partnerRepresentativeWebDto);
}
