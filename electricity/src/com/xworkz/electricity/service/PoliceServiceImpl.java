package com.xworkz.electricity.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import com.xworkz.electricity.dto.PoliceStationDTO;
import com.xworkz.electricity.repository.PoliceStationRepository;

public class PoliceServiceImpl implements PoliceStationService {

	private PoliceStationRepository policeStationRepository;

	public PoliceServiceImpl(PoliceStationRepository policeStationRepository) {
		System.out.println("PoliceServiceImpl const with policeStationRepository");
		this.policeStationRepository = policeStationRepository;
	}

	@Override
	public boolean validateAndThenSave(PoliceStationDTO dto) {
		System.out.println("Running validateAndThenSave in Service");
		if (dto != null) {
			System.out.println("dto is not null");

			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();

			Set<ConstraintViolation<PoliceStationDTO>> constraints = validator.validate(dto);

			System.out.println("Total violations :" + constraints.size());
			constraints.forEach(cv -> System.err.println(cv.getPropertyPath() + " " + cv.getMessage()));

			if (constraints.isEmpty()) {
				System.out.println("No violations in constraints");
				return this.policeStationRepository.save(dto);
			}

		}
		System.err.println("There exists violation and hence will not be saved");
		return false;
	}

}
