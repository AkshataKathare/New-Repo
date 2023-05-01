package com.xworkz.circuit.thing2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mirror {

	@Value("4.8")
	private float height;
	private String shape;
	private double weight;

	public Mirror(@Value("Oval") String shape) {
		System.out.println("Running Mirror with shape..");
		this.shape = shape;
	}

	@Value("39")
	public void setWeight(double weight) {
		System.out.println("Running setWeight in Mirror");
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Mirror [height=" + height + ", shape=" + shape + ", weight=" + weight + "]";
	}

}
