package com.xworkz.circuit.thing;

import org.springframework.stereotype.Component;

@Component
public class SuitCase {

	public SuitCase() {
		System.out.println("No-arg const in SuitCase");
	}
}