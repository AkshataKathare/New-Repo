package com.xworkz.association.things;

public class Sweater {

	public String color;
	public boolean woolen;
	public Zip zip;

	public Sweater() {
		System.out.println("No-arg constructor of Sweater");
	}

	public Sweater(String color, boolean woolen) {
		this.color = color;
		this.woolen = woolen;
	}

	public void init(Zip zip) {
		this.zip = zip;
	}

	public void display() {
		System.out.println("Details of Sweater");
		System.out.println(this.color);
		System.out.println(this.woolen);
		if (zip != null) {
			this.zip.display();
		} else {
			System.err.println("zip is not pointing to any memory..");
		}

	}

}
