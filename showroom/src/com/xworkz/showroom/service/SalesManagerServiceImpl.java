package com.xworkz.showroom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.SalesManagerDTO;
import com.xworkz.showroom.repository.SalesManagerRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SalesManagerServiceImpl implements SalesManagerService {

	private SalesManagerRepository managerRepository;
	private Validator validator;

	@Override
	public boolean validateAndThenSave(SalesManagerDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null " + dto);

			Set<ConstraintViolation<SalesManagerDTO>> constraintViolations = this.validator.validate(dto);

			System.out.println("Total violations :" + constraintViolations.size());
			constraintViolations.forEach(e -> System.err.println(e.getPropertyPath() + " " + e.getMessage()));
			if (constraintViolations.isEmpty()) {
				System.out.println("No violations and hence will be saved");
				return this.managerRepository.save(dto);
			} else {
				System.err.println("will not be saved due to violation");
			}
		} else {
			System.err.println("dto is null");
		}
		return false;
	}

}
