package com.xworkz.parkingRentalSystem.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.parkingRentalSystem.dto.ParkingDTO;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@RequestMapping("/")
public class DefaultController {

	public DefaultController() {
		log.info("Creating DefaultController using no-arg const");
	}

	@GetMapping("/onStart")
	public String startWith(Model model, ParkingDTO dto) {
		log.info("Running startWith method in DefaultController");
		model.addAttribute("dto", new ParkingDTO());
		return "/Parking.jsp";
	}
}
