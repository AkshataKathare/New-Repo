package com.xworkz.association.things;

public class Degree {

	public String name;
	public int duration;
	public boolean pursuing;
	public double percentage;
	public String branch;

	public Degree() {
		System.out.println("No-arg constructor in Degree..");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void setPursue(boolean pursuing) {
		this.pursuing = pursuing;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void display() {
		System.out.println("Details of Degree");
		System.out.println(this.name);
		System.out.println(this.duration);
		System.out.println(this.pursuing);
		System.out.println(this.percentage);
		System.out.println(this.branch);

	}
}
