package com.AExVeS.AExVeS.partner_representatives.infrastructure.rest.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AExVeS.AExVeS.partner_representatives.application.services.PartnerRepresentativeServices;
import com.AExVeS.AExVeS.partner_representatives.domain.PartnerRepresentative;
import com.AExVeS.AExVeS.partner_representatives.infrastructure.rest.dto.PartnerRepresentativeDto;
import com.AExVeS.AExVeS.partner_representatives.infrastructure.rest.mappers.PartnerRepresentativeMapper;

@RestController
@RequestMapping("/api/partner_representatives")
public class PartnerRepresentativeResources {
	@Autowired
	private PartnerRepresentativeServices partnerRepresentativesServices;
	@Autowired
	private PartnerRepresentativeMapper partnerRepresentativeMapper;

	@GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<PartnerRepresentativeDto>> getAll() {
		List<PartnerRepresentative> partnerRepresentatives = partnerRepresentativesServices
				.getAllPartnerRepresentatives();
		List<PartnerRepresentativeDto> partnerRepresentativesdto = new ArrayList<>();
		for (PartnerRepresentative p : partnerRepresentatives)
			partnerRepresentativesdto.add(partnerRepresentativeMapper.toDto(p));
		return new ResponseEntity<>(partnerRepresentativesdto, HttpStatus.OK);
	}

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PartnerRepresentativeDto> getPartnerRepresentativeById(@PathVariable String id) {
		PartnerRepresentativeDto dto = partnerRepresentativeMapper
				.toDto(partnerRepresentativesServices.getPartnerRepresentative(id));
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}

	@PostMapping(value = { "/",
			"" }, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PartnerRepresentativeDto> savePartnerRepresentative(
			@RequestBody PartnerRepresentativeDto partnerReprDto) {
		PartnerRepresentative from = partnerRepresentativeMapper.fromDto(partnerReprDto);
		PartnerRepresentative saved = partnerRepresentativesServices.savePartnerRepresentative(from);
		return new ResponseEntity<>(partnerRepresentativeMapper.toDto(saved), HttpStatus.CREATED);
	}

	@PutMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PartnerRepresentativeDto> updatePartnerRepresentative(
			@RequestBody PartnerRepresentativeDto partnerReprDto) {
		PartnerRepresentative from = partnerRepresentativeMapper.fromDto(partnerReprDto);
		PartnerRepresentative updated = partnerRepresentativesServices.updatePartnerRepresentative(from);
		return new ResponseEntity<>(partnerRepresentativeMapper.toDto(updated), HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> deletePartnerRepresentative(@PathVariable String id) {
		return new ResponseEntity<>(partnerRepresentativesServices.deletePartnerRepresentative(id), HttpStatus.OK);
	}

}
