package com.file.xworkz.thing;

public class CupBoard {

	public String color;
	public boolean mirror;
	public int height;
	public int width;
	public float cost;
	public char quality;

	public CupBoard() {
		System.out.println("Declaring no-arg constructor");
	}

	public CupBoard(String color) {
		this.color = color;
		System.out.println("Declaring constructor with String");
	}

	public CupBoard(boolean mirror) {
		this.mirror = mirror;
		System.out.println("Declaring constructor with boolean");
	}

	public CupBoard(int height, int width) {
		this.height = height;
		this.width = width;
		System.out.println("Declaring constructor with int and int");
	}

	public CupBoard(float cost, char quality) {
		this.cost = cost;
		this.quality = quality;
		System.out.println("Declaring constructor with float and char");

	}

	public void init(String color, boolean mirror, int height, int width, float cost, char quality) {
		this.color = color;
		this.mirror = mirror;
		this.height = height;
		this.width = width;
		this.cost = cost;
		this.quality = quality;
	}

	public void display() {
		System.out.println(this.color);
		System.out.println(this.mirror);
		System.out.println(this.height);
		System.out.println(this.width);
		System.out.println(this.cost);
		System.out.println(this.quality);

	}

}
