package com.xworkz.museum.things;

import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Museum {

	private EntryFee entryFee;

	public Museum(EntryFee entryFee) {
		System.out.println("Creating Museum with EntryFee");
		this.entryFee = entryFee;
	}
}
