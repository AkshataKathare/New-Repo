package com.xworkz.mvcArch.service;

import java.util.Set;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import com.xworkz.mvcArch.dto.IskonDTO;
import com.xworkz.mvcArch.repository.IskonRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IskonServiceImpl implements IskonService {

	private Validator validator;
	private IskonRepository iskonRepository;

	@Override
	public boolean validateAndThenSave(IskonDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null");

			Set<ConstraintViolation<IskonDTO>> constraints = validator.validate(dto);

			if (!constraints.isEmpty()) {
				System.out.println("There are violations and hence will not be saved");
				constraints.forEach(cv -> System.err.println(cv.getPropertyPath() + " " + cv.getMessage()));
			} else {
				System.out.println("No violations in data and hence will be saved");
				return this.iskonRepository.save(dto);
			}
		} else {
			System.err.println("dto is null");
		}
		return false;
	}

	@Override
	public boolean findByLocation(String location) {
		return this.iskonRepository.findByLocation(location);
	}

	@Override
	public boolean updateByLocation(String location) {
		return this.iskonRepository.updateByLocation(location);
	}

	@Override
	public boolean deleteIskon(String location) {
		return this.iskonRepository.deleteIskon(location);
	}

}
