package com.xworkz.electricity.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.electricity.dto.MarriageDTO;
import com.xworkz.electricity.repository.MarriageRepository;

public class MarriageServiceImpl implements MarriageService {

	private MarriageRepository marriageRepository;

	public MarriageServiceImpl(MarriageRepository marriageRepository) {
		System.out.println("Running MarriageServImpl const with marriageRepository");
		this.marriageRepository = marriageRepository;
	}

	@Override
	public boolean validateAndSave(MarriageDTO dto) {
		System.out.println("Running validateAndSave method in Service" + dto);
		if (dto != null) {
			System.out.println("dto is not null");

			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();

			Set<ConstraintViolation<MarriageDTO>> constraints = validator.validate(dto);
			System.out.println("Total violations in constraints :" + constraints.size());
			constraints.forEach(c -> System.err.println(c.getPropertyPath() + " " + c.getMessage()));

			if (constraints.isEmpty()) {
				System.out.println("No violations in dto");
				return this.marriageRepository.save(dto);
			} else {
				System.err.println("There exists violation");
				return false;
			}
		}
		System.err.println("dto is null");
		return false;
	}

}
