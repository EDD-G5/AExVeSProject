package com.AExVeS.AExVeS.partner.infrastructure.adapters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.AExVeS.AExVeS.partner.domain.Models.Partner;
import com.AExVeS.AExVeS.partner.domain.Ports.out.PartnerRepositoryPort;
import com.AExVeS.AExVeS.partner.infrastructure.data.PartnerMongoRepository;
import com.AExVeS.AExVeS.partner.infrastructure.data.Entities.PartnerEntity;
import com.AExVeS.AExVeS.partner.infrastructure.data.Mappers.PartnerEntityMapper;


@Component
public class PartnerMongoAdapter implements PartnerRepositoryPort {
	@Autowired
	private PartnerMongoRepository partnerMongoRepository;

	@Autowired
	private PartnerEntityMapper partnerEntityMapper;

	public List<Partner> findAllPartners() {
		List<PartnerEntity> all = partnerMongoRepository.findAll();
		List<Partner> allDomain = new ArrayList<>();
		for (PartnerEntity pe : all) {
			Partner mapped = partnerEntityMapper.toDomain(pe);
			allDomain.add(mapped);
		}
		return allDomain;
	}

	public Partner findById(String id) {
		return partnerEntityMapper.toDomain(partnerMongoRepository.findById(id).orElseThrow());
	}

	public Partner save(Partner partner) {
		return partnerEntityMapper.toDomain(partnerMongoRepository.save(partnerEntityMapper.toEntity(partner)));
	}

	public boolean deleteById(String id) {
		partnerMongoRepository.deleteById(id);
		return !partnerMongoRepository.existsById(id);
	}
}
