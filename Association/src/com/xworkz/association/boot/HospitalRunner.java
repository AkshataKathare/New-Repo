package com.xworkz.association.boot;

import com.xworkz.association.things.Doctor;
import com.xworkz.association.things.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {

		Hospital hospital = new Hospital();

		hospital.name = "ESI";

		Doctor doctor = new Doctor();
		doctor.setName("Khaazi");
		String[] ref = { "Dermatologist", "Orthopedics", "Cardiologist" };
		doctor.setSpecialization(ref);
		doctor.setExperience(7.6D);

		Doctor doctor1 = new Doctor();
		doctor1.setName("Gauri");
		String[] ref1 = { "Gynacologist", "Orthopedics", "Psycatrist" };
		doctor1.setSpecialization(ref1);
		doctor1.setExperience(5.5D);

		Doctor[] doc = { doctor, doctor1 };
		hospital.setDoctors(doc);

		hospital.display();

	}

}
