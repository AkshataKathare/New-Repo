package com.xworkz.contactInfo.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.contactInfo.dto.ContactDTO;

import lombok.extern.slf4j.Slf4j;

@Component
@RequestMapping("/")
@Slf4j
public class DefaultController {

	public DefaultController() {
		log.info("Created " + this.getClass().getSimpleName());
	}

	@GetMapping("/onStart")
	public String start(Model model, ContactDTO dto) {
		log.info("Running start method in DefaultController");
		model.addAttribute("dto", new ContactDTO());
		return "/Contact.jsp";
	}
}
