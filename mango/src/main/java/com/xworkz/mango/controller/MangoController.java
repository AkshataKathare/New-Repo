package com.xworkz.mango.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class MangoController {

	@RequestMapping("/click")
	public String onClick() {
		System.out.println("Running onClick method in MangoController");
		return "/index.jsp";
	}
}
