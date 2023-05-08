package com.AExVeS.AExVeS.partner.infrastructure.data.Entities;

import java.util.Optional;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Document("socios")
public class PartnerEntity {
	@Id
	private String _id;
	private String tipo_socio;
	private int nivel_socio;
	private String nombre_completo;
	private String fecha_alta;
	private Optional<String> fecha_baja;
	private String estado_cuota_anual;
	private String historial_pagos;
	private PersonalDataEntity datos_personales;
	private StudiesEntity estudios;
}
