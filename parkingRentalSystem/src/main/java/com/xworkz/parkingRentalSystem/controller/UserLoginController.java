package com.xworkz.parkingRentalSystem.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.parkingRentalSystem.service.UserLoginService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class UserLoginController {

	@Autowired
	private UserLoginService loginService;

	public UserLoginController() {
		log.info("Creating UserLoginController using no-arg const");
	}

	@GetMapping("generateOTP")
	public String generateOTP(String userEmail, Model model, HttpServletRequest req) {
		log.info("Running generateOTP method in UserLoginController");
		boolean update = this.loginService.updateOTP(userEmail);
		if (update) {
			model.addAttribute("otpGenerated", "OTP is generated and please enter the OTP");
			HttpSession httpSession = req.getSession();
			httpSession.setAttribute("userEmail", userEmail);
			return "UserLogin.jsp";
		}
		model.addAttribute("otpNotGenerated", "This email address is not registered");
		return "UserLogin.jsp";
	}

	@PostMapping("send")
	public String onSend(int otp, Model model) {
		log.info("Running onSend method in UserLoginController");
		boolean sent = this.loginService.sendUserLogin(otp);
		if (sent) {
			return "UserLoginSuccessfull.jsp";
		}
		model.addAttribute("otpExpired", "OTP has been expired");
		model.addAttribute("incorrectOTP", "OTP is incorrect.Please re-enter the proper OTP");
		return "UserLogin.jsp";
	}

}