package com.AExVeS.AExVeS.representation_body.infrastructure.web.mappers;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.AExVeS.AExVeS.representation_body.domain.RepresentationBody;
import com.AExVeS.AExVeS.representation_body.infrastructure.web.dto.RepresentationBodyWebDto;

@Mapper
public interface RepresentationBodyWebMapper {
	@Mapping(source = "_id", target = "id")
	RepresentationBodyWebDto toDto(RepresentationBody body);
	@InheritInverseConfiguration
	RepresentationBody fromDto(RepresentationBodyWebDto bodyWebDto);
}