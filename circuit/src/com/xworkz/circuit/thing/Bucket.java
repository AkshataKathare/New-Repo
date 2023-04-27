package com.xworkz.circuit.thing;

import org.springframework.stereotype.Component;

@Component
public class Bucket {

	public Bucket() {
		System.out.println("No-arg const in Bucket");
	}
}
