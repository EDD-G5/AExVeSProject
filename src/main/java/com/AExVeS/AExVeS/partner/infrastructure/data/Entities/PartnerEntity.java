package com.AExVeS.AExVeS.partner.infrastructure.data.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Document("socios")
public class PartnerEntity {
	@Id
	private String _id;
	@Field("tipo_socio")
	private String tipo_socio;
	@Field("nivel_socio")
	private int nivel_socio;
	@Field("nombre_completo")
	private String nombre_completo;
	@Field("fecha_alta")
	private String fecha_alta;
	@Field("fecha_baja")
	private String fecha_baja;
	@Field("estado_cuota_anual")
	private String estado_cuota_anual;
	@Field("historial_pagos")
	private String historial_pagos;
	@Field("datos_personales")
	private PersonalDataEntity datos_personales;
	@Field("estudios")
	private StudiesEntity estudios;
}
