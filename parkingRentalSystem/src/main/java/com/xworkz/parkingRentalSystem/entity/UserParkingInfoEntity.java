package com.xworkz.parkingRentalSystem.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.parkingRentalSystem.util.AdminLoginUtil;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@Entity
@Table(name = "userParkingInfo")
public class UserParkingInfoEntity extends AdminLoginUtil {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int parkingId;
	private int userId_fk;
	private String location;
	private String vehicleType;
	private String vehicleClassification;
	private String term;
	private double price;
	private int discountInPercentage;
	private double totalAmount;

	public UserParkingInfoEntity() {
		log.info("Created UserParkingInfoEntity using no-arg const");
	}

	public UserParkingInfoEntity(String createdBy, LocalDate createdDate, String updatedBy, LocalDate updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		log.info("Created UserParkingInfoEntity using parameterised const");
	}

}
