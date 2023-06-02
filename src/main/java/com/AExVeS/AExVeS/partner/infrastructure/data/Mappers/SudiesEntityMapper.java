package com.AExVeS.AExVeS.partner.infrastructure.data.Mappers;

import org.mapstruct.Mapper;

import com.AExVeS.AExVeS.partner.domain.Models.Studies;
import com.AExVeS.AExVeS.partner.infrastructure.data.Entities.StudiesEntity;

@Mapper
public interface SudiesEntityMapper {
	Studies fromEntity(StudiesEntity studiesEntity);
	StudiesEntity toEntity(Studies studies);
}
