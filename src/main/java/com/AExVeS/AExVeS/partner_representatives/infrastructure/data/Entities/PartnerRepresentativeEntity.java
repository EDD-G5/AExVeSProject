package com.AExVeS.AExVeS.partner_representatives.infrastructure.data.Entities;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Document("representantes")
public class PartnerRepresentativeEntity {
	private String _id;
	private String nombre_completo;
	private String id_socio_representado;
	private String telefono;
	private String email;
}
