package com.AExVeS.AExVeS.partner.domain.Models;

import java.util.Optional;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Partner {
	@Id
	private String _id;
	private String tipo_socio;
	private int nivel_socio;
	private String nombre_completo;
	private String fecha_alta;
	private Optional<String> fecha_baja;
	private String estado_cuota_anual;
	private String historial_pagos;
	private PersonalData datos_personales;
	private Studies estudios;
}
