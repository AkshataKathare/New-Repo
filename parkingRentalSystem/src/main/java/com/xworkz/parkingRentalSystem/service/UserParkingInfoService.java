package com.xworkz.parkingRentalSystem.service;

import com.xworkz.parkingRentalSystem.dto.AdminParkingInfoDTO;
import com.xworkz.parkingRentalSystem.dto.UserParkingInfoDTO;

public interface UserParkingInfoService {

	boolean saveInfo(UserParkingInfoDTO dto, String email);

	AdminParkingInfoDTO find(String location, String vehicleType, String vehicleClassification, String term);

}
