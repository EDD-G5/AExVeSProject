package com.AExVeS.AExVeS.partner.domain.Models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PersonalData {
    private String fecha_nacimiento;
    private String genero;
    private String direccion;
    private String telefono;
    private String email;
    private String nacionalidad;
    private String otros_datos;
}
