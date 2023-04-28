package com.AExVeS.AExVeS.Dominio;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("socios")
@NoArgsConstructor
@AllArgsConstructor
public class Socio {
	@Field(name = "info_asociativa")
	public InfoAsociativa info_asociativa;
	@Field(name = "info_sociodemografica")
	public InfoSocioDemografica info_sociodemografica;
	@Field(name = "info_academica")
	public InfoAcademica info_academica;

	@NoArgsConstructor
	@AllArgsConstructor
	public class InfoAsociativa {
		@Id
		public @Getter @Setter String _id;
		public @Getter @Setter String tipo_socio;
		public @Getter @Setter int nivel_socio;
		public @Getter @Setter String nombre_completo;
		public @Getter @Setter Object fecha_alta;
		public @Getter @Setter String estado_cuota_anual;
		public @Getter @Setter String historial_pagos;
	}

	@NoArgsConstructor
	@AllArgsConstructor
	public class InfoSocioDemografica {
		public @Getter @Setter String fecha_nacimiento;
		public @Getter @Setter String genero;
		public @Getter @Setter String direccion;
		public @Getter @Setter String telefono;
		public @Getter @Setter String email;
		public @Getter @Setter String nacionalidad;
		public @Getter @Setter String otros_datos;
	}
	
	@NoArgsConstructor
	@AllArgsConstructor
	public class InfoAcademica {
		public @Getter @Setter String nivel_estudios;
		public @Getter @Setter String carrera_especialidad;
		public @Getter @Setter String institucion_educativa;
	}
}
