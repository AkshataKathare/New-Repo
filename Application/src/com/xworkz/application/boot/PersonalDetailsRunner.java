package com.xworkz.application.boot;

import java.lang.reflect.Method;

import com.xworkz.application.dto.PersonalDetailsDTO;

public class PersonalDetailsRunner {

	public static void main(String[] args) {

		PersonalDetailsDTO detailsDTO = new PersonalDetailsDTO();
		Class<PersonalDetailsDTO> classDto= (Class<PersonalDetailsDTO>) detailsDTO.getClass();
	
		Method[] methods= classDto.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			System.out.println(method.getName());
			
		}
	}

}
