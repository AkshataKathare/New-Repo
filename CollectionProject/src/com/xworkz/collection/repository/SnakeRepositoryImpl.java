package com.xworkz.collection.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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

//		for (SnakeDTO snakeDTO : snakes) {
//			if (snakeDTO.getId() == id) {
//				return Optional.of(snakeDTO);
//			}
//		}
		return this.snakes.stream().filter(snake -> snake.getId() == id).findFirst();
	}

	@Override
	public Optional<SnakeDTO> findByName(String name) {

//		for (SnakeDTO snakeDTO : snakes) {
//			if (snakeDTO.getName().equals(name)) {
//				return Optional.of(snakeDTO);
//			}
//		}
		return this.snakes.stream().filter(sn -> sn.getName().equals(name)).findFirst();
	}

	@Override
	public Optional<SnakeDTO> findByNameAndPlace(String name, String place) {
		return this.snakes.stream().filter(e -> e.getName().equals(name) && e.getPlace().equals(place)).findFirst();
//		for (SnakeDTO snakeDTO : snakes) {
//			if (snakeDTO.getName().equals(name) && snakeDTO.getPlace().equals(place)) {
//				return Optional.of(snakeDTO);
//			}
//		}
//		return SnakeRepository.super.findByNameAndPlace(name, place);
	}

	@Override
	public Optional<Collection<SnakeDTO>> findByType(String type) {
		Collection<SnakeDTO> optional = this.snakes.stream().filter(e -> e.getType().equals(type))
				.collect(Collectors.toList());
		return Optional.of(optional);
	}

}
