package com.AExVeS.AExVeS.representation_body.domain.Ports.out;

import java.util.List;

import org.springframework.stereotype.Component;

import com.AExVeS.AExVeS.representation_body.domain.RepresentationBody;

/**
 * custom interface for the partner repository
 */
@Component
public interface RepresentationBodyRepositoryPort {
	public List<RepresentationBody> findAllPartners();

	public RepresentationBody findById(String id);

	public RepresentationBody save(RepresentationBody partner);

	public boolean deleteById(String id);
}
