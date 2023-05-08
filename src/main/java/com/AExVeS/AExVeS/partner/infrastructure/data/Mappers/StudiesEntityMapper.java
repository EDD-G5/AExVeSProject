package com.AExVeS.AExVeS.partner.infrastructure.data.Mappers;

import org.mapstruct.Mapper;

import com.AExVeS.AExVeS.partner.domain.Models.Studies;
import com.AExVeS.AExVeS.partner.infrastructure.data.Entities.StudiesEntity;

@Mapper(componentModel = "spring")
public interface StudiesEntityMapper {
	Studies toDomain(StudiesEntity studiesEntity);

	StudiesEntity toEntity(Studies studies);
}
