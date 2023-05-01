package com.xworkz.circuit.thing2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Barber {

	private String name;
	private double experience;
	private float salary;
	private int age;
	private long contactNo;
	private String gender;

	public Barber(@Value("Raghavendra") String name, @Value("3.7") double experience, @Value("20000") float salary,
			@Value("37") int age, @Value("789563678") long contactNo, @Value("Male") String gender) {
		super();
		System.out.println("Running Barber..");
		this.name = name;
		this.experience = experience;
		this.salary = salary;
		this.age = age;
		this.contactNo = contactNo;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Barber [name=" + name + ", experience=" + experience + ", salary=" + salary + ", age=" + age
				+ ", contactNo=" + contactNo + ", gender=" + gender + "]";
	}

}
