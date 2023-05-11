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

	public List<Partner> findAll() {
		List<PartnerEntity> partnerEntities = partnerMongoRepository.findAll();
		List<Partner> partners = new ArrayList<>();
		for (PartnerEntity pe : partnerEntities) {
			partners.add(partnerEntityMapper.toDomain(pe));
		}
		return partners;
	}

	public Partner findById(String id) {
		return partnerEntityMapper.toDomain(partnerMongoRepository.findById(id).orElseThrow());
	}

	public Partner save(Partner partner) {
		PartnerEntity pe = partnerEntityMapper.toEntity(partner);
		PartnerEntity saved = partnerMongoRepository.save(pe);
		return partnerEntityMapper.toDomain(saved);
	}

	public boolean deleteById(String id) {
		partnerMongoRepository.deleteById(id);
		return !partnerMongoRepository.existsById(id);
	}
}
