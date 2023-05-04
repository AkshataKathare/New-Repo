package com.xworkz.showroom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.PolishDTO;
import com.xworkz.showroom.repository.PolishRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PolishServiceImpl implements PolishService {

	private PolishRepository polishRepository;
	private Validator validator;

	@Override
	public boolean validateAndThenSave(PolishDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null");

			Set<ConstraintViolation<PolishDTO>> constraintViolations = this.validator.validate(dto);

			System.out.println("Total constraints :" + constraintViolations.size());
			constraintViolations.forEach(c -> System.err.println(c.getPropertyPath() + " " + c.getMessage()));

			if (constraintViolations.isEmpty()) {
				System.out.println("There are no violations and hence will be saved");
				return this.polishRepository.save(dto);
			} else {
				System.err.println("There exists violation and hence will not be saved");
			}
		} else {
			System.err.println("dto is null");
		}
		return false;
	}

}
