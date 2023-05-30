package com.xworkz.summer.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class SummerController {

	@RequestMapping("/click")
	public String onClick() {
		System.out.println("Running onClick method in SummerController");
		return "/Display.jsp";
	}
}
