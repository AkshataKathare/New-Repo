package com.file.xworkz.thing;

public class Iron {
	public boolean rusted;
	public String brand;
	public String shape;
	public int weight;
	public float length;
	public String use;
	public int width;
	public boolean house;
	public String welder;
	public int cost;

	public Iron() {
		System.out.println("Declaration of no-arg constructor");
	}

	public Iron(boolean rusted, String brand) {
		this.rusted = rusted;
		this.brand = brand;
		System.out.println("Declaration of boolean and String");
	}

	public Iron(String shape, int weight) {
		this.shape = shape;
		this.weight = weight;
		System.out.println("Declaration of String and int");
	}

	public Iron(float length, String use, int width) {
		this.length = length;
		this.use = use;
		this.width = width;
		System.out.println("Declaration of constructor in float,use and width");
	}

	public Iron(float length, String use, int width, boolean house, String welder, int cost) {
		this(length, use, width);
		this.house = house;
		this.welder = welder;
		this.cost = cost;
		System.out.println("Declaration of constructor in boolean,String and int");
	}

	public void initVar(boolean rusted, String brand, String shape, int weight, float length, String use, int width,
			boolean house, String welder, int cost) {
		this.rusted = rusted;
		this.brand = brand;
		this.shape = shape;
		this.weight = weight;
		this.length = length;
		this.use = use;
		this.width = width;
		this.house = house;
		this.welder = welder;
		this.cost = cost;
	}

	public void display() {
		System.out.println(this.rusted);
		System.out.println(this.brand);
		System.out.println(this.shape);
		System.out.println(this.weight);
		System.out.println(this.length);
		System.out.println(this.use);
		System.out.println(this.width);
		System.out.println(this.house);
		System.out.println(this.welder);
		System.out.println(this.cost);

	}
}
