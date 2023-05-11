package com.AExVeS.AExVeS.partner_representatives.infrastructure.rest.mappers;

import org.mapstruct.Mapper;

import com.AExVeS.AExVeS.partner_representatives.domain.PartnerRepresentative;
import com.AExVeS.AExVeS.partner_representatives.infrastructure.rest.dto.PartnerRepresentativeDto;

@Mapper
public interface PartnerRepresentativeMapper {
	PartnerRepresentativeDto toDto(PartnerRepresentative partner);
	PartnerRepresentative fromDto(PartnerRepresentativeDto partnerDto);
}
