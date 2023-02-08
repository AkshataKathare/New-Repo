package com.xworkz.association.things;

public class Engineer {
	public String name;
	public double salary;
	public String[] skills;
	public Degree[] degrees;

	public Engineer() {
		System.out.println("No-arg constructor in Engineer ...");

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public void setDegrees(Degree[] degrees) {
		this.degrees = degrees;
	}

	public void display() {
		System.out.println("Details of Engineer...");
		System.out.println(this.name);
		System.out.println(this.salary);
		if (skills != null) {
			for (int seq = 0; seq < this.skills.length; seq++) {
				String element = this.skills[seq];
				System.out.println("Skill " + element + " at index" + seq);
			}
		} else {
			System.err.println("this.skills is not pointing to any memory...");
		}
		if (degrees != null) {
			for (int seq = 0; seq < this.degrees.length; seq++) {
				Degree element = this.degrees[seq];
				element.display();
			}

		} else {
			System.out.println("this.degrees is not pointing to any memory..");
		}
	}

}
