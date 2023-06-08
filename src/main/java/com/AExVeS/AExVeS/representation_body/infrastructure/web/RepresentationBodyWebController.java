package com.AExVeS.AExVeS.representation_body.infrastructure.web;

import com.AExVeS.AExVeS.representation_body.application.services.RepresentationBodyServices;
import com.AExVeS.AExVeS.representation_body.domain.RepresentationBody;
import com.AExVeS.AExVeS.representation_body.infrastructure.web.dto.RepresentationBodyWebDto;
import com.AExVeS.AExVeS.representation_body.infrastructure.web.mappers.RepresentationBodyWebMapper;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/representation_bodies")
public class RepresentationBodyWebController {
    @Autowired
    private RepresentationBodyServices representationBodyServices;
    @Autowired
    private RepresentationBodyWebMapper representationBodyWebMapper;

    @GetMapping(value = {"/", ""})
    public String goToPartner(Model model) {
        List<RepresentationBody> bodies = representationBodyServices.getAllRepresentationBodies();
        List<RepresentationBodyWebDto> dtos = new ArrayList<>();
        for (RepresentationBody body : bodies) {
            dtos.add(representationBodyWebMapper.toDto(body));
        }
        model.addAttribute("bodies", dtos);
        return "datatemplates/representation_body";
    }

    @GetMapping("/add")
    public String goFormAddRepBody(Model model) {
        model.addAttribute("formBody", new RepresentationBodyWebDto());
        return "addForms/addRepresentationBodies";
    }

    @PostMapping("/add")
    public String addPartner(@ModelAttribute("formBody") @Valid RepresentationBodyWebDto representationBodyWebDto, BindingResult br,
                             Model model) {
		if (br.hasErrors()) {
			return "addForms/addRepresentationBodies";
		}

		final RepresentationBody rb = representationBodyWebMapper.fromDto(representationBodyWebDto);
		final String id = rb.get_id();
        final boolean idNotNull = id != null;
        final boolean idNotCero = !id.equals("0");

		final RepresentationBody inserted = (idNotNull && idNotCero) ? representationBodyServices.updateRepresentationBody(rb) : representationBodyServices.saveRepresentationBody(rb);
		System.out.printf("Introduced Representation Body: %s", inserted);

        return "redirect:/representation_bodies";
    }

    @GetMapping("/update")
    public String updatePartner(@RequestParam("id") String id, Model model) {
        RepresentationBody rb = representationBodyServices.getRepresentationBody(id);
        model.addAttribute("formBody", representationBodyWebMapper.toDto(rb));
        return "addForms/addRepresentationBodies";
    }

    @GetMapping("/delete")
    public String deletePartner(@RequestParam("id") String id, Model model) {
        model.addAttribute("deleted", representationBodyServices.deleteRepresentationBodies(id));
        return "datatemplates/representation_body";
    }
}
