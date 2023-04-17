package com.xworkz.collection.service;

import java.util.Collection;
import java.util.Optional;

import com.xworkz.collection.dto.SnakeDTO;
import com.xworkz.collection.exception.InvalidSnakeDataException;

public interface SnakeService {

	boolean validatateAndThenSave(SnakeDTO dto) throws InvalidSnakeDataException;

	Optional<SnakeDTO> findById(int id);

	default Optional<SnakeDTO> findByName(String name) {
		return Optional.empty();
	}

	default Optional<SnakeDTO> findByNameAndPlace(String name, String place) {
		return Optional.empty();
	}

	default Optional<Collection<SnakeDTO>> findByType(String type) {
		return Optional.empty();
	}

}
