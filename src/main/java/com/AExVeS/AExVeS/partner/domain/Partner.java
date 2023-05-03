package com.AExVeS.AExVeS.partner.domain;

import java.util.Optional;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("socios")
@AllArgsConstructor
@NoArgsConstructor
public class Partner {
	@Id
	private @Getter String _id;
	@Field("tipo_socio")
    private @Getter @Setter String tipo_socio;
	@Field("nivel_socio")
    private @Getter @Setter int nivel_socio;
	@Field("nombre_completo")
    private @Getter @Setter String nombre_completo;
	@Field("fecha_alta")
    private @Getter @Setter String fecha_alta;
	@Field("fecha_baja")
	private @Getter @Setter Optional<String> fecha_baja;
	@Field("estado_cuota_anual")
    private @Getter @Setter String estado_cuota_anual;
	@Field("historial_pagos")
    private @Getter @Setter String historial_pagos;
	@Field("datos_personales")
    private @Getter @Setter PersonalData datos_personales;
	@Field("estudios")
    private @Getter @Setter Studies estudios;
}
