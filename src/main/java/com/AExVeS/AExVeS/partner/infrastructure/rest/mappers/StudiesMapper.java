package com.AExVeS.AExVeS.partner.infrastructure.rest.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.AExVeS.AExVeS.partner.domain.Models.Studies;
import com.AExVeS.AExVeS.partner.infrastructure.rest.dto.StudiesDto;

@Mapper(componentModel = "spring")
public interface StudiesMapper {
    
    StudiesMapper INSTANCE = Mappers.getMapper(StudiesMapper.class);
    
    StudiesDto toDto(Studies studies);
    
    Studies toDomain(StudiesDto studiesDto);
}