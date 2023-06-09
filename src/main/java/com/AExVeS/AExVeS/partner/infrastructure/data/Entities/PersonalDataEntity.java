package com.AExVeS.AExVeS.partner.infrastructure.data.Entities;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PersonalDataEntity {
	@NotBlank
	private String fecha_nacimiento;
	@NotBlank
	private String genero;
	@NotBlank
	private String direccion;
	@NotBlank
	private String telefono;
	@NotBlank
	private String email;
	@NotBlank
	private String nacionalidad;
	@NotBlank
	private String otros_datos;
}
