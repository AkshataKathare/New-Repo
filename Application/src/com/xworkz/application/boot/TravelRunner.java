package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.dto.TravelDTO;

public class TravelRunner {

	public static void main(String[] args) {

		TravelDTO travelDTO = new TravelDTO();
		travelDTO.setBusName("Rajkumar");
		travelDTO.setDateOfReachingDestiny(LocalDate.now());
		travelDTO.setDestination("Kedarnath");
		travelDTO.setNoOfTravellers(100);
		travelDTO.setTravelCharge(20000);
		System.out.println(travelDTO);

		boolean same = travelDTO.equals(travelDTO);
		System.out.println(same);
		int hash = travelDTO.hashCode();
		System.out.println(hash);

	}

}
