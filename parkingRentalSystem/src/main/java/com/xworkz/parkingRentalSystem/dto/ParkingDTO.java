package com.xworkz.parkingRentalSystem.dto;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class ParkingDTO implements Serializable, Comparable<ParkingDTO> {

	private String name;

	private String email;

	private String password;

	private LocalDateTime loginTime;

	public ParkingDTO() {
		log.info("Creating ParkingDTO using no-arg const");
	}

	@Override
	public int compareTo(ParkingDTO o) {
		return this.getEmail().compareTo(o.getEmail());
	}

}
