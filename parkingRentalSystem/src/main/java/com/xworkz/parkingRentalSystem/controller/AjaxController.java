package com.xworkz.parkingRentalSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xworkz.parkingRentalSystem.dto.AdminParkingInfoDTO;
import com.xworkz.parkingRentalSystem.service.UserLoginService;
import com.xworkz.parkingRentalSystem.service.UserParkingInfoService;
import com.xworkz.parkingRentalSystem.service.UserSignUpInfoService;

import lombok.extern.slf4j.Slf4j;

@RestController
@EnableWebMvc
@RequestMapping("/")
@Slf4j
public class AjaxController {

	@Autowired
	private UserParkingInfoService infoService;

	@Autowired
	private UserSignUpInfoService infoService2;

	@Autowired
	private UserLoginService loginService;

	public AjaxController() {
		log.info("Created AjaxController using no-arg const");
	}

	@GetMapping(value = "/find/{location}/{vehicleType}/{vehicleClassification}/{term}", produces = MediaType.APPLICATION_JSON_VALUE)
	public AdminParkingInfoDTO find(@PathVariable String location, @PathVariable String vehicleType,
			@PathVariable String vehicleClassification, @PathVariable String term, Model model) {
		log.info("Entity :" + location + "   " + vehicleType + "   " + vehicleClassification + "  " + term);
		AdminParkingInfoDTO dto = this.infoService.find(location, vehicleType, vehicleClassification, term);
//		model.addAttribute("signUpDTO", signUpInfoDTO);
//		model.addAttribute("dto", infoDTO);
		return dto;
	}

	@GetMapping(value = "/validateByEmail/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String checkEmail(@PathVariable String email) {
		if (this.infoService2.findByEmail(email) != null) {
			return "this email already exists";
		}
		return "";
	}

}
