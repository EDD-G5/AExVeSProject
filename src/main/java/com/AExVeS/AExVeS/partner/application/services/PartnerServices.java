package com.AExVeS.AExVeS.partner.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AExVeS.AExVeS.partner.domain.Models.Partner;
import com.AExVeS.AExVeS.partner.domain.Ports.out.PartnerRepositoryPort;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PartnerServices {
	@Autowired
	private PartnerRepositoryPort partnerRepositoryPort;

	public Partner getPartner(String id) {
		Partner p = partnerRepositoryPort.findById(id);
		System.out.printf("getPartner- PartnerServices- partner: %s\n", p.toString());
		return p;
	}

	public Partner savePartner(Partner Partner) {
		return partnerRepositoryPort.save(Partner);

	}
}
