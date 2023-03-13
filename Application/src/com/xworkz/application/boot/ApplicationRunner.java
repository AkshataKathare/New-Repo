package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.dto.ApplicationDTO;

public class ApplicationRunner {

	public static void main(String[] args) {

		ApplicationDTO applicationDTO = new ApplicationDTO();
		applicationDTO.setCreatedBy("Hasmukh");
		applicationDTO.setLaunchDate(LocalDate.of(2001, 10, 4));
		applicationDTO.setMobileApp(true);
		applicationDTO.setName("Facebook");
		applicationDTO.setSince(2001);
		System.out.println(applicationDTO);

		int hash = applicationDTO.hashCode();
		System.out.println(hash);

		boolean same = applicationDTO.equals(applicationDTO);
		System.out.println(same);

	}

}
