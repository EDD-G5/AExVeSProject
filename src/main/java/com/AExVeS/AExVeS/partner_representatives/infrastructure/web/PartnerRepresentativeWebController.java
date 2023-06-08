package com.AExVeS.AExVeS.partner_representatives.infrastructure.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.AExVeS.AExVeS.partner.domain.Models.Partner;
import com.AExVeS.AExVeS.partner_representatives.application.services.PartnerRepresentativeServices;
import com.AExVeS.AExVeS.partner_representatives.domain.PartnerRepresentative;
import com.AExVeS.AExVeS.partner_representatives.infrastructure.web.dto.PartnerRepresentativeWebDto;
import com.AExVeS.AExVeS.partner_representatives.infrastructure.web.mappers.PartnerRepresentativeWebMapper;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/partner_representatives")
public class PartnerRepresentativeWebController {
	@Autowired
	private PartnerRepresentativeServices partnerRepresentativeServices;
	@Autowired
	private PartnerRepresentativeWebMapper partnerRepresentativeWebMapper;

	@GetMapping(value = { "/", "" })
	public String goToPartner(Model model) {
		List<PartnerRepresentative> representatives = partnerRepresentativeServices.getAllPartnerRepresentatives();
		List<PartnerRepresentativeWebDto> dtos = new ArrayList<>();
		
		for (PartnerRepresentative representative : representatives) {
			Partner represented = partnerRepresentativeServices.getRepresentedPartner(representative.get_id());
			PartnerRepresentativeWebDto pr = partnerRepresentativeWebMapper.toDto(representative);
			pr.setId_socio_representado(represented.getNombre_completo());
			System.out.println(pr);
			dtos.add(pr);
		}
		
		model.addAttribute("representatives", dtos);
		return "datatemplates/partner_representative";
	}

	@GetMapping("/add")
	public String goFormAddPartnerRepr(Model model) {
		model.addAttribute("formRepresentative", new PartnerRepresentativeWebDto());
		return "addForms/addPartnerRepresentative";
	}

	@PostMapping("/add")
	public String addPartner(
			@Valid @ModelAttribute("formRepresentative") PartnerRepresentativeWebDto partnerRepresentativeWebDto,
			BindingResult br, Model model) {
		if (br.hasErrors())
			return "addForms/addPartnerRepresentative";

		PartnerRepresentative pr = partnerRepresentativeWebMapper.fromDto(partnerRepresentativeWebDto);
		final String id = pr.get_id();
		final boolean idNotNull = id != null;
		final boolean idNotCero = !id.equals("0");

		final PartnerRepresentative inserted = (idNotNull && idNotCero)
				? partnerRepresentativeServices.updatePartnerRepresentative(pr)
				: partnerRepresentativeServices.savePartnerRepresentative(pr);
		System.out.printf("Introduced Partner Representative: %s", inserted);

		return "redirect:/partner_representatives";
	}

	@GetMapping("/update")
	public String updatePartner(@Valid @RequestParam("id") String id, Model model) {
		PartnerRepresentative p = partnerRepresentativeServices.getPartnerRepresentative(id);
		model.addAttribute("formRepresentative", partnerRepresentativeWebMapper.toDto(p));
		return "addForms/addPartnerRepresentative";
	}

	@GetMapping("/delete")
	public String deletePartner(@RequestParam("id") String id, Model model) {
		model.addAttribute("deleted", partnerRepresentativeServices.deletePartnerRepresentative(id));
		return "redirect:/partner_representatives";
	}
}
