//package com.xworkz.parkingRentalSystem.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.xworkz.parkingRentalSystem.dto.AdminParkingInfoDTO;
//import com.xworkz.parkingRentalSystem.service.AdminParkingInfoService;
//
//@RestController
//@RequestMapping("/")
//public class AdminParkingInfoRestController {
//
//	@Autowired
//	private AdminParkingInfoService parkingInfoService;
//
//	@PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
//	public String ajaxCall(@RequestParam AdminParkingInfoDTO dto) {
//		boolean saved = this.parkingInfoService.save(dto);
//		if (saved) {
//			return "This data already exists";
//		}
//		return "";
//	}
//
//}
