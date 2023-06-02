package com.AExVeS.AExVeS.partner.infrastructure.web.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@RequiredArgsConstructor
public class PartnerDto {
    private String id;
    @NotEmpty
    private String tipo_socio;
    @NotNull
    @Size(min = 0, max = 50000)
    private int nivel_socio;
    @NotEmpty
    @Length(min = 50, max = 150)
    private String nombre_completo;
    @NotEmpty
    @DateTimeFormat(pattern = "EEE MMM dd HH:mm:ss 'CET' yyyy")
    private String fecha_alta;
    @DateTimeFormat(pattern = "EEE MMM dd HH:mm:ss 'CET' yyyy")
    private String fecha_baja;
    @NotEmpty
    private String estado_cuota_anual;
    @NotEmpty
    private String historial_pagos;
    @NotEmpty
    @DateTimeFormat(pattern = "EEE MMM dd HH:mm:ss 'CET' yyyy")
    private String fecha_nacimiento;
    @NotEmpty
    @Length(min = 3, max = 5)
    private String genero;
    @NotEmpty
    private String direccion;
    @NotEmpty
    private String telefono;
    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    private String nacionalidad;
    private String otros_datos;
    @NotEmpty
    private String study_level;
    @NotEmpty
    private String carrer_speciality;
    @NotEmpty
    private String educative_institution;
}
