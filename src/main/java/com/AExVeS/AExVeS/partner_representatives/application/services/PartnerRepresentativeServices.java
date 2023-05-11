package com.AExVeS.AExVeS.partner_representatives.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AExVeS.AExVeS.partner_representatives.domain.PartnerRepresentative;
import com.AExVeS.AExVeS.partner_representatives.domain.Ports.out.PartnerRepresentativeRepositoryPort;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PartnerRepresentativeServices {
	@Autowired
	private PartnerRepresentativeRepositoryPort partnerRepresentativeRepoPort;

	public List<PartnerRepresentative> getAllPartnerRepresentatives() {
		return partnerRepresentativeRepoPort.findAll();
	}

	public PartnerRepresentative getPartnerRepresentative(String id) {
		return partnerRepresentativeRepoPort.findById(id);
	}

	public PartnerRepresentative savePartnerRepresentative(PartnerRepresentative partnerRepresentative) {
		PartnerRepresentative pr = null;
		partnerRepresentative.set_id(null);
		pr = partnerRepresentativeRepoPort.save(partnerRepresentative);
		return pr;
	}

	public PartnerRepresentative updatePartnerRepresentative(PartnerRepresentative partnerRepresentative) {
		PartnerRepresentative pr = null;
		if (partnerRepresentativeRepoPort.findById(partnerRepresentative.get_id()) != null)
			pr = partnerRepresentativeRepoPort.save(partnerRepresentative);
		return pr;
	}

	public boolean deletePartnerRepresentative(String id) {
		return partnerRepresentativeRepoPort.deleteById(id);
	}
}
