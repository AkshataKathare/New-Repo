package com.xworkz.link.boot;

import com.xworkz.link.things.HospitalRule;
import com.xworkz.link.things.Patient;

public class HospitalRuleRunner {

	public static void main(String[] args) {

		Patient patient = new Patient();
		System.out.println(patient.checkUp());
		System.out.println(patient.clean());
		System.out.println(patient.closedDay());
		System.out.println(patient.closingTime());
		System.out.println(patient.dressCode());
		System.out.println(patient.minPatients());
		System.out.println(patient.noSmoking());
		System.out.println(patient.openingTime());
		System.out.println(patient.threeFloors());
		System.out.println(patient.wearMask());
		System.out.println(patient.equals(patient));
		System.out.println(patient.hashCode());
		System.out.println(patient.toString());
		System.out.println(patient.getClass());
		
		HospitalRule hospital=new Patient();
		System.out.println(hospital.checkUp());
		System.out.println(hospital.clean());
		System.out.println(hospital.closedDay());
		System.out.println(hospital.closingTime());
		System.out.println(hospital.dressCode());
		System.out.println(hospital.minPatients());
		System.out.println(hospital.noSmoking());
		System.out.println(hospital.openingTime());
		System.out.println(hospital.threeFloors());
		System.out.println(hospital.wearMask());
		

	}

}
