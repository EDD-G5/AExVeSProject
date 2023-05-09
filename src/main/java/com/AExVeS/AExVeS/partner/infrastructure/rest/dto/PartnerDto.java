package com.AExVeS.AExVeS.partner.infrastructure.rest.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class PartnerDto {
	public String _id;
	public String tipo_socio;
	public int nivel_socio;
	public String nombre_completo;
	public String fecha_alta;
	public String fecha_baja;
	public String estado_cuota_anual;
	public String historial_pagos;
	public String fecha_nacimiento;
	public String genero;
	public String direccion;
	public String telefono;
	public String email;
	public String nacionalidad;
	public String otros_datos;
	public String study_level;
	public String carrer_speciality;
	public String educative_institution;

	@Override
	public String toString() {
		return "PartnerDto [_id=" + _id + ", Tipo_socio=" + tipo_socio + ", nivel_socio=" + nivel_socio
				+ ", nombre_completo=" + nombre_completo + ", fecha_alta=" + fecha_alta + ", fecha_baja=" + fecha_baja
				+ ", estado_cuota_anual=" + estado_cuota_anual + ", historial_pagos=" + historial_pagos
				+ ", fecha_nacimiento=" + fecha_nacimiento + ", genero=" + genero + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", email=" + email + ", nacionalidad=" + nacionalidad + ", otros_datos="
				+ otros_datos + ", study_level=" + study_level + ", carrer_speciality=" + carrer_speciality
				+ ", educative_institution=" + educative_institution + "]";
	}

}
