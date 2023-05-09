package com.AExVeS.AExVeS.representation_body.domain;

import java.util.List;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class RepresentationBody {
    public String _id;
    public String nombre;
    public List<String> ids_representantes_socios;
    public String fecha_toma_posesion;
}
