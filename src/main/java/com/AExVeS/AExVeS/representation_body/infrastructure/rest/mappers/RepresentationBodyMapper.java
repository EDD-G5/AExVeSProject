package com.AExVeS.AExVeS.representation_body.infrastructure.rest.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.AExVeS.AExVeS.representation_body.domain.RepresentationBody;
import com.AExVeS.AExVeS.representation_body.infrastructure.rest.dto.RepresentationBodyDto;

@Mapper(componentModel = "spring")
public interface RepresentationBodyMapper {
	RepresentationBodyMapper INSTANCE = Mappers.getMapper(RepresentationBodyMapper.class);

	RepresentationBodyDto toDto(RepresentationBody partner);

	RepresentationBody fromDto(RepresentationBodyDto partnerDto);
}