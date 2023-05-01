package com.xworkz.circuit.thing2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Saloon {

	private String name;
	private String ownerName;
	private String type;
	private String location;
	private int noOfBarbers;

	public Saloon(@Value("Princess Saloon") String name, @Value("Jamuna") String ownerName,
			@Value("Ladies saloon") String type, @Value("Kamankatti") String location, @Value("5") int noOfBarbers) {
		super();
		System.out.println("Saloon is running...");
		this.name = name;
		this.ownerName = ownerName;
		this.type = type;
		this.location = location;
		this.noOfBarbers = noOfBarbers;
	}

	@Override
	public String toString() {
		return "Saloon [name=" + name + ", ownerName=" + ownerName + ", type=" + type + ", location=" + location
				+ ", noOfBarbers=" + noOfBarbers + "]";
	}

}
