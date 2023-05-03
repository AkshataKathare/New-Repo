package com.xworkz.museum.things;

import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Security {

	private Thing thing;

	public Security(Thing thing) {
		System.out.println("Creating Security with Thing");
		this.thing = thing;
	}
}
