package com.AExVeS.AExVeS.partner.infrastructure.data.Entities;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudiesEntity {
	@Field("nivel_estudios")
	private String study_level;
	@Field("carrera_especialidad")
	private String carrer_speciality;
	@Field("institucion_educativa")
	private String educative_institution;
}
