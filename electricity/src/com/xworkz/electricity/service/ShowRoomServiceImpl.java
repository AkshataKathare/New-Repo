package com.xworkz.electricity.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import com.xworkz.electricity.dto.ShowRoomDTO;
import com.xworkz.electricity.repository.ShowRoomRepository;

public class ShowRoomServiceImpl implements ShowRoomService {

	private ShowRoomRepository repository;

	public ShowRoomServiceImpl(ShowRoomRepository repository) {
		System.out.println("Running ShowRoomServiceImpl const in Service");
		this.repository = repository;
	}

	@Override
	public boolean validateAndThenSave(ShowRoomDTO dto) {
		System.out.println("Running validateAndThenSave in Service" + dto);
		if (dto != null) {
			System.out.println("dto is not null");

			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();

			Set<ConstraintViolation<ShowRoomDTO>> constraints = validator.validate(dto);
			System.out.println("Total violations :" + constraints.size());
			constraints.forEach(cons -> System.err.println(cons.getPropertyPath() + " " + cons.getMessage()));

			if (constraints.isEmpty()) {
				System.out.println("No violations in constraints of DTO");
				return this.repository.save(dto);
			} else {
				System.err.println("There exists violation");
				return false;
			}
		}
		System.err.println("dto is null");
		return false;
	}

}
