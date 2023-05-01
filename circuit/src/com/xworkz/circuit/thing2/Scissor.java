package com.xworkz.circuit.thing2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Scissor {

	@Value("Sharp")
	private String type;
	private double weight;
	@Value("Green")
	private String color;

	public Scissor() {
		System.out.println("No-arg const in Scissor");
	}

	@Value("30")
	public void setWeight(double weight) {
		System.out.println("Setter for setting weight in Scissor");
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Scissor [type=" + type + ", weight=" + weight + ", color=" + color + "]";
	}
}
