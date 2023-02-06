package com.xworkz.association.things;

public class Shirt {
	public String color;
	public double price;
	public String brand;
	public Button button = new Button();

	public void initVar(String color, double price, String brand) {
		this.color = color;
		this.price = price;
		this.brand = brand;
	}

	public void display() {
		System.out.println("Color of shirt :" + color);
		System.out.println("Price of shirt :" + color);
		System.out.println("Brand of shirt :" + color);
		this.button.display();

	}

}
