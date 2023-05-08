package com.AExVeS.AExVeS.partner.infrastructure.rest.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.AExVeS.AExVeS.partner.domain.Models.Partner;
import com.AExVeS.AExVeS.partner.infrastructure.rest.dto.PartnerDto;

@Mapper(componentModel = "spring")
public interface PartnerMapper {

	@Mapping(source="datos_personales", target = ".")
	@Mapping(source="estudios", target = ".")
	PartnerDto toDto(Partner partner);
	
	@Mapping(source=".", target = "datos_personales")
	@Mapping(source=".", target = "estudios")
	Partner toDomain(PartnerDto userDto);
}
