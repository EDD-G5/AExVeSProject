package com.AExVeS.AExVeS.partner_representatives.infrastructure.adapters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.AExVeS.AExVeS.partner_representatives.domain.PartnerRepresentative;
import com.AExVeS.AExVeS.partner_representatives.domain.Ports.out.PartnerRepresentativeRepositoryPort;
import com.AExVeS.AExVeS.partner_representatives.infrastructure.data.PartnerRepresentativeMongoRepository;
import com.AExVeS.AExVeS.partner_representatives.infrastructure.data.Entities.PartnerRepresentativeEntity;
import com.AExVeS.AExVeS.partner_representatives.infrastructure.data.Mappers.PartnerRepresentativeEntityMapper;

@Component
public class PartnerRepresentativeMongoAdapter implements PartnerRepresentativeRepositoryPort {
	@Autowired
	private PartnerRepresentativeMongoRepository patnerRepresentativesMongoRepository;

	@Autowired
	private PartnerRepresentativeEntityMapper partnerRepresentativeEntityMapper;

	public List<PartnerRepresentative> findAll() {
		List<PartnerRepresentativeEntity> partnerRepresentativeEntities = patnerRepresentativesMongoRepository.findAll();
		List<PartnerRepresentative> partnerRepresentatives = new ArrayList<>();
		for (PartnerRepresentativeEntity pe : partnerRepresentativeEntities)
			partnerRepresentatives.add(partnerRepresentativeEntityMapper.toDomain(pe));
		return partnerRepresentatives;
	}

	public PartnerRepresentative findById(String id) {
		return partnerRepresentativeEntityMapper.toDomain(patnerRepresentativesMongoRepository.findById(id).orElseThrow());
	}

	public PartnerRepresentative save(PartnerRepresentative partnerRepresentative) {
		return partnerRepresentativeEntityMapper.toDomain(patnerRepresentativesMongoRepository.save(partnerRepresentativeEntityMapper.toEntity(partnerRepresentative)));
	}

	public boolean deleteById(String id) {
		patnerRepresentativesMongoRepository.deleteById(id);
		return !patnerRepresentativesMongoRepository.existsById(id);
	}
}
