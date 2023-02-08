package com.xworkz.association.things;

public class Hospital {
	public String name;
	public Doctor[] doctors;

	public Hospital() {
		System.out.println("No-arg constructor in Hospital");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDoctors(Doctor[] doctors) {
		this.doctors = doctors;
	}

	public void display() {
		System.out.println("Details of Hospital..");
		System.out.println(this.name);
		if (this.doctors != null) {
			for (int seq = 0; seq < this.doctors.length; seq++) {
				Doctor element = this.doctors[seq];
				System.out.println("Index :" + seq);
				element.display();

			}
		} else {
			System.err.println("this.doctors is not pointing to any memory..");
		}

	}

}
