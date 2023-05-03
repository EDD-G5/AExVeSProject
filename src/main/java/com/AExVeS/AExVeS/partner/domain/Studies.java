package com.AExVeS.AExVeS.partner.domain;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Studies {
    @Field("nivel_estudios")
	private @Getter @Setter String study_level;
    @Field("carrera_especialidad")
    private @Getter @Setter String carrer_speciality;
    @Field("institucion_educativa")
    private @Getter @Setter String educative_institution;
}
