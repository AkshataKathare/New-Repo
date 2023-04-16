package com.xworkz.collection.dto;

import java.util.Objects;

public class AnimalDTO {

	private String name;

	public AnimalDTO(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals...of animal");
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof AnimalDTO)) {
			return false;
		}
		AnimalDTO other = (AnimalDTO) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Name :" + this.name;
	}

}
