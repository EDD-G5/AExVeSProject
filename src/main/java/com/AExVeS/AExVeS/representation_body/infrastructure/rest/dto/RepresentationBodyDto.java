package com.AExVeS.AExVeS.representation_body.infrastructure.rest.dto;

import java.util.List;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class RepresentationBodyDto {
    private String _id;
    private String nombre;
    private List<String> ids_representantes_socios;
    private String fecha_toma_posesion;
}
