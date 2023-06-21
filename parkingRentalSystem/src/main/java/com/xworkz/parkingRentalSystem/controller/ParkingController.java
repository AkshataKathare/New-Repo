package com.xworkz.parkingRentalSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.parkingRentalSystem.dto.ParkingDTO;
import com.xworkz.parkingRentalSystem.service.ParkingService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@RequestMapping("/")
public class ParkingController {

	@Autowired
	private ParkingService parkingService;

	public ParkingController() {
		log.info("Creating ParkingController using no-arg const");
	}

	@PostMapping("login")
	public String onLogin(ParkingDTO dto, Model model) {
		log.info("Running onLogin method in Parking Controller");
		ParkingDTO dto1 = parkingService.validate(dto);
		if (dto1 != null) {
			// model.addAttribute("loginTime", Time.from(Instant.now()));
			model.addAttribute("userName", dto1.getName());
			model.addAttribute("loginTime", dto1.getLoginTime());

			return "/LoginSuccess.jsp";
		}
		log.info("incorrect credential");
		model.addAttribute("incorrectEmailOrPassword", "email or password is incorrect");
		return "/AdminLogin.jsp";
	}

}
