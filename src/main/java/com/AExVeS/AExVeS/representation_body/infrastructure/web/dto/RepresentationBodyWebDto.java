package com.AExVeS.AExVeS.representation_body.infrastructure.web.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class RepresentationBodyWebDto {
	
    private String id;
    @NotBlank
    private String nombre;
    @NotBlank
    private String ids_representantes_socios;
    @NotBlank
    private String fecha_toma_posesion;
}
