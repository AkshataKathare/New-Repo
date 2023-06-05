package com.xworkz.jdbcIntegration.util;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.jdbcIntegration.dto.EducationDTO;

public class ValidationUtil {

	public static boolean valid(EducationDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<EducationDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.out.println("There exists violations and hence will not be saved");
			violations.forEach(v -> System.err.println(v.getPropertyPath() + " " + v.getMessage()));
		}
		return violations.isEmpty();
	}
}
