package com.AExVeS.AExVeS.partner.domain.Ports.out;

import java.util.List;

import org.springframework.stereotype.Component;

import com.AExVeS.AExVeS.partner.domain.Models.Partner;

/**
 * custom interface for the partner repository
 */
@Component
public interface PartnerRepositoryPort {
	public List<Partner> findAllPartners();

	public Partner findById(String id);

	public Partner save(Partner partner);

	public boolean deleteById(String id);
}
