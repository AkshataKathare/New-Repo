package com.xworkz.museum.things;

import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Guide {

	private Security security;

	public Guide(Security security) {
		System.out.println("Creating Guide with Security");
		this.security = security;
	}
}
