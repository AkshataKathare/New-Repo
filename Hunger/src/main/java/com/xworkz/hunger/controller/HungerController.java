package com.xworkz.hunger.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class HungerController {

	@RequestMapping("/click")
	public String onClick() {
		System.out.println("Running onclick method");
		return "/Landing.jsp";
	}
}
