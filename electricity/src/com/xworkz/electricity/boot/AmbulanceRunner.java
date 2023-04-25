package com.xworkz.electricity.boot;

import java.time.LocalDate;

import com.xworkz.electricity.dto.AmbulanceDTO;
import com.xworkz.electricity.repository.AmbulanceRepository;
import com.xworkz.electricity.repository.AmbulanceRepositoryImpl;
import com.xworkz.electricity.service.AmbulanceService;
import com.xworkz.electricity.service.AmbulanceServiceImpl;

public class AmbulanceRunner {

	public static void main(String[] args) {

		AmbulanceDTO ambulanceDTO = new AmbulanceDTO(1, 232, 3456, "Jacky", false, "Smith", LocalDate.of(2001, 2, 4));

		AmbulanceRepository ambulanceRepository = new AmbulanceRepositoryImpl();
		AmbulanceService ambulanceService = new AmbulanceServiceImpl(ambulanceRepository);
		boolean saved = ambulanceService.validateAndThenSave(ambulanceDTO);
		System.out.println("dto is saved :"+saved);

	}

}
