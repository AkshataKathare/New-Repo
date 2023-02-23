package com.xworkz.exception.things;

import javax.print.Doc;

import org.w3c.dom.DOMConfiguration;

public class Doctor extends Person {

	public String specialisation;
	public String hospitalName;

	public Doctor(int id, String name, int age, String email, String specialisation) {
		super(id, name, age, email);
		this.specialisation = specialisation;
	}

	public Doctor(int id, String name, String email, String hospitalName) {
		super(id, name, email);
		this.hospitalName = hospitalName;
	}

	public Doctor(String hospitalName, int id, String name, String specialisation) {
		super(id, name);
		this.specialisation = specialisation;
		this.hospitalName = hospitalName;

	}

	@Override
	public String toString() {
		System.out.println("Over-riding toString in Doctor..");
		return "ID :" + this.id + " Name :" + this.name + " Email :" + this.email + " Specialisation :"
				+ this.specialisation + " Hospital name :" + this.hospitalName;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Over-riding equals in Doctor..");
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Doctor) {
				System.out.println("obj is Doctor type..");
				Doctor casted = (Doctor) obj;
				Doctor left = this;
				Doctor right = casted;
				if (left.id == right.id && left.name.equals(right.name) && left.age == right.age
						&& left.email.equals(right.email) && left.specialisation.equals(right.specialisation)
						&& left.hospitalName.equals(right.hospitalName)) {
					System.out.println("left and right are same..");
					return true;
				} else {
					System.err.println("left and right are not same..");
				}
			} else {
				System.err.println("obj is not Doctor type..");
			}
		} else {
			System.err.println("obj is null..");
		}
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		System.out.println("Over-riding hashCode in Doctor..");
		return 500;
	}

}
