package com.xworkz.parkingRentalSystem.repository;

import java.time.LocalDateTime;

import com.xworkz.parkingRentalSystem.entity.AdminEntity;

public interface ParkingRepo {

	AdminEntity findByMail(String mail);

//	boolean updateByMail(String email, LocalDateTime loginTime);

	boolean update(AdminEntity entity);
}
