package com.AExVeS.AExVeS.partner.infrastructure.rest.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PersonalDataDto {
	private String fecha_nacimiento;
	private String genero;
	private String direccion;
	private String telefono;
	private String email;
	private String nacionalidad;
	private String otros_datos;
}
