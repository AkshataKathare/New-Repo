package com.xworkz.pgDetails.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.pgDetails.dto.PGDTO;

@Component
@RequestMapping("/")
public class PGController {

	private List<PGDTO> list = new ArrayList<>();

	public PGController() {
		System.out.println("Creating PGController using no-arg const");
	}

	private String pgName;
	private String pgOwner;
	private String location;
	private Double pgRent;
	private Integer noOfFloors;

	@PostMapping("/save")
	public String onSave(@Valid PGDTO dto, BindingResult bindingResult, Model model) {
		System.out.println("Running onSave method in controller");
		model.addAttribute("pgName", dto.getPgName());
		model.addAttribute("pgOwner", dto.getPgOwner());
		model.addAttribute("location", dto.getLocation());
		model.addAttribute("pgRent", dto.getPgRent());
		model.addAttribute("floors", dto.getNoOfFloors());

		if (bindingResult.hasErrors()) {
			bindingResult.getAllErrors()
					.forEach(e -> System.err.println(e.getObjectName() + " " + e.getDefaultMessage()));

			model.addAttribute("message", "pgDTO is not valid");
			model.addAttribute("msg", bindingResult.getAllErrors());
		} else {
			this.list.add(dto);
			System.out.println("Added details into list");
		}
		model.addAttribute("errors", bindingResult.getAllErrors());
		return "/Display.jsp";
	}

	@GetMapping("view")
	public String onView() {
		System.out.println("Running onView method in controller");
		return "/view.jsp";
	}
}
