package com.AExVeS.AExVeS.partner.infrastructure.web;

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

import com.AExVeS.AExVeS.partner.application.services.PartnerServices;
import com.AExVeS.AExVeS.partner.domain.Models.Partner;
import com.AExVeS.AExVeS.partner.infrastructure.web.dto.PartnerDto;
import com.AExVeS.AExVeS.partner.infrastructure.web.mappers.PartnerWebMapper;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/partners")
public class PartnerWebController {
	@Autowired
	private PartnerServices partnerServices;
	@Autowired
	private PartnerWebMapper partnerWebMapper;

	@GetMapping(value = { "/", "" })
	public String goToPartner(Model model) {
		List<Partner> partners = partnerServices.getAllPartners();
		List<PartnerDto> dtos = new ArrayList<>();
		for (Partner partner : partners) {
			dtos.add(partnerWebMapper.toDto(partner));
		}
		model.addAttribute("partners", dtos);
		return "datatemplates/partner";
	}  

	@GetMapping("/add")
	public String goFormAddPartner(Model model) {
		String[] genders = { "Man", "Woman", "Other", "Prefer not to say" };
		if (!model.containsAttribute("formPartner")) {
			model.addAttribute("formPartner", new PartnerDto());
			model.addAttribute("isChecked", false);
		}
		model.addAttribute("genders", genders);

		return "addForms/addPartner";
	}

	@PostMapping("/add")
	public String addPartner(@ModelAttribute("formPartner") @Valid PartnerDto partnerDto, BindingResult br,
			Model model) {
		if (br.hasErrors()) {
			return "addForms/addPartner";
		}
		final Partner partner = partnerWebMapper.fromDto(partnerDto);
		final String id = partnerDto.getId();
		final boolean existeId = id != null;
		final boolean idNoCero = !id.equals("0");

		final Partner inserted = (existeId && idNoCero) ? partnerServices.updatePartner(partner)
				: partnerServices.savePartner(partner);
		System.out.printf("Introduced Partner: %s", inserted);

		return "redirect:/partners";
	}

	@GetMapping("/update")
	public String updatePartner(@RequestParam("id") String id, Model model) {
		Partner p = partnerServices.getPartner(id);
		System.out.println(p.get_id());
		model.addAttribute("formPartner", partnerWebMapper.toDto(p));
		return "addForms/addPartner";
	}

	@GetMapping("/delete")
	public String deletePartner(@RequestParam("id") String id, Model model) {
		boolean deleted = partnerServices.deletePartner(id);
		model.addAttribute("deleted", deleted);
		return "redirect:/partners";
	}

//	private Map<String, Integer> readPhonePrefixes(){
//		Map<String, Integer> records = new HashMap<>();
//		try (BufferedReader br = new BufferedReader(new FileReader("country_phone_prefixes.csv"))) {
//			String line;
//			while ((line = br.readLine()) != null) {
//				List<String> valuesList = Arrays.asList(line.split(", "));
//				records.put(valuesList.get(0), Integer.parseInt(valuesList.get(valuesList.size() - 1)));
//			}
//			System.out.println(records);
//			return records;
//		} catch (IOException e) {
//			throw new RuntimeException(e);
//		}
//	}
}
