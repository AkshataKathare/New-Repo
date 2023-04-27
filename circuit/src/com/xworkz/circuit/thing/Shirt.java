package com.xworkz.circuit.thing;

import org.springframework.stereotype.Component;

@Component
public class Shirt {

	public Shirt() {
		System.out.println("No-arg const in Shirt");
	}
}
