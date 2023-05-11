package com.AExVeS.AExVeS.representation_body.infrastructure.data.Entities;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Document("organos")
public class RepresentationBodyEntity {
	private String _id;
	private String nombre;
	private List<String> ids_representantes_socios;
	private String fecha_toma_posesion;
}
