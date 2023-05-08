package com.AExVeS.AExVeS.partner.infrastructure.rest.dto;

import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@RequiredArgsConstructor
public class PartnerDto {
	private String _id;
	private String tipo_socio;
	private int nivel_socio;
	private String nombre_completo;
	private String fecha_alta;
	private Optional<String> fecha_baja;
	private String estado_cuota_anual;
	private String historial_pagos;
	public String fecha_nacimiento;
	public String genero;
	public String direccion;
	public String telefono;
	public String email;
	public String nacionalidad;
	public String otros_datos;
	private String study_level;
	private String carrer_speciality;
	private String educative_institution;
}
