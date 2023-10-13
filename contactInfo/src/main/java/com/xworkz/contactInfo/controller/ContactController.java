package com.xworkz.contactInfo.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.contactInfo.constants.ContactConstants;
import com.xworkz.contactInfo.dto.ContactDTO;
import com.xworkz.contactInfo.service.ContactService;
import com.xworkz.contactInfo.util.Util;

import lombok.extern.slf4j.Slf4j;

@Component
@RequestMapping("/")
@Slf4j
public class ContactController {

	@Autowired
	private ContactService contactService;

	public ContactController() {
		log.info("Created " + this.getClass().getSimpleName());
	}

	@GetMapping("/search")
	public String onSearch(Model model, String name) {
		System.out.println("running onSearch with param" + name);
		List<ContactDTO> list = contactService.findByName(name);
		model.addAttribute("list", list);
		return "/Search.jsp";
	}

	@PostMapping("/send")
	public String onSend(ContactDTO dto, Model model, MultipartFile file) throws IOException {
		log.info("Running onSend method in ContactController");
		model.addAttribute("dto", dto);
		dto.setFileName(System.currentTimeMillis() + file.getOriginalFilename());
		dto.setContentType(file.getContentType());
		dto.setFileSize(file.getSize());
		File existFile = new File(ContactConstants.FILE_LOCATION + dto.getFileName());

		dto.setOriginalFileName(file.getOriginalFilename());
		try (OutputStream outputStream = new FileOutputStream(existFile);) {
			outputStream.write(file.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Util.sendEmail(dto.getEmail(), dto.getName());
		this.contactService.validateAndThenSave(dto);
		model.addAttribute("successMsg", "Hi " + dto.getName() + "," + "Contact info has been successfully saved");
		return "/Display.jsp";
	}
	
//	@PostMapping(value = "/login/{email}/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
//	public String loginEmail(@RequestParam String email,@RequestParam String password) {
//		
//		return "";
//	}
}
