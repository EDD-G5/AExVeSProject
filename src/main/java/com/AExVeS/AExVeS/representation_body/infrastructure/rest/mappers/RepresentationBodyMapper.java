package com.AExVeS.AExVeS.representation_body.infrastructure.rest.mappers;

import org.mapstruct.Mapper;

import com.AExVeS.AExVeS.representation_body.domain.RepresentationBody;
import com.AExVeS.AExVeS.representation_body.infrastructure.rest.dto.RepresentationBodyDto;

@Mapper
public interface RepresentationBodyMapper {
	RepresentationBodyDto toDto(RepresentationBody partner);

	RepresentationBody fromDto(RepresentationBodyDto partnerDto);
}