package com.xworkz.association.things;

public class XWorkz {

	public String location;
	public boolean institute;
	public double fee;
	public Trainer trainer = new Trainer();

	public void var(String location, boolean institute, double fee) {
		this.location = location;
		this.institute = institute;
		this.fee = fee;
	}

	public void display() {
		System.out.println("Location of Xworkz :" + location);
		System.out.println("Xworkz is an institue :" + institute);
		System.out.println("Fee of Xworkz :" + fee);
		this.trainer.display();

	}

}
