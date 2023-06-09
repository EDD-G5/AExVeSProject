package com.AExVeS.AExVeS.partner_representatives.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("representantes_socios")
public class PartnerRepresentative {
	@Id
	private String _id;
	private String nombre_completo;
	private String id_socio_representado;
	private String telefono;
	private String email;
}
