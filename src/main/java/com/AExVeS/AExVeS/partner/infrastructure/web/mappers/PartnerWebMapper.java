package com.AExVeS.AExVeS.partner.infrastructure.web.mappers;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.AExVeS.AExVeS.partner.domain.Models.Partner;
import com.AExVeS.AExVeS.partner.infrastructure.web.dto.PartnerDto;

@Mapper(uses = { PersonalDataWebMapper.class, StudiesWebMapper.class })
public interface PartnerWebMapper {
	@Mapping(source = "datos_personales.fecha_nacimiento", target = "fecha_nacimiento")
	@Mapping(source = "datos_personales.genero", target = "genero")
	@Mapping(source = "datos_personales.direccion", target = "direccion")
	@Mapping(source = "datos_personales.telefono", target = "telefono")
	@Mapping(source = "datos_personales.email", target = "email")
	@Mapping(source = "datos_personales.nacionalidad", target = "nacionalidad")
	@Mapping(source = "datos_personales.otros_datos", target = "otros_datos")
	@Mapping(source = "estudios.study_level", target = "study_level")
	@Mapping(source = "estudios.carrer_speciality", target = "carrer_speciality")
	@Mapping(source = "estudios.educative_institution", target = "educative_institution")
	@Mapping(source = "_id", target = "id")
	PartnerDto toDto(Partner partner);

	@InheritInverseConfiguration
	Partner fromDto(PartnerDto partnerDto); 
}