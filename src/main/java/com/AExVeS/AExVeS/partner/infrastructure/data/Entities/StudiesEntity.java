package com.AExVeS.AExVeS.partner.infrastructure.data.Entities;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudiesEntity {
	@NotBlank
	private String study_level;
	@NotBlank
	private String carrer_speciality;
	@NotBlank
	private String educative_institution;
}
