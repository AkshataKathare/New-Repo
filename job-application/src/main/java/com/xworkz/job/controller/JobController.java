package com.xworkz.job.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.job.dto.JobDTO;

@Component
@RequestMapping("/")
public class JobController {

	public JobController() {
		System.out.println("Creating JobController using no-arg const");
	}

	@PostMapping("/save")
	public String onSave(@Valid JobDTO dto, BindingResult bindingResult, Model model) {
		System.out.println("Running onSave method ");

		model.addAttribute("dtos", dto);
		if (bindingResult.hasErrors()) {
			model.addAttribute("errors", bindingResult.getAllErrors());
			return "Job.jsp";
		} else {
			model.addAttribute("msg", "Job application of " + dto.getApplName() + " is submitted successfully");
		}
		return "/Display.jsp";
	}
}
