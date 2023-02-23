package com.xworkz.exception.boot;

import com.xworkz.exception.things.Doctor;
import com.xworkz.exception.things.Engineer;

public class PersonRunner {

	public static void main(String[] args) {

		Engineer engineer = new Engineer(1910, "Sagar", 26, "sagar.m.v@gmail.com");
		System.out.println(engineer);
		System.out.println(engineer.hashCode());

		Engineer engineer2 = new Engineer(2023, "Akshata");
		System.out.println(engineer2);
		System.out.println(engineer2.hashCode());

		boolean equal = engineer.equals(engineer2);
		System.out.println(equal);

		Engineer engineer3 = new Engineer(2000, "Arpita", "arpitakathare@gmail.com");
		System.out.println(engineer3);
		System.out.println(engineer3.hashCode());

		boolean same = engineer2.equals(engineer3);
		System.out.println(same);

		System.out.println("       ");

		Doctor doctor = new Doctor(600, "Abhi", "abhikathare@gmail.com", "Kathare");
		System.out.println(doctor);
		System.out.println(doctor.hashCode());

		Doctor doctor2 = new Doctor("Apollo", 500, "Vimal", "Dermatologist");
		System.out.println(doctor2);
		System.out.println(doctor2.hashCode());

		boolean equal2 = doctor.equals(doctor2);
		System.out.println(equal2);

		Doctor doctor3 = new Doctor(700, "Datta", 45, "dattakathare@gmail.com", "Cardiologist");
		System.out.println(doctor3);
		System.out.println(doctor3.hashCode());

		boolean same2 = doctor2.equals(doctor3);
		System.out.println(same2);

	}

}
