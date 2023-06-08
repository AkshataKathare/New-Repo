package com.xworkz.holiday.util;

import java.util.Set;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.holiday.entity.HolidayEntity;

import lombok.val;

public class JPAUtil {

	private static EntityManagerFactory factory;

	public static EntityManagerFactory getFactory() {
		return factory;
	}

	static {
		factory = Persistence.createEntityManagerFactory("com.xworkz");
	}

	public boolean valid(HolidayEntity entity) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<HolidayEntity>> cv = validator.validate(entity);
		if (!cv.isEmpty()) {
			System.out.println("Entity contains violations and hence will not be saved");
			System.out.println("Number of violations " + cv.size());
			cv.forEach(c -> System.err.println(c.getPropertyPath() + " " + c.getMessage()));
			return false;

		}
		return cv.isEmpty();
	}
}
