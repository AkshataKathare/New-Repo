package com.xworkz.parkingRentalSystem.repository;

import com.xworkz.parkingRentalSystem.entity.AdminParkingInfoEntity;
import com.xworkz.parkingRentalSystem.entity.UserParkingInfoEntity;

public interface UserParkingInfoRepo {

	boolean saveInfo(UserParkingInfoEntity entity);

	AdminParkingInfoEntity findByParameters(String location, String vehicleType, String vehicleClassification,
			String term);

}
