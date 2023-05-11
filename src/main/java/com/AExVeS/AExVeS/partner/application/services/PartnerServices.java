package com.AExVeS.AExVeS.partner.application.services;

import java.util.List;

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

	public List<Partner> getAllPartners() {
		return partnerRepositoryPort.findAll();
	}

	public Partner getPartner(String id) {
		return partnerRepositoryPort.findById(id);
	}

	public Partner savePartner(Partner partner) {
		partner.set_id(null);
		return partnerRepositoryPort.save(partner);
	}

	public Partner updatePartner(Partner partner) {
		Partner updated = null;
		if (partner.get_id() != null || partner.get_id() != "")
			updated = partnerRepositoryPort.save(partner);
		return updated;
	}

	public boolean deletePartner(String id) {
		return partnerRepositoryPort.deleteById(id);
	}
}
