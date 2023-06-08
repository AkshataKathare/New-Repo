package com.xworkz.reevaluation.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.reevaluation.dto.ReEvaluationDTO;

@Component
@RequestMapping("/")
public class ReEvalDefaultController {

	public ReEvalDefaultController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@RequestMapping("/onStartUp")
	public String start(Model model) {
		System.out.println("Running start method in DefaultController");
		model.addAttribute("dto", new ReEvaluationDTO());
		return "/Evaluation.jsp";
	}
}
