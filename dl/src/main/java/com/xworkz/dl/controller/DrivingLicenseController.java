package com.xworkz.dl.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.dl.constant.DLConstants;
import com.xworkz.dl.dto.DrivingLicenseDTO;
import com.xworkz.dl.service.DLService;

import lombok.extern.slf4j.Slf4j;

@Component
@RequestMapping("/")
@Slf4j
public class DrivingLicenseController {

	private List<DrivingLicenseDTO> dtos = new ArrayList<>();

	@Autowired
	private DLService dlService;

	public DrivingLicenseController() {
		log.info("Creating DrivingLicenseController using no-arg const");
	}

	@PostMapping("/save")
	public String onSave(@Valid DrivingLicenseDTO dto, BindingResult bindingResult, Model model, MultipartFile file)
			throws IOException {
		log.info("Running onSave method in DrivingLicenseController");

		model.addAttribute("dto", dto);

		if (bindingResult.hasErrors()) {
			// model.addAttribute("errors", bindingResult.getAllErrors());
			model.addAttribute("dtos", dto);
			return "/DriveLicense.jsp";
		} else {

			dto.setFileName(System.currentTimeMillis() + "_" + file.getOriginalFilename());
			dto.setContentType(file.getContentType());
			dto.setFileSize(file.getSize());

			File existingFile = new File(DLConstants.LOCATION_OF_FILE + dto.getFileName());

			try (OutputStream os = new FileOutputStream(existingFile)) {
				os.write(file.getBytes());
			} catch (FileNotFoundException exception) {
				exception.printStackTrace();
			}
			dto.setOriginalName(file.getOriginalFilename());
			this.dtos.add(dto);
			this.dlService.validateAndSave(dto);
			log.info("Added the data into list");
			model.addAttribute("total", this.dtos.size());

		
			model.addAttribute("successMsg",
					"Driving License application of " + dto.getFullName() + " is submitted successfully");
		}

		return "/Display.jsp";
	}

	@GetMapping("/search")
	public String onSearch(Model model, String fullName) {
		log.info("Running onSearch method in Controller");
		List<DrivingLicenseDTO> list = this.dlService.findByName(fullName);
		model.addAttribute("list", list);
		return "/Search.jsp";
	}

	@GetMapping("/downloadFile")
	public void sendFile(String fileName, String contentType, HttpServletResponse response) throws IOException {
		log.info("Running sendFile method in Controller");
		File file = new File(DLConstants.LOCATION_OF_FILE + fileName);
		response.setContentType(contentType);

		OutputStream outputStream = response.getOutputStream();

		FileInputStream inputStream = new FileInputStream(file);
		byte[] bs = new byte[4096];
		int length;

		while ((length = inputStream.read(bs)) > 0) {
			outputStream.write(bs, 0, length);
		}
		inputStream.close();
		outputStream.flush();
	}

	@GetMapping("/showInList")
	public String tableForm(Model model, MultipartFile file) {
		log.info("Running tableForm method in Controller");
		model.addAttribute("dtos", this.dtos);
		return "/TableFormat.jsp";
	}

}
