package com.AExVeS.AExVeS.partner_representatives.infrastructure.web;

import com.AExVeS.AExVeS.partner_representatives.application.services.PartnerRepresentativeServices;
import com.AExVeS.AExVeS.partner_representatives.domain.PartnerRepresentative;
import com.AExVeS.AExVeS.partner_representatives.infrastructure.web.dto.PartnerRepresentativeWebDto;
import com.AExVeS.AExVeS.partner_representatives.infrastructure.web.mappers.PartnerRepresentativeWebMapper;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/partner_representatives")
public class PartnerRepresentativeWebController {
    @Autowired
    private PartnerRepresentativeServices partnerRepresentativeServices;
    @Autowired
    private PartnerRepresentativeWebMapper partnerRepresentativeWebMapper;

    @GetMapping(value = {"/", ""})
    public String goToPartner(Model model) {
        List<PartnerRepresentative> representatives = partnerRepresentativeServices.getAllPartnerRepresentatives();
        List<PartnerRepresentativeWebDto> dtos = new ArrayList<>();
        for (PartnerRepresentative representative : representatives) {
            dtos.add(partnerRepresentativeWebMapper.toDto(representative));
        }
        model.addAttribute("representatives", dtos);
        return "datatemplates/partner_representative";
    }

    @GetMapping("/add")
    public String goFormAddPartnerRepr(Model model) {
        model.addAttribute("formRepresentative", new PartnerRepresentativeWebDto());
        return "addForms/addPartnerRepresentative";
    }

    @PostMapping(value = {"/", ""})
    public String addPartner(@Valid @ModelAttribute("formRepresentative") PartnerRepresentativeWebDto partnerRepresentativeWebDto, BindingResult br,
                             Model model) {
        if (br.hasErrors()) return "addForms/addPartnerRepresentative";

        PartnerRepresentative pr = partnerRepresentativeWebMapper.fromDto(partnerRepresentativeWebDto);
        final String id = pr.get_id();
        final boolean idNotNull = id != null;
        final boolean idNotCero = !id.equals("0");

        final PartnerRepresentative inserted = (idNotNull && idNotCero) ? partnerRepresentativeServices.updatePartnerRepresentative(pr) : partnerRepresentativeServices.savePartnerRepresentative(pr);
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
