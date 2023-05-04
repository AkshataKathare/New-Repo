package com.xworkz.showroom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.SockDTO;
import com.xworkz.showroom.repository.SockRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SockServiceImpl implements SockService {

	private SockRepository repository;
	private Validator validator;

	@Override
	public boolean validateAndThenSave(SockDTO dto) {
		System.out.println("Running validateAndThenSave method in SockService");

		if (dto != null) {
			System.out.println("dto is not null");

			Set<ConstraintViolation<SockDTO>> constraintViolations = this.validator.validate(dto);
			System.out.println("Total violations :" + constraintViolations.size());
			constraintViolations.forEach(e -> System.err.println(e.getPropertyPath() + " " + e.getMessage()));
			if (constraintViolations.isEmpty()) {
				System.out.println("dto will be saved as there are no violations");
				return this.repository.save(dto);
			} else {
				System.err.println("sto will not be saved as there is violation");
			}
		} else {
			System.err.println("dto is null");
		}
		return false;
	}

}
