package com.AExVeS.AExVeS.representation_body.infrastructure.data.Mappers;

import org.mapstruct.Mapper;

import com.AExVeS.AExVeS.representation_body.domain.RepresentationBody;
import com.AExVeS.AExVeS.representation_body.infrastructure.data.Entities.RepresentationBodyEntity;

@Mapper(componentModel = "spring")
public interface RepresentationBodyEntityMapper {
	RepresentationBody toDomain(RepresentationBodyEntity partnerEntity);

	RepresentationBodyEntity toEntity(RepresentationBody partner);
}
