package com.xworkz.collection.service;

import java.util.Collection;
import java.util.Optional;

import com.xworkz.collection.constant.SnakeType;
import com.xworkz.collection.dto.SnakeDTO;
import com.xworkz.collection.exception.InvalidSnakeDataException;
import com.xworkz.collection.repository.SnakeRepository;
import static com.xworkz.collection.util.ValidationUtil.*;

public class SnakeServiceImpl implements SnakeService {

	private SnakeRepository repository;

	public SnakeServiceImpl(SnakeRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validatateAndThenSave(SnakeDTO dto) throws InvalidSnakeDataException {
		if (dto != null) {
			int id = dto.getId();
			String name = dto.getName();
			String place = dto.getPlace();
			SnakeType type = dto.getType();

			boolean validID = false;
			boolean validName = false;
			boolean validPlace = false;
			boolean validType = false;

			if (validString(name)) {
				System.out.println("name is valid");
				validName = true;
			} else {
				System.err.println("name is invalid");
			}
			if (validString(place)) {
				System.out.println("place is valid");
				validPlace = true;
			} else {
				System.err.println("place is invalid");
			}
			if (id > 0) {
				System.out.println("id is valid");
				validID = true;
			} else {
				System.err.println("id is invalid");
			}
			if (type != null) {
				System.out.println("type is valid");
				validType = true;
			} else {
				System.err.println("type is invalid");
			}
			if (validFlag(validID, validName, validPlace, validType)) {
				return this.repository.save(dto);
			} else {
				throw new InvalidSnakeDataException("Invalid Data");
			}
		}
		return false;
	}

	@Override
	public Optional<SnakeDTO> findById(int id) {
		if (id > 0) {
			return this.repository.findById(id);
		}
		return Optional.empty();
	}

	@Override
	public Optional<SnakeDTO> findByName(String name) {
		if (validString(name)) {
			return this.repository.findByName(name);
		}
		return Optional.empty();
	}

	@Override
	public Optional<SnakeDTO> findByNameAndPlace(String name, String place) {
		if (validString(name) && validString(place)) {
			return this.repository.findByNameAndPlace(name, place);
		}
		return Optional.empty();
	}

	@Override
	public Optional<Collection<SnakeDTO>> findByType(String type) {
		if (type != null) {
			return this.repository.findByType(type);
		}
		return Optional.empty();
	}

}
