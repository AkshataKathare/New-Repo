package com.file.xworkz.thing;

public class Place {
	public String name;
	public int population;
	public String district;
	public String state;
	public String country;

	public Place() {
		System.out.println("Declaring No-arg Constructor");
	}

	public Place(String name) {
		this.name = name;
		System.out.println("Declaring constructor with String");
	}

	public Place(String name, int population) {
		this(name);
		this.population = population;
		System.out.println("Declaring constructor with String and int");
	}

	public Place(String name, int population, String district) {
		this(name, population);
		this.district = district;
		System.out.println("Declaring constructor with String,int and String");
	}

	public Place(String name,int population,String district,String state) {
	    this(name,population,district);
		this.state=state;
		System.out.println("Declaring constructor with String,int,String and String");
	}

	public Place(String name, int population, String district, String state, String country) {
		this(name, population, district, state);
		this.country = country;
		System.out.println("Declaring constructor with String,int,String,String and String");
	}

	public void initVariables(String name, int population, String district, String state, String country) {
		this.name = name;
		this.population = population;
		this.district = district;
		this.state = state;
		this.country = country;
	}

	public void show() {
		System.out.println(this.name);
		System.out.println(this.population);
		System.out.println(this.district);
		System.out.println(this.state);
		System.out.println(this.country);

	}

}
