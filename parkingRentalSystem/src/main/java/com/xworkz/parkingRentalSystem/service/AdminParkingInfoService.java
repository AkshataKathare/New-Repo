package com.xworkz.parkingRentalSystem.service;

import java.util.List;

import com.xworkz.parkingRentalSystem.dto.AdminParkingInfoDTO;

public interface AdminParkingInfoService {

	boolean save(AdminParkingInfoDTO dto);

	List<AdminParkingInfoDTO> findByLocation(String location);
}
