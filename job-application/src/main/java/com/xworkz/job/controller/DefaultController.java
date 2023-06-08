package com.xworkz.job.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.job.dto.JobDTO;

@Component
@RequestMapping("/")
public class DefaultController {

	public DefaultController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@RequestMapping("/start")
	public String onStart(Model model) {
		System.out.println("running onStart from Defaultcontroller");
		model.addAttribute("dto", new JobDTO());
		return "/Job.jsp";
	}

}