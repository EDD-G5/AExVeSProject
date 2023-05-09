package com.AExVeS.AExVeS.representation_body.infrastructure.data.Entities;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document("organos")
public class RepresentationBodyEntity {
	public String _id;
	public String nombre;
	public List<String> ids_representantes_socios;
	public String fecha_toma_posesion;
}
