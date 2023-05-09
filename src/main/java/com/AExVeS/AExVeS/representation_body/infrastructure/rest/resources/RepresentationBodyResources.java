package com.AExVeS.AExVeS.representation_body.infrastructure.rest.resources;

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

import com.AExVeS.AExVeS.representation_body.application.services.RepresentationBodyServices;
import com.AExVeS.AExVeS.representation_body.domain.RepresentationBody;
import com.AExVeS.AExVeS.representation_body.infrastructure.rest.dto.RepresentationBodyDto;
import com.AExVeS.AExVeS.representation_body.infrastructure.rest.mappers.RepresentationBodyMapper;

@RestController
@RequestMapping("/api/representation_bodies")
@ComponentScan("com.AExVeS.AExVeS.representation_bodies")
public class RepresentationBodyResources {
	@Autowired
	private RepresentationBodyServices representationBodiesServices;
	@Autowired
	private RepresentationBodyMapper representationBodyMapper;

	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<RepresentationBodyDto>> getAll() {
		List<RepresentationBody> ps = representationBodiesServices.getAllRepresentationBodies();
		List<RepresentationBodyDto> psdto = new ArrayList<>();
		
		for(RepresentationBody p : ps) {
			RepresentationBodyDto dto = representationBodyMapper.toDto(p);
			psdto.add(dto);
		}
		
		return new ResponseEntity<>(psdto, HttpStatus.OK);
	}
	@GetMapping(value = "/representation_body/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RepresentationBodyDto> getUserById(@PathVariable String id) {
		RepresentationBodyDto dto = representationBodyMapper.toDto(representationBodiesServices.getRepresentationBody(id));
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}

	@PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RepresentationBodyDto> saveUser(@RequestBody RepresentationBodyDto RepresentationBodyDto) {
		RepresentationBodyDto dto = representationBodyMapper.toDto(representationBodiesServices.saveRepresentationBody(representationBodyMapper.fromDto(RepresentationBodyDto)));
		return new ResponseEntity<>(dto, HttpStatus.CREATED);
	}

	@PutMapping(value = "/representation_body", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RepresentationBodyDto> updateUser(@RequestBody RepresentationBodyDto RepresentationBodyDto) {
		RepresentationBodyDto RepresentationBodydto = representationBodyMapper.toDto(representationBodiesServices.saveRepresentationBody(representationBodyMapper.fromDto(RepresentationBodyDto)));
		return new ResponseEntity<>(RepresentationBodydto, HttpStatus.OK);
	}

	@DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> deleteUser(@PathVariable String id) {
		return new ResponseEntity<>(representationBodiesServices.deleteRepresentationBodies(id), HttpStatus.OK);
	}

}
