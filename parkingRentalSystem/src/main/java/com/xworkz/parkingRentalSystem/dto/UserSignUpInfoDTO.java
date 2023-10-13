package com.xworkz.parkingRentalSystem.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class UserSignUpInfoDTO implements Serializable, Comparable<UserSignUpInfoDTO> {

	private String userName;
	private String email;
	private String mobileNo;
	private int otp;

	public UserSignUpInfoDTO() {
		log.info("Created UserSignUpInfoDTO using no-arg const");
	}

	@Override
	public int compareTo(UserSignUpInfoDTO o) {
		return this.getEmail().compareTo(o.getEmail());
	}

}
