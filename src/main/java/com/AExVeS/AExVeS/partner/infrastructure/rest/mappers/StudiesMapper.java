package com.AExVeS.AExVeS.partner.infrastructure.rest.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.AExVeS.AExVeS.partner.domain.Models.Studies;
import com.AExVeS.AExVeS.partner.infrastructure.rest.dto.StudiesDto;

@Mapper
public interface StudiesMapper {
	StudiesDto toDto(Studies studies);

	Studies toDomain(StudiesDto studiesDto);
}