package com.xworkz.family.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.family.dto.FamilyDTO;

@Component
@RequestMapping("/")
public class FamilyController {

	private List<FamilyDTO> dtos = new ArrayList<>();

	public FamilyController() {
		System.out.println("Creating no arg const in FamilyController");
	}

	@PostMapping("/subm")
	public String onSubmit(FamilyDTO dto, Model model) {
		System.out.println("Running onSubmit method");
		model.addAttribute("name", dto.getMyName());
		model.addAttribute("father", dto.getFatherName());
		model.addAttribute("fatherOccup", dto.getFatherOccup());
		model.addAttribute("mother", dto.getMotherName());
		model.addAttribute("motherOccup", dto.getMotherOccup());
		model.addAttribute("sister", dto.getSisterName());
		model.addAttribute("sisterPurs", dto.getSisterPursuing());
		model.addAttribute("brother", dto.getBrotherName());
		model.addAttribute("brotherPurs", dto.getBrotherPursuing());
		model.addAttribute("surname", dto.getSurname());
		this.dtos.add(dto);
		System.out.println("Added data to the list");
		return "/Detail.jsp";
	}

	@GetMapping("view")
	public String onView(Model model) {
		System.out.println("Running onView method");
		model.addAttribute("allDetails", dtos);
		return "/View.jsp";
	}
}
