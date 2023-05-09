package com.AExVeS.AExVeS.partner.domain.Models;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Partner {
	@Id
	public String _id;
	public String tipo_socio;
	public Integer nivel_socio;
	public String nombre_completo;
	public String fecha_alta;
	public String fecha_baja;
	public String estado_cuota_anual;
	public String historial_pagos;
	public PersonalData datos_personales = new PersonalData();
	public Studies estudios = new Studies();
}
