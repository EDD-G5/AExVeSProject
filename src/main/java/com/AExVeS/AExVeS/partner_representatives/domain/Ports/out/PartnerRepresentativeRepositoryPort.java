package com.AExVeS.AExVeS.partner_representatives.domain.Ports.out;

import java.util.List;

import org.springframework.stereotype.Component;

import com.AExVeS.AExVeS.partner_representatives.domain.PartnerRepresentative;

@Component
public interface PartnerRepresentativeRepositoryPort {
	public List<PartnerRepresentative> findAll();

	public PartnerRepresentative findById(String id);

	public PartnerRepresentative save(PartnerRepresentative partnerRepresentative);

	public boolean deleteById(String id);
}
