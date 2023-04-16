package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.AnimalDTO;

public class AnimalRunner {

	public static void main(String[] args) {

		Collection<AnimalDTO> animalDTOs = new ArrayList<AnimalDTO>();
		animalDTOs.add(new AnimalDTO("Tiger"));// animalDTO
		animalDTOs.add(new AnimalDTO("Lion"));// animalDTO
		animalDTOs.add(new AnimalDTO("Dog"));// animalDTO
		animalDTOs.add(new AnimalDTO("Giraffee"));// animalDTO
		animalDTOs.add(new AnimalDTO("Pig"));// animalDTO

		AnimalDTO animalDTO = new AnimalDTO("Pig");

		boolean containsPig = animalDTOs.contains(animalDTO);
		System.out.println("containsPig " + containsPig);

		animalDTOs.stream().filter(animal -> animal.getName().contains("o"))
				.forEach(animal -> System.out.println(animal));

		animalDTOs.stream().filter(a -> a.getName().contains("i") && a.getName().contains("e"))
				.forEach(a -> System.out.println(a));
		System.out.println("sorting animal in asc...");

		animalDTOs.stream().sorted((a1, a2) -> a2.getName().compareTo(a1.getName()))
				.forEach(a -> System.out.println(a));

	}
}
