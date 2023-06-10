package com.xworkz.holiday.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.holiday.entity.HolidayEntity;
import com.xworkz.holiday.service.HolidayService;

@Component
@RequestMapping("/")
public class HolidayController {

	@Autowired
	private HolidayService holidayService;

	public HolidayController() {
		System.out.println("Creating HolidayCOntroller using no-arg const");
	}

	@PostMapping("/save")
	public String onSave(HolidayEntity entity,Model model) {
		System.out.println("Running onSave method in Controller");

		
		boolean valid = this.holidayService.validatAndThenSave(entity);
		if (valid) {
			System.out.println("Data is valid");
			model.addAttribute("data", entity);

			return "/Display.jsp";
		} else {
			System.out.println("Data is invalid");
		}
		return "/Holiday.jsp";
	}
}
