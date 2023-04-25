package com.xworkz.electricity.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.electricity.dto.AmbulanceDTO;
import com.xworkz.electricity.repository.AmbulanceRepository;

public class AmbulanceServiceImpl implements AmbulanceService {

	private AmbulanceRepository ambulanceRepository;

	public AmbulanceServiceImpl(AmbulanceRepository ambulanceRepository) {
		System.out.println("Running AmbulanceServiceImpl with ambulanceRepository");
		this.ambulanceRepository = ambulanceRepository;
	}

	@Override
	public boolean validateAndThenSave(AmbulanceDTO dto) {

		if (dto != null) {
			System.out.println("dto is not null");

			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();

			Set<ConstraintViolation<AmbulanceDTO>> violations = validator.validate(dto);

			System.out.println("Total violations :" + violations.size());
			violations.forEach(c -> System.err.println(c.getPropertyPath() + " " + c.getMessage()));

			if (violations.isEmpty()) {
				System.out.println("No violations in dto and hence dto will be saved");
				return this.ambulanceRepository.save(dto);
			}
		}
		System.err.println("Due to violations,dto is not be saved");
		return false;
	}

}
