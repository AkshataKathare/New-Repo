package com.xworkz.parkingRentalSystem.util;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AdminLoginUtil {

	private String createdBy;
	private LocalDate createdDate;
	private String updatedBy;
	private LocalDate updatedDate;

}
