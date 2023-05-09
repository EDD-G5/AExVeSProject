package com.AExVeS.AExVeS.partner.infrastructure.rest.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class PersonalDataDto {
	private String fecha_nacimiento;
	private String genero;
	private String direccion;
	private String telefono;
	private String email;
	private String nacionalidad;
	private String otros_datos;
}
