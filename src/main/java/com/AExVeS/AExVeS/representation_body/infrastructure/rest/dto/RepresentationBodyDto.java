package com.AExVeS.AExVeS.representation_body.infrastructure.rest.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class RepresentationBodyDto {
    public String _id;
    public String nombre;
    public List<String> ids_representantes_socios;
    public String fecha_toma_posesion;
}
