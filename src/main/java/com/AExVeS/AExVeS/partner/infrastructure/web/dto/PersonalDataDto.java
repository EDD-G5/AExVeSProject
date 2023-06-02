package com.AExVeS.AExVeS.partner.infrastructure.web.dto;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PersonalDataDto {
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String fecha_nacimiento;

	private String genero;

	private String direccion;
	
	private String telefono;
	
	@Email
	@NotBlank
	private String email;
	
	@NotBlank
	private String nacionalidad;
	
	private String otros_datos;
}
