package com.xworkz.parkingRentalSystem.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class UserLoginDTO implements Serializable, Comparable<UserLoginDTO> {

	private String userEmail;
	private int otp;

	public UserLoginDTO() {
		log.info("Creating UserLoginDTO using no-arg const");
	}

	@Override
	public int compareTo(UserLoginDTO o) {
		return this.getUserEmail().compareTo(o.getUserEmail());
	}
}
