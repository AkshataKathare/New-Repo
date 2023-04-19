package com.xworkz.collection.boot;

import java.util.Optional;

import com.xworkz.collection.constant.SnakeType;
import com.xworkz.collection.dto.SnakeDTO;
import com.xworkz.collection.exception.InvalidSnakeDataException;
import com.xworkz.collection.repository.SnakeRepository;
import com.xworkz.collection.repository.SnakeRepositoryImpl;
import com.xworkz.collection.service.SnakeService;
import com.xworkz.collection.service.SnakeServiceImpl;

public class SnakeRunner {

	public static void main(String[] args) {

		SnakeDTO dto = new SnakeDTO(1, "Cobra", SnakeType.POISONOUS, "Dandeli");
		SnakeDTO dto2 = new SnakeDTO(2, "Viper", SnakeType.NON_POISONOUS, "Mysore");
		SnakeDTO dto3 = new SnakeDTO(3, "CottonMouth", SnakeType.NON_POISONOUS, "Tumkur");

		SnakeRepository repository = new SnakeRepositoryImpl();
		SnakeService service = new SnakeServiceImpl(repository);
		try {
			boolean saved = service.validatateAndThenSave(dto);
			System.out.println(saved);

			boolean saved2 = service.validatateAndThenSave(dto2);
			System.out.println(saved2);

			boolean saved3 = service.validatateAndThenSave(dto3);
			System.out.println(saved3);
		} catch (InvalidSnakeDataException e) {
			e.getMessage();
			e.printStackTrace();
		}

		Optional<SnakeDTO> optionalById = service.findById(1);
		if (optionalById.isPresent()) {
			System.out.println("Snake with this id exists");
			SnakeDTO op = optionalById.get();
			System.out.println(op);
		} else {
			System.out.println("snake doesn't exists");
//			throw new IllegalArgumentException();
		}

		Optional<SnakeDTO> optionalByName = service.findByName("Viper");
		if (optionalByName.isPresent()) {
			System.out.println("snake with this name exists");
			SnakeDTO optiByNa = optionalByName.get();
			System.out.println(optiByNa);
		} else {
			System.out.println("snake doesn't exists");
		}

		Optional<SnakeDTO> optionalByNameAndPlace = service.findByNameAndPlace("CottonMouth", "Tumkur");
		if (optionalByNameAndPlace.isPresent()) {
			System.out.println("snake with this name and place exists");
			SnakeDTO opByNamAndPl = optionalByNameAndPlace.get();
			System.out.println(opByNamAndPl);
		} else {
			System.out.println("snake doesn't exists");
		}

	}

}
