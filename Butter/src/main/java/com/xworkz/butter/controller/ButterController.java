package com.xworkz.butter.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ButterController {

	@RequestMapping("/click")
	public String onClick() {
		System.out.println("Running onclick method in " + this.getClass().getSimpleName());
		return "/index.jsp";

	}

}
