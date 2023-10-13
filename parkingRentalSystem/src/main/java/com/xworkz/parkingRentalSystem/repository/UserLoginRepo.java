package com.xworkz.parkingRentalSystem.repository;

import com.xworkz.parkingRentalSystem.entity.UserSignUpInfoEntity;

public interface UserLoginRepo {
 
	UserSignUpInfoEntity updateOTP(UserSignUpInfoEntity entity);

	UserSignUpInfoEntity findByEmail(String userEmail);
	
	UserSignUpInfoEntity findByOTP(int otp);
}