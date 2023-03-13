package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.dto.AwarenessDTO;

public class AwarenessRunner {

	public static void main(String[] args) {
		AwarenessDTO awarenessDTO = new AwarenessDTO();
		awarenessDTO.setDate(LocalDate.of(1998, 10, 11));
		awarenessDTO.setInitiatedBy("Hasmukh");
		awarenessDTO.setLocation("Kormagala");
		awarenessDTO.setNoOfPeopleInvolved(20);
		awarenessDTO.setType("Drive slowly");
		System.out.println(awarenessDTO);

		int hash = awarenessDTO.hashCode();
		System.out.println(hash);

		boolean equal = awarenessDTO.equals(awarenessDTO);
		System.out.println(equal);
	}

}
