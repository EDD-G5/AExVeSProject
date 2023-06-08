package com.AExVeS.AExVeS.partner_representatives.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AExVeS.AExVeS.partner.domain.Models.Partner;
import com.AExVeS.AExVeS.partner.domain.Ports.out.PartnerRepositoryPort;
import com.AExVeS.AExVeS.partner_representatives.domain.PartnerRepresentative;
import com.AExVeS.AExVeS.partner_representatives.domain.Ports.out.PartnerRepresentativeRepositoryPort;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PartnerRepresentativeServices {
	@Autowired
	private PartnerRepresentativeRepositoryPort partnerRepresentativeRepoPort;
	@Autowired
	private PartnerRepositoryPort partnerRepoPort;

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
		return partnerRepresentativeRepoPort.findById(partnerRepresentative.get_id())!= null 
				? partnerRepresentativeRepoPort.save(partnerRepresentative)
				: null;
	}

	public boolean deletePartnerRepresentative(String id) {
		return partnerRepresentativeRepoPort.deleteById(id);
	}
	
	public Partner getRepresentedPartner(String representative_id) {
		PartnerRepresentative pr = partnerRepresentativeRepoPort.findById(representative_id);
		System.out.println(pr);
		String partner_id = pr.getId_socio_representado();
		System.out.println(partner_id);
		return partnerRepoPort.findById(partner_id);
	}
}
