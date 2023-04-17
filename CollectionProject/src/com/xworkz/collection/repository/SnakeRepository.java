package com.xworkz.collection.repository;

import java.util.Collection;
import java.util.Optional;
import com.xworkz.collection.dto.SnakeDTO;

public interface SnakeRepository {

	boolean save(SnakeDTO dto);

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
