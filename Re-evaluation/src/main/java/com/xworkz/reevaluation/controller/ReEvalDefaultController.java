package com.xworkz.reevaluation.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.reevaluation.dto.ReEvaluationDTO;

import lombok.extern.slf4j.Slf4j;

@Component
@RequestMapping("/")
@Slf4j
public class ReEvalDefaultController {

	public ReEvalDefaultController() {
		log.info("Created " + this.getClass().getSimpleName());
	}

	@RequestMapping("/onStartUp")
	public String start(Model model) {
		log.info("Running start method in DefaultController");
		model.addAttribute("dto", new ReEvaluationDTO());
		return "/Evaluation.jsp";
	}
}
