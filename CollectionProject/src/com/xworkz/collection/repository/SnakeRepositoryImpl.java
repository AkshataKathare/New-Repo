package com.xworkz.collection.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.SnakeDTO;

public class SnakeRepositoryImpl implements SnakeRepository {

	private Collection<SnakeDTO> snakes = new ArrayList<>();

	public SnakeRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}

	public SnakeRepositoryImpl(Collection<SnakeDTO> snakes) {
		this.snakes = snakes;
	}

	@Override
	public boolean save(SnakeDTO dto) {
		return this.snakes.add(dto);
	}

	@Override
	public Optional<SnakeDTO> findById(int id) {

		for (SnakeDTO snakeDTO : snakes) {
			if (snakeDTO.getId() == id) {
				return Optional.of(snakeDTO);
			}
		}
		return Optional.empty();
	}

	@Override
	public Optional<SnakeDTO> findByName(String name) {

		for (SnakeDTO snakeDTO : snakes) {
			if (snakeDTO.getName().equals(name)) {
				return Optional.of(snakeDTO);
			}
		}
		return SnakeRepository.super.findByName(name);
	}

	@Override
	public Optional<SnakeDTO> findByNameAndPlace(String name, String place) {

		for (SnakeDTO snakeDTO : snakes) {
			if (snakeDTO.getName().equals(name) && snakeDTO.getPlace().equals(place)) {
				return Optional.of(snakeDTO);
			}
		}
		return SnakeRepository.super.findByNameAndPlace(name, place);
	}

	@Override
	public Optional<Collection<SnakeDTO>> findByType(String type) {
		for (SnakeDTO snakeDTO : snakes) {
			if (snakeDTO.getType().equals(type)) {

				return Optional.of(null);
			}
		}
		return SnakeRepository.super.findByType(type);
	}

}
