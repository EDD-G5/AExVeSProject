package com.AExVeS.AExVeS.partner.infrastructure.rest.mappers;

import org.mapstruct.Mapper;

import com.AExVeS.AExVeS.partner.domain.Models.Studies;
import com.AExVeS.AExVeS.partner.infrastructure.rest.dto.StudiesDto;

@Mapper
public interface StudiesMapper {
	StudiesDto toDto(Studies studies);

	Studies toDomain(StudiesDto studiesDto);
}