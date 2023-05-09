package com.AExVeS.AExVeS.partner.infrastructure.data.Mappers;

import org.mapstruct.Mapper;

import com.AExVeS.AExVeS.partner.domain.Models.PersonalData;
import com.AExVeS.AExVeS.partner.infrastructure.data.Entities.PersonalDataEntity;

@Mapper(componentModel = "spring")
public interface PersonalDataEntityMapper {
	PersonalData toDomain(PersonalDataEntity personalDataEntity);
	
	PersonalDataEntity toEntity(PersonalData personalData);
}
