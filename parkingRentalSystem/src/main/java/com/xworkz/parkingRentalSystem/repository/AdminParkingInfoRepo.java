package com.xworkz.parkingRentalSystem.repository;

import java.util.List;

import com.xworkz.parkingRentalSystem.entity.AdminParkingInfoEntity;

public interface AdminParkingInfoRepo {

	boolean save(AdminParkingInfoEntity entity);

	AdminParkingInfoEntity entityExists(String location, String vehicleType, String vehicleClassification, String term);

	List<AdminParkingInfoEntity> findByLocation(String location);
}
