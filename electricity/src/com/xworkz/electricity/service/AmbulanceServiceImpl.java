package com.xworkz.electricity.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.electricity.dto.AmbulanceDTO;
import com.xworkz.electricity.repository.AmbulanceRepository;
import com.xworkz.electricity.validation.DTOValidation;

public class AmbulanceServiceImpl implements AmbulanceService {

	private AmbulanceRepository ambulanceRepository;
	private DTOValidation<AmbulanceDTO> dtoValidation = new DTOValidation<>();

	public AmbulanceServiceImpl(AmbulanceRepository ambulanceRepository) {
		System.out.println("Running AmbulanceServiceImpl with ambulanceRepository");
		this.ambulanceRepository = ambulanceRepository;
	}

	@Override
	public boolean validateAndThenSave(AmbulanceDTO dto) {

		if (dto != null) {
			System.out.println("dto is not null " + dto);

			if (dtoValidation.valid(dto)) {
				System.out.println("No violations in dto and hence dto will be saved");
				return this.ambulanceRepository.save(dto);
			} else {
				System.err.println("There exists violations");
				return false;
			}
		}
		System.err.println("dto is null");
		return false;
	}

}
