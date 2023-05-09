package com.AExVeS.AExVeS.representation_body.infrastructure.adapters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.AExVeS.AExVeS.representation_body.domain.RepresentationBody;
import com.AExVeS.AExVeS.representation_body.domain.Ports.out.RepresentationBodyRepositoryPort;
import com.AExVeS.AExVeS.representation_body.infrastructure.data.RepresentationBodyMongoRepository;
import com.AExVeS.AExVeS.representation_body.infrastructure.data.Entities.RepresentationBodyEntity;
import com.AExVeS.AExVeS.representation_body.infrastructure.data.Mappers.RepresentationBodyEntityMapper;

@Component
public class RepresentationBodyMongoAdapter implements RepresentationBodyRepositoryPort {
	@Autowired
	private RepresentationBodyMongoRepository representationBodyMongoRepository;

	@Autowired
	private RepresentationBodyEntityMapper representationBodyEntityMapper;

	public List<RepresentationBody> findAllPartners() {
		List<RepresentationBodyEntity> all = representationBodyMongoRepository.findAll();
		List<RepresentationBody> allDomain = new ArrayList<>();
		for (RepresentationBodyEntity pe : all) {
			RepresentationBody mapped = representationBodyEntityMapper.toDomain(pe);
			allDomain.add(mapped);
		}
		return allDomain;
	}

	public RepresentationBody findById(String id) {
		return representationBodyEntityMapper.toDomain(representationBodyMongoRepository.findById(id).orElseThrow());
	}

	public RepresentationBody save(RepresentationBody representationBody) {
		return representationBodyEntityMapper.toDomain(representationBodyMongoRepository.save(representationBodyEntityMapper.toEntity(representationBody)));
	}

	public boolean deleteById(String id) {
		representationBodyMongoRepository.deleteById(id);
		return !representationBodyMongoRepository.existsById(id);
	}
}
