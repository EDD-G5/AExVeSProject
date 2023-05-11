package com.AExVeS.AExVeS.partner.infrastructure.rest.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.AExVeS.AExVeS.partner.domain.Models.PersonalData;
import com.AExVeS.AExVeS.partner.infrastructure.rest.dto.PersonalDataDto;

@Mapper
public interface PersonalDataMapper {
    PersonalDataDto toDto(PersonalData personalData);
    
    PersonalData toDomain(PersonalDataDto personalDataDto);
}
