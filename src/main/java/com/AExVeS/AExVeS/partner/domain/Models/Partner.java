package com.AExVeS.AExVeS.partner.domain.Models;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Partner {
	@Id
	private String _id;
	private String tipo_socio;
	private Integer nivel_socio;
	private String nombre_completo;
	private String fecha_alta;
	private String fecha_baja;
	private String estado_cuota_anual;
	private String historial_pagos;
	private PersonalData datos_personales = new PersonalData();
	private Studies estudios = new Studies();
}
