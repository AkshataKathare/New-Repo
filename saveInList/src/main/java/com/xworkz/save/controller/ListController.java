package com.xworkz.save.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.save.dto.ListDTO;

@Component
@RequestMapping("/")
public class ListController {

	private List<ListDTO> dtos = new ArrayList<>();

	public ListController() {
		System.out.println("Creating ListController using no-arg const");
	}

	@RequestMapping("/save")
	public String onClick(ListDTO dto, Model model) {
		System.out.println("Running onClick method in ListController");
		model.addAttribute("fname", dto.getFullName());
		model.addAttribute("email", dto.getEmail());
		model.addAttribute("country", dto.getCountry());
		model.addAttribute("mobile", dto.getContactNo());
		model.addAttribute("type", dto.getType());
		model.addAttribute("description", dto.getDescription());
		dto.sendEmail(dto.getEmail());
		return "/NextPage.jsp";
	}

	@RequestMapping("/view")
	public String onView(ListDTO dto, Model model) {
		System.out.println("Running onView method");
		this.dtos.add(dto);
		model.addAttribute("list", dtos);
		return "/View.jsp";
	}

}
