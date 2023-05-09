package com.AExVeS.AExVeS.partner.infrastructure.rest.resources;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
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

import com.AExVeS.AExVeS.partner.application.services.PartnerServices;
import com.AExVeS.AExVeS.partner.domain.Models.Partner;
import com.AExVeS.AExVeS.partner.infrastructure.rest.dto.PartnerDto;
import com.AExVeS.AExVeS.partner.infrastructure.rest.mappers.PartnerMapper;

@RestController
@RequestMapping("/api/partners")
@ComponentScan("com.AExVeS.AExVeS")
public class PartnerResources {
	@Autowired
	private PartnerServices partnerServices;
	@Autowired
	private PartnerMapper partnerMapper;

	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<PartnerDto>> getAll() {
		List<Partner> ps = partnerServices.getAllPartners();
		List<PartnerDto> psdto = new ArrayList<>();
		
		for(Partner p : ps) {
			PartnerDto dto = partnerMapper.toDto(p);
			psdto.add(dto);
		}
		
		return new ResponseEntity<>(psdto, HttpStatus.OK);
	}
	@GetMapping(value = "/partner/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PartnerDto> getUserById(@PathVariable String id) {
		PartnerDto dto = partnerMapper.toDto(partnerServices.getPartner(id));
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}

	@PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PartnerDto> saveUser(@RequestBody PartnerDto partnerDto) {
		PartnerDto dto = partnerMapper.toDto(partnerServices.savePartner(partnerMapper.fromDto(partnerDto)));
		return new ResponseEntity<>(dto, HttpStatus.CREATED);
	}

	@PutMapping(value = "/partner", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PartnerDto> updateUser(@RequestBody PartnerDto partnerDto) {
		PartnerDto partnerdto = partnerMapper.toDto(partnerServices.savePartner(partnerMapper.fromDto(partnerDto)));
		return new ResponseEntity<>(partnerdto, HttpStatus.OK);
	}

	@DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> deleteUser(@PathVariable String id) {
		return new ResponseEntity<>(partnerServices.deletePartner(id), HttpStatus.OK);
	}

}
