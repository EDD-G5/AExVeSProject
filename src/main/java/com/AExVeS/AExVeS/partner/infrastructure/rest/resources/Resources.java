//package com.AExVeS.AExVeS.partner.infrastructure.rest.resources;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.AExVeS.AExVeS.partner.application.services.PartnerServices;
//import com.AExVeS.AExVeS.partner.infrastructure.rest.dto.PartnerDto;
//import com.AExVeS.AExVeS.partner.infrastructure.rest.mappers.PartnerMapper;
//
//@RestController
//@RequestMapping("/api")
//public class Resources {
//	@Autowired
//	private PartnerServices partnerServices;
//	@Autowired
//	private PartnerMapper partnerMapper;
//
//	@GetMapping("users/user/{id}")
//	public ResponseEntity<PartnerDto> getUserById(@PathVariable String id) {
//		
//		PartnerDto dto= partnerMapper.toDto(partnerServices.getPartner(id));
//		System.out.printf("---------------%s--------------",dto);
//		return new ResponseEntity<>(dto, HttpStatus.OK);
//
//	}
//
//	@PostMapping("users")
//	public ResponseEntity<PartnerDto> saveUser(@RequestBody PartnerDto partnerDto) {
//		PartnerDto dto = partnerMapper.toDto(partnerServices.savePartner(partnerMapper.toDomain(partnerDto)));
//		return new ResponseEntity<>(dto,
//				HttpStatus.CREATED);
//
//	}
//
//}
