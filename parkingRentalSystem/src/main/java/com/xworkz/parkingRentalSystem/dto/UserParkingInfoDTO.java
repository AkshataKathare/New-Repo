package com.xworkz.parkingRentalSystem.dto;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class UserParkingInfoDTO implements Serializable, Comparable<UserParkingInfoDTO> {

	private int userId_fk;
	private String location;
	private String vehicleType;
	private String vehicleClassification;
	private String term;
	private double price;
	private int discountInPercentage;
	private double totalAmount;

	public UserParkingInfoDTO() {
		log.info("Created UserParkingInfoDTO using no-arg const");
	}

	@Override
	public int compareTo(UserParkingInfoDTO o) {
		return this.getLocation().compareTo(o.getLocation());
	}

}
