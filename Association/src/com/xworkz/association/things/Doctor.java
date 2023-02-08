package com.xworkz.association.things;

public class Doctor {
	public String name;
	public String[] specialization;
	public double experience;

	public Doctor() {
		System.out.println("No-arg constructor of Doctor");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSpecialization(String[] specialization) {
		this.specialization = specialization;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public void display() {
		System.out.println("Details of Doctor");
		System.out.println(this.name);
		System.out.println(this.experience);
		for (int seq = 0; seq < this.specialization.length; seq++) {
			String element = this.specialization[seq];
			System.out.println("Specialization " + element + " At index" + seq);
		}
	}

}
