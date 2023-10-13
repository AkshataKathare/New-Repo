package com.xworkz.parkingRentalSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.parkingRentalSystem.dto.AdminParkingInfoDTO;
import com.xworkz.parkingRentalSystem.service.AdminParkingInfoService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/")
public class AdminParkingInfoController {

	@Autowired
	private AdminParkingInfoService service;

	public AdminParkingInfoController() {
		log.info("Created AdminParkingInfoController using no-arg const");
	}

	@PostMapping(value = "/save")
	public String onDataSave(AdminParkingInfoDTO dto, Model model) {
		log.info("Running onDataSave method in AdminParkingInfoController");
		boolean save = this.service.save(dto);
		if (save) {
			log.info("This entity has been saved");
			return "/SavedAdminParkingInfo.jsp";
		} else {
			log.info("This entity will not be saved");
			model.addAttribute("exists", "This entity already exists");
		}
		return "/AdminParkingInfo.jsp";
	}

	@GetMapping("/search")
	public String onSearch(AdminParkingInfoDTO dto, Model model) {
		List<AdminParkingInfoDTO> listDtos = this.service.findByLocation(dto.getLocation());
		model.addAttribute("list", listDtos);
		return "/AdminDataSearch.jsp";
	}

}
