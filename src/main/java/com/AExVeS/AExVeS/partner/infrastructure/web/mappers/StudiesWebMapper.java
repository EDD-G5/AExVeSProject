package com.AExVeS.AExVeS.partner.infrastructure.web.mappers;

import org.mapstruct.Mapper;

import com.AExVeS.AExVeS.partner.domain.Models.Studies;
import com.AExVeS.AExVeS.partner.infrastructure.web.dto.StudiesDto;

@Mapper
public interface StudiesWebMapper {
	StudiesDto toDto(Studies studies);

	Studies toDomain(StudiesDto studiesDto);
}