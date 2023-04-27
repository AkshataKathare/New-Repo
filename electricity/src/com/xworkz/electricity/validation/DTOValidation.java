package com.xworkz.electricity.validation;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class DTOValidation<T> {

	public boolean valid(T t) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		Set<ConstraintViolation<T>> violations = validator.validate(t);

		System.out.println("Total violations :" + violations.size());
		violations.forEach(c -> System.err.println(c.getPropertyPath() + " " + c.getMessage()));
		return violations.isEmpty();
	}

}
