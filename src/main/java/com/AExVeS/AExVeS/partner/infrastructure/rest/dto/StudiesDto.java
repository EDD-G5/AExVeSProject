package com.AExVeS.AExVeS.partner.infrastructure.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudiesDto {
	private String study_level;
	private String carrer_speciality;
	private String educative_institution;

}
