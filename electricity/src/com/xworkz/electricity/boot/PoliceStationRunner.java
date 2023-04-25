package com.xworkz.electricity.boot;

import com.xworkz.electricity.constant.NumberOfCell;
import com.xworkz.electricity.dto.PoliceStationDTO;
import com.xworkz.electricity.repository.PoliceStationRepoImpl;
import com.xworkz.electricity.repository.PoliceStationRepository;
import com.xworkz.electricity.service.PoliceServiceImpl;
import com.xworkz.electricity.service.PoliceStationService;

public class PoliceStationRunner {

	public static void main(String[] args) {

		PoliceStationDTO policeStationDTO = new PoliceStationDTO(12, "Central", 150,
				NumberOfCell.THIRTY, "Bheem Rao");

		PoliceStationRepository repository = new PoliceStationRepoImpl();
		PoliceStationService policeStationService = new PoliceServiceImpl(repository);
		boolean saved = policeStationService.validateAndThenSave(policeStationDTO);
		System.out.println("Saved :"+saved);
	}

}
