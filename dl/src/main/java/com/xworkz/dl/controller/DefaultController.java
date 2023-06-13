package com.xworkz.dl.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dl.dto.DrivingLicenseDTO;

@Component
@RequestMapping("/onStart")
public class DefaultController {

	public DefaultController() {
		System.out.println("Creating DefaultController");
	}

	@GetMapping
	public String startPage(DrivingLicenseDTO dto, Model model) {
		System.out.println("Running startPage method in DefaultController");
		model.addAttribute("dto", new DrivingLicenseDTO());
		return "/DriveLicense.jsp";
	}
}
