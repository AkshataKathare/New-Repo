package com.xworkz.museum.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Thing {

	@Autowired
	private String animalMask;

	public Thing() {
		System.out.println("Creating Thing using no-arg const");
	}
}
