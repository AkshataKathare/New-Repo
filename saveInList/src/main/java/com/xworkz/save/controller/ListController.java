package com.xworkz.save.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.save.dto.ListDTO;

@Component
@RequestMapping("/")
public class ListController {

	private List<ListDTO> dtos = new ArrayList<>();

	public ListController() {
		System.out.println("Creating ListController using no-arg const");
	}

	@PostMapping("/save")
	public String onClick(ListDTO dto, Model model) {
		System.out.println("Running onClick method in ListController "+dto);
		model.addAttribute("fname", dto.getFullName());
		model.addAttribute("email", dto.getEmail());
		model.addAttribute("country", dto.getCountry());
		model.addAttribute("mobile", dto.getContactNo());
		model.addAttribute("type", dto.getType());
		model.addAttribute("description", dto.getDescription());
		dto.sendEmail(dto.getEmail());
		this.dtos.add(dto);
		System.out.println("Added dto to the list");
		return "/NextPage.jsp";
	}

	@GetMapping("/view")
	public String onView(ListDTO dto, Model model) {
		System.out.println("Running onView method");
		model.addAttribute("list", dtos);
		return "/View.jsp";
	}

}
