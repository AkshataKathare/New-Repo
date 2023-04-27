package com.xworkz.electricity.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import com.xworkz.electricity.dto.PoliceStationDTO;
import com.xworkz.electricity.repository.PoliceStationRepository;
import com.xworkz.electricity.validation.DTOValidation;

public class PoliceServiceImpl implements PoliceStationService {

	private PoliceStationRepository policeStationRepository;
	private DTOValidation<PoliceStationDTO> dtoValidation = new DTOValidation<>();

	public PoliceServiceImpl(PoliceStationRepository policeStationRepository) {
		System.out.println("PoliceServiceImpl const with policeStationRepository");
		this.policeStationRepository = policeStationRepository;
	}

	@Override
	public boolean validateAndThenSave(PoliceStationDTO dto) {
		System.out.println("Running validateAndThenSave in Service" + dto);
		if (dto != null) {
			System.out.println("dto is not null");
			if (dtoValidation.valid(dto)) {
				System.out.println("No violations in constraints");
				return this.policeStationRepository.save(dto);
			} else {
				System.err.println("There exists violation");
				return false;
			}
		}
		System.err.println("dto is null");
		return false;
	}

}
