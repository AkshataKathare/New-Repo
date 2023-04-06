package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.dto.IndependenceDTO;
import com.xworkz.application.exception.InvalidIndependenceException;
import com.xworkz.application.repository.IndependenceRepository;
import com.xworkz.application.repository.IndependenceRepositoryImpl;
import com.xworkz.application.service.IndependenceService;
import com.xworkz.application.service.IndependenceServiceImpl;

public class IndependenceRunner {

	public static void main(String[] args) {

		IndependenceDTO dto = new IndependenceDTO(LocalDate.of(1947, 8, 15), "August", "Mahatma Gandhi", "British", 75);
		IndependenceRepository repository = new IndependenceRepositoryImpl();
		IndependenceService independenceService = new IndependenceServiceImpl(repository);

		IndependenceDTO dto2 = new IndependenceDTO(LocalDate.of(1949, 9, 15), "September", "Subhash Chandra Bose",
				"Mughals", 40);

//		IndependenceDTO dto3 = new IndependenceDTO(LocalDate.of(1950, 1, 15), "October", "Bhagath Singh", "Portuguese",
//				37);

		try {
			boolean saved = independenceService.validatAndThenSave(dto);
			System.out.println(saved);

			System.out.println("*******");

			boolean saved2 = independenceService.validatAndThenSave(dto2);
			System.out.println(saved2);

			System.out.println("*******");

//			boolean saved3 = independenceService.validatAndThenSave(dto3);
//			System.out.println(saved3);

//			System.out.println(independenceService.findgotFreedomFromBymainFreedomFighterAndyears("Bhagath Singh", 37));
//			System.out.println(independenceService.find(dto3));
			System.out.println(independenceService.findAll());
			System.out.println(independenceService.findByMonth("August"));
			System.out.println(independenceService.findBymonthOrgotFreedomFromOrgotIndependenceOn("October", "Mughals",
					LocalDate.of(1957, 1, 15)));
			System.out.println("*******");

			independenceService.findAll();
			
		} catch (InvalidIndependenceException e) {
			System.out.println(e.getMessage());
		}
	}

}
