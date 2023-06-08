package com.xworkz.reevaluation.controller;

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

import com.xworkz.reevaluation.constants.ApplicationConstant;
import com.xworkz.reevaluation.dto.ReEvaluationDTO;

@Component
@RequestMapping("/")
public class ReEvalController {

	public ReEvalController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@PostMapping("/subm")
	public String onSubmit(@Valid ReEvaluationDTO dto, BindingResult bindingResult, Model model, MultipartFile file)
			throws IOException {
		System.out.println("Running onSave method ");

		model.addAttribute("dtos", dto);
		if (bindingResult.hasErrors()) {
			model.addAttribute("errors", bindingResult.getAllErrors());
			model.addAttribute("dto", dto);
			return "/Evaluation.jsp";
		} else {
			System.out.println("File received:" + file.getName());
			System.out.println("File Size " + file.getSize());
			System.out.println("File Type" + file.getContentType());
			System.out.println("File bytes" + file.getBytes());
			File physicalFile = new File(ApplicationConstant.FILE_LOCATION + file.getOriginalFilename());

			try (OutputStream os = new FileOutputStream(physicalFile)) {
				os.write(file.getBytes());
			}
			model.addAttribute("msg",
					"Application of " + dto.getStudentName() + " for re-evaluation is submitted successfully");
		}
		return "/Details.jsp";

	}

	@GetMapping("/fileDownload")
	public void sendImage(String fileName, String contentType, HttpServletResponse response) throws IOException {
		System.out.println("running sendImage....");
		// STEP 1: GEt ref of the File , by name passed
		File file = new File(ApplicationConstant.FILE_LOCATION + fileName);
		// STEP 2 : Set content Type
		response.setContentType(contentType);
		// STEP 3: Write File as Bytes to response
		OutputStream outputStream = response.getOutputStream();
		FileInputStream in = new FileInputStream(file);
		byte[] buffer = new byte[4096];
		int length;
		while ((length = in.read(buffer)) > 0) {
			outputStream.write(buffer, 0, length);
		}
		in.close();
		outputStream.flush();
	}

}
