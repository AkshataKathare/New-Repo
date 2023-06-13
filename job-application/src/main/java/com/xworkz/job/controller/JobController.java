package com.xworkz.job.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.job.dto.JobDTO;

@Component
@RequestMapping("/")
public class JobController {

	public JobController() {
		System.out.println("Creating JobController using no-arg const");
	}

	@PostMapping("/save")
	public String onSave(@Valid JobDTO dto, BindingResult bindingResult, Model model, MultipartFile file)
			throws IOException {
		System.out.println("Running onSave method ");

		model.addAttribute("dtos", dto);
		if (bindingResult.hasErrors()) {
			model.addAttribute("errors", bindingResult.getAllErrors());
			model.addAttribute("dto", dto);
			return "/Job.jsp";
		} else {
			System.out.println("File received:" + file.getName());
			System.out.println("File Size " + file.getSize());
			System.out.println("File Type" + file.getContentType());
			System.out.println("File bytes" + file.getBytes());
			File physicalFile = new File("C:\\Users\\AKSHATA KATHARE\\tomcat-files\\" + file.getOriginalFilename());

			try (OutputStream os = new FileOutputStream(physicalFile)) {
				os.write(file.getBytes());
			}
			model.addAttribute("msg", "Job application of " + dto.getApplName() + " is submitted successfully");
		}
		return "/Display.jsp";
	}

	@GetMapping("/download")
	public void onDownload(String fileName, String contentType, HttpServletResponse response) throws IOException {
		System.out.println("Running onDownload method in JobController");

		File file = new File("C:\\Users\\AKSHATA KATHARE\\tomcat-files\\" + fileName);
		response.setContentType(contentType);

		OutputStream outputStream = response.getOutputStream();
		FileInputStream inputStream = new FileInputStream(file);

		byte[] buffer = new byte[4096];
		int length;
		while ((length = inputStream.read(buffer)) > 0) {
			outputStream.write(buffer, 0, length);
		}
		inputStream.close();
		outputStream.flush();
	}

}