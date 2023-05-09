package com.AExVeS.AExVeS.partner.domain.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PersonalData {
    public String fecha_nacimiento;
    public String genero;
    public String direccion;
    public String telefono;
    public String email;
    public String nacionalidad;
    public String otros_datos;
}
