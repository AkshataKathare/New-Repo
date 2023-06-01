package com.xworkz.passport.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.passport.dto.PassportDTO;

@Component
@RequestMapping
public class PassportController {

	public PassportController() {
		System.out.println("Creating PassportController using no-arg const");
	}

	@RequestMapping(value = "/click")
	public String onClick(PassportDTO dto, Model model) {
		System.out.println("Running onClick method");
		model.addAttribute("fName", dto.getFName());
		model.addAttribute("last", dto.getLName());
		model.addAttribute("email", dto.getEmail());
		model.addAttribute("contactNo", dto.getContactNo());
		dto.sendEmail(dto.getEmail());
		return "/index.jsp";
	}

}
