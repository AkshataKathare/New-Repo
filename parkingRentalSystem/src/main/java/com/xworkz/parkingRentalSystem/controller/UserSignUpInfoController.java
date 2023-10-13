package com.xworkz.parkingRentalSystem.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.parkingRentalSystem.dto.UserParkingInfoDTO;
import com.xworkz.parkingRentalSystem.dto.UserSignUpInfoDTO;
import com.xworkz.parkingRentalSystem.service.UserParkingInfoService;
import com.xworkz.parkingRentalSystem.service.UserSignUpInfoService;
import com.xworkz.parkingRentalSystem.util.UserEmail;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/")
public class UserSignUpInfoController {

	@Autowired
	private UserSignUpInfoService service;

	@Autowired
	private UserParkingInfoService infoService;

	public UserSignUpInfoController() {
		log.info("Created UserSignUpInfoController using no-arg const");
	}

	@PostMapping("saveUserInfo")
	public String onSave(UserSignUpInfoDTO dto, UserParkingInfoDTO parkingInfoDTO, Model model,
			HttpServletRequest request) {
		if (dto != null) {
			log.info("Saving the dto " + dto);
			HttpSession session = request.getSession(true);
			session.setAttribute("dto", dto);
			this.service.save(dto);

			UserEmail.sendmail(dto.getEmail(), dto.getUserName());

			this.infoService.saveInfo(parkingInfoDTO, dto.getEmail());
			return "/UserSignUp.jsp";
		}
		return "/UserSignUp.jsp";

	}

}
