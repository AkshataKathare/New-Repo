package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.EmployeeDTO;

public class EmployeeRunner {

	public static void main(String[] args) {

		Collection<EmployeeDTO> employeeDTOs = new ArrayList<>();
		employeeDTOs.add(new EmployeeDTO("Akshata"));
		employeeDTOs.add(new EmployeeDTO("Darshan"));
		employeeDTOs.add(new EmployeeDTO("Sagar"));
		employeeDTOs.add(new EmployeeDTO("Abhishek"));
		employeeDTOs.add(new EmployeeDTO("Arpita"));

		EmployeeDTO dto = new EmployeeDTO("Darshan");

		boolean contains = employeeDTOs.contains(dto);
		System.out.println(contains);

		employeeDTOs.stream().filter(emp -> emp.getName().contains("n")).forEach(e -> System.out.println(e));

		System.out.println("Sorting into reverse alphabetical order");
		employeeDTOs.stream().sorted((e1, e2) -> e2.getName().compareTo(e1.getName()))
				.forEach(e -> System.out.println(e));// descending order
	}

}
