package com.AExVeS.AExVeS.partner.infrastructure.data.Entities;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@RequiredArgsConstructor
@Getter
@Setter
public class PersonalDataEntity {
	public String fecha_nacimiento;
	public String genero;
	public String direccion;
	public String telefono;
	public String email;
	public String nacionalidad;
	public String otros_datos;
}
