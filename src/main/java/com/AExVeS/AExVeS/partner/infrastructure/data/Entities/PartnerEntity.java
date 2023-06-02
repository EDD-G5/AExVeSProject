package com.AExVeS.AExVeS.partner.infrastructure.data.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Document("socios")
public class PartnerEntity {
	@Id
	@NotBlank
	private String _id;
	
	@NotBlank
	@Field("tipo_socio")
	private String tipo_socio;
	
	@NotNull
	@Field("nivel_socio")
	private int nivel_socio;
	
	@NotBlank
	@Field("nombre_completo")
	private String nombre_completo;
	
	@NotBlank
	@Field("fecha_alta")
	private String fecha_alta;
	
	@NotBlank
	@Field("fecha_baja")
	private String fecha_baja;
	
	@NotBlank
	@Field("estado_cuota_anual")
	private String estado_cuota_anual;
	
	@NotBlank
	@Field("historial_pagos")
	private String historial_pagos;

	@NotNull
	@Field("datos_personales")
	private PersonalDataEntity datos_personales;
	
	@NotNull
	@Field("estudios")
	private StudiesEntity estudios;
}
