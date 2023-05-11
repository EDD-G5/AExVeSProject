package com.AExVeS.AExVeS.partner_representatives.infrastructure.rest.dto;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PartnerRepresentativeDto {
	@Id
    private String _id;
	private String nombre_completo;
	private String id_socio_representado;
	private String telefono;
	private String email;
}
