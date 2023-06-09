package com.AExVeS.AExVeS.representation_body.domain;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class RepresentationBody {
    private String _id;
	@NotBlank
    private String nombre;
	@NotEmpty
    private List<String> ids_representantes_socios;
	@NotBlank
    private String fecha_toma_posesion;
}
