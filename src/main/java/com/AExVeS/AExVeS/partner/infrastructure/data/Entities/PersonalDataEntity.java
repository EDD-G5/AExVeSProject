package com.AExVeS.AExVeS.partner.infrastructure.data.Entities;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PersonalDataEntity {
	@Field("fecha_nacimiento")
	public String fecha_nacimiento;
	@Field("genero")
	public String genero;
	@Field("direccion")
	public String direccion;
	@Field("telefono")
	public String telefono;
	@Field("email")
	public String email;
	@Field("nacionalidad")
	public String nacionalidad;
	@Field("otros_datos")
	public String otros_datos;
}
