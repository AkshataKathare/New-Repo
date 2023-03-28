package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.dto.FestivalDTO;
import com.xworkz.application.exception.InvalidFestivalException;
import com.xworkz.application.repository.FestivalRepository;
import com.xworkz.application.repository.FestivalRepositoryImpl;
import com.xworkz.application.service.FestivalService;
import com.xworkz.application.service.FestivalServiceImpl;

public class FestivalRunner {

	public static void main(String[] args) {

		try {

			FestivalDTO festivalDTO = new FestivalDTO(2, "Dasara", LocalDate.of(2023, 10, 4),
					LocalDate.of(2023, 10, 12), "Kanoli", "DurgaMata");

			FestivalRepository festivalRepository = new FestivalRepositoryImpl();
			FestivalService festivalService = new FestivalServiceImpl(festivalRepository);
			boolean saved = festivalService.validateAndThenSave(festivalDTO);
			System.out.println("dto is saved :" + saved);

			System.out.println("");

			FestivalDTO festivalDTO1 = new FestivalDTO(3, "Deepavali", LocalDate.of(2023, 10, 11),
					LocalDate.of(2023, 10, 14), "Poli", "Laxmi");

			FestivalService festivalService1 = new FestivalServiceImpl(festivalRepository);
			boolean saved1 = festivalService1.validateAndThenSave(festivalDTO1);
			System.out.println("dto is saved :" + saved1);

			System.out.println("");

			FestivalDTO festivalDTO2 = new FestivalDTO(8, "Dasara", LocalDate.of(2023, 10, 4),
					LocalDate.of(2023, 10, 12), "Kanoli", "DurgaMata");

			FestivalService festivalService2 = new FestivalServiceImpl(festivalRepository);
			boolean saved2 = festivalService2.validateAndThenSave(festivalDTO2);
			System.out.println("dto is saved :" + saved2);

			System.out.println("");

			FestivalDTO festivalDTO3 = new FestivalDTO(9, "Dasara", LocalDate.of(2023, 10, 4),
					LocalDate.of(2023, 10, 12), "Kanoli", "DurgaMata");

			FestivalService festivalService3 = new FestivalServiceImpl(festivalRepository);
			boolean saved3 = festivalService3.validateAndThenSave(festivalDTO3);
			System.out.println("dto is saved :" + saved3);

		} catch (InvalidFestivalException e) {
			System.out.println("InvalidFestivalException :" + e.getMessage());
		}

	}

}
