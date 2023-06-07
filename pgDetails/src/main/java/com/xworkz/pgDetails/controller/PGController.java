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

	@PostMapping("/save")
	public String onSave(@Valid PGDTO dto, BindingResult bindingResult, Model model) {
		System.out.println("Running onSave method in controller");
		model.addAttribute("data", dto);

		if (bindingResult.hasErrors()) {
			bindingResult.getAllErrors().forEach(e -> System.err.println(e.getDefaultMessage()));

			model.addAttribute("errors", bindingResult.getAllErrors());
		} else {
			System.out.println("PGDTO is valid " + dto);
			model.addAttribute("successMsg", "PGDTO is valid");
		}
		return "/index.jsp";
	}

	@GetMapping("view")
	public String onView() {
		System.out.println("Running onView method in controller");
		return "/view.jsp";
	}
}
