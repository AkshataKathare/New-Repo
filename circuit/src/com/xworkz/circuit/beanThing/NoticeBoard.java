package com.xworkz.circuit.beanThing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class NoticeBoard {

	@Value("Rectangle")
	private String shape;
	private String color;
	private double length;

	public NoticeBoard(@Value("Green") String color) {
		super();
		System.out.println("Creating NoticeBoard with color");
		this.color = color;
	}

	@Value("45")
	public void setLength(double length) {
		System.out.println("Running setLength method in NoticeConfig");
		this.length = length;
	}
}
