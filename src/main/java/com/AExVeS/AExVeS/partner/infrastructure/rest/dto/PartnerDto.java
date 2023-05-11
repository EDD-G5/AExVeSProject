package com.AExVeS.AExVeS.partner.infrastructure.rest.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PartnerDto {
	private String _id;
	private String tipo_socio;
	private int nivel_socio;
	private String nombre_completo;
	private String fecha_alta;
	private String fecha_baja;
	private String estado_cuota_anual;
	private String historial_pagos;
	private String fecha_nacimiento;
	private String genero;
	private String direccion;
	private String telefono;
	private String email;
	private String nacionalidad;
	private String otros_datos;
	private String study_level;
	private String carrer_speciality;
	private String educative_institution;
}
