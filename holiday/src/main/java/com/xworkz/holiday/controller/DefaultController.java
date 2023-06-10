package com.xworkz.holiday.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.holiday.entity.HolidayEntity;

@Component
@RequestMapping("/")
public class DefaultController {

	public DefaultController() {
		System.out.println("Creating DefaultController using no-arg const");
	}

	@GetMapping("/onStart")
	public String defaultPage(HolidayEntity entity, Model model) {
		System.out.println("Running defaulPage in DefaultController");
		model.addAttribute("dto", new HolidayEntity());
		return "/Holiday.jsp";
	}
}
