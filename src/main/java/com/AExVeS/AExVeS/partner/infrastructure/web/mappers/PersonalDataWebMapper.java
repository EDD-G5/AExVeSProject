package com.AExVeS.AExVeS.partner.infrastructure.web.mappers;

import org.mapstruct.Mapper;

import com.AExVeS.AExVeS.partner.domain.Models.PersonalData;
import com.AExVeS.AExVeS.partner.infrastructure.web.dto.PersonalDataDto;

@Mapper
public interface PersonalDataWebMapper {
    PersonalDataDto toDto(PersonalData personalData);
    
    PersonalData toDomain(PersonalDataDto personalDataDto);
}
