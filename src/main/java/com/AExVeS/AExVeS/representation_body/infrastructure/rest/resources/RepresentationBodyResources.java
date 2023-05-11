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

	@GetMapping(value = {"/", ""}, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<RepresentationBodyDto>> getAll() {
		List<RepresentationBody> representation_bodies = representationBodiesServices.getAllRepresentationBodies();
		List<RepresentationBodyDto> representation_bodiesdto = new ArrayList<>();
		for (RepresentationBody p : representation_bodies)
			representation_bodiesdto.add(representationBodyMapper.toDto(p));
		return new ResponseEntity<>(representation_bodiesdto, HttpStatus.OK);
	}

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RepresentationBodyDto> getRepresentationBodyById(@PathVariable String id) {
		RepresentationBody found = representationBodiesServices.getRepresentationBody(id);
		return new ResponseEntity<>(representationBodyMapper.toDto(found), HttpStatus.OK);
	}

	@PostMapping(value = {"/", ""}, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RepresentationBodyDto> saveRepresentationBody(@RequestBody RepresentationBodyDto RepresentationBodyDto) {
		RepresentationBody from = representationBodyMapper.fromDto(RepresentationBodyDto);
		RepresentationBody saved = representationBodiesServices.saveRepresentationBody(from);
		return new ResponseEntity<>(representationBodyMapper.toDto(saved), HttpStatus.CREATED);
	}

	@PutMapping(value = {"/", ""}, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RepresentationBodyDto> updateRepresentationBody(@RequestBody RepresentationBodyDto RepresentationBodyDto) {
		RepresentationBody from = representationBodyMapper.fromDto(RepresentationBodyDto);
		RepresentationBody updated = representationBodiesServices.updateRepresentationBody(from);
		return new ResponseEntity<>(representationBodyMapper.toDto(updated), HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> deleteRepresentationBody(@PathVariable String id) {
		return new ResponseEntity<>(representationBodiesServices.deleteRepresentationBodies(id), HttpStatus.OK);
	}

}
