package com.AExVeS.AExVeS.partner_representatives.infrastructure.web.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PartnerRepresentativeWebDto {
    private String id;
    @NotBlank
	private String nombre_completo;
    @NotBlank
	private String id_socio_representado;
    @NotBlank
	private String telefono;
    @NotBlank
	private String email;
}
