package com.AExVeS.AExVeS.partner.infrastructure.web.dto;

import jakarta.validation.constraints.*;
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
    @Min(value = 0)
    @Max(value = 10000)
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
    @Pattern(regexp = "^(Calle|Carrera|Diagonal)\\s\\d{2}\\s#\\d{2}-\\d{2}\\s[a-zA-Z\\s]+$", message = "Not a valid direction")
    private String direccion;
    @NotEmpty
    @Pattern(regexp = "(\\+34)?[ -]*(6 | 7)[ -]*([0-9][ -]*){8}",message = "Not a valid number")
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
