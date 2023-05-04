package com.xworkz.showroom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.ShoeShowRoomDTO;
import com.xworkz.showroom.repository.ShowRoomRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ShowRoomServiceImpl implements ShowRoomService {

	private ShowRoomRepository repository;
	private Validator validator;

	@Override
	public boolean validateAndThenSave(ShoeShowRoomDTO room) {
		if (room != null) {
			System.out.println("room is not null " + room);

			Set<ConstraintViolation<ShoeShowRoomDTO>> violations = this.validator.validate(room);

			System.out.println("Total violations :" + violations.size());
			violations.forEach(c -> System.err.println(c.getPropertyPath() + " " + c.getMessage()));

			if (violations.isEmpty()) {
				System.out.println("No violations and hence will be saved");
				return this.repository.save(room);
			} else {
				System.err.println("There are violations");
			}
		} else {
			System.err.println("room is null");
		}
		return false;

	}

}
