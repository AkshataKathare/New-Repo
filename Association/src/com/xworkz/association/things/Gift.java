package com.xworkz.association.things;

public class Gift {
	public String shop;
	public double price;
	public Box box;

	public Gift() {
		System.out.println("No-arg constructor in Gift");
	}

	public Gift(String shop, double price) {
		this.shop = shop;
		this.price = price;
	}

	public void init(Box box) {
		this.box = box;
	}

	public void display() {
		System.out.println("Details of Gift..");
		System.out.println(this.shop);
		System.out.println(this.price);
		if (box != null) {
			this.box.show();
		} else {
			System.err.println("box is not pointing to any memory");
		}
	}

}
