package com.xworkz.association.things;

public class Button {
	public char size;
	public String color;
	public int noOfButtons;

	public void initVar(char size, String color, int noOfButtons) {
		this.size = size;
		this.color = color;
		this.noOfButtons = noOfButtons;
	}

	public void display() {
		System.out.println("Size of button :" + size);
		System.out.println("Color of button :" + color);
		System.out.println("Number of button :" + noOfButtons);

	}

}
