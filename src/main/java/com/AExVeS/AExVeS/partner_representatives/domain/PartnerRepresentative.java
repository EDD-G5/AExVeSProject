package com.AExVeS.AExVeS.partner_representatives.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("representantes_socios")
@NoArgsConstructor
@AllArgsConstructor
public class PartnerRepresentative {
	@Id
	private @Getter String _id;
    private @Getter @Setter String nombre_completo;
    private @Getter @Setter int id_socio_representado;
    private @Getter @Setter String telefono;
    private @Getter @Setter String email;
}
