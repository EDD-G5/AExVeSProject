package com.AExVeS.AExVeS.partner.infrastructure.rest.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.AExVeS.AExVeS.partner.domain.Models.Partner;
import com.AExVeS.AExVeS.partner.infrastructure.rest.dto.PartnerDto;

@Mapper(uses = { PersonalDataMapper.class, StudiesMapper.class })
public interface PartnerMapper {
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
	PartnerDto toDto(Partner partner);

	@Mapping(source = "fecha_nacimiento", target = "datos_personales.fecha_nacimiento")
	@Mapping(source = "genero", target = "datos_personales.genero")
	@Mapping(source = "direccion", target = "datos_personales.direccion")
	@Mapping(source = "telefono", target = "datos_personales.telefono")
	@Mapping(source = "email", target = "datos_personales.email")
	@Mapping(source = "nacionalidad", target = "datos_personales.nacionalidad")
	@Mapping(source = "otros_datos", target = "datos_personales.otros_datos")
	@Mapping(source = "study_level", target = "estudios.study_level")
	@Mapping(source = "carrer_speciality", target = "estudios.carrer_speciality")
	@Mapping(source = "educative_institution", target = "estudios.educative_institution")
	Partner fromDto(PartnerDto partnerDto);
}