package com.AExVeS.AExVeS.partner.infrastructure.data.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document("socios")
public class PartnerEntity {
	@Id
	public String _id;
	@Field("tipo_socio")
	public String tipo_socio;
	@Field("nivel_socio")
	public int nivel_socio;
	@Field("nombre_completo")
	public String nombre_completo;
	@Field("fecha_alta")
	public String fecha_alta;
	@Field("fecha_baja")
	public String fecha_baja;
	@Field("estado_cuota_anual")
	public String estado_cuota_anual;
	@Field("historial_pagos")
	public String historial_pagos;
	@Field("datos_personales")
	public PersonalDataEntity datos_personales;
	@Field("estudios")
	public StudiesEntity estudios;
}
