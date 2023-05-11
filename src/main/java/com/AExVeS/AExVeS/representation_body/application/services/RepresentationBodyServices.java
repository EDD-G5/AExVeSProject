package com.AExVeS.AExVeS.representation_body.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AExVeS.AExVeS.representation_body.domain.RepresentationBody;
import com.AExVeS.AExVeS.representation_body.domain.Ports.out.RepresentationBodyRepositoryPort;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class RepresentationBodyServices {
	@Autowired
	private RepresentationBodyRepositoryPort representationBodyRepoPort;

	public List<RepresentationBody> getAllRepresentationBodies() {
		return representationBodyRepoPort.findAll();
	}

	public RepresentationBody getRepresentationBody(String id) {
		return representationBodyRepoPort.findById(id);
	}

	public RepresentationBody saveRepresentationBody(RepresentationBody representationBody) {
		RepresentationBody rb = null;
		representationBody.set_id(null);
		rb = representationBodyRepoPort.save(representationBody);
		return rb;
	}

	public RepresentationBody updateRepresentationBody(RepresentationBody representationBody) {
		RepresentationBody rb = null;
		if (representationBodyRepoPort.findById(representationBody.get_id()) != null) {
			rb = representationBodyRepoPort.save(representationBody);
		}
		return rb;
	}

	public boolean deleteRepresentationBodies(String id) {
		return representationBodyRepoPort.deleteById(id);

	}
}
