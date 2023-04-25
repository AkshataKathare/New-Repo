package com.xworkz.electricity.boot;

import java.time.LocalDate;

import com.xworkz.electricity.dto.MarriageDTO;
import com.xworkz.electricity.repository.MarriageRepository;
import com.xworkz.electricity.repository.MarriageRepositoryImpl;
import com.xworkz.electricity.service.MarriageService;
import com.xworkz.electricity.service.MarriageServiceImpl;

public class MarriageRunner {

	public static void main(String[] args) {

		MarriageDTO marriageDTO = new MarriageDTO(29, "Shri", "Darshan", false, LocalDate.of(2024, 1, 1),
				"Rapati Kalyan Mantapa", 580, true);

		MarriageRepository marriageRepository = new MarriageRepositoryImpl();
		MarriageService marriageService = new MarriageServiceImpl(marriageRepository);
		boolean saved = marriageService.validateAndSave(marriageDTO);
		System.out.println("dto is saved :" + saved);

		System.out.println("==========================");

		MarriageDTO marriageDTO2 = new MarriageDTO(30, "Sheetal", "Sagar", true, LocalDate.of(2025, 1, 1),
				"Modern Hall", 600, false);

		boolean saved2 = marriageService.validateAndSave(marriageDTO2);
		System.out.println("dto2 is saved :" + saved2);
	}

}
