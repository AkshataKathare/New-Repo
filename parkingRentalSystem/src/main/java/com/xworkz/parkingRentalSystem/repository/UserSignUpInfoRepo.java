package com.xworkz.parkingRentalSystem.repository;

import com.xworkz.parkingRentalSystem.entity.UserSignUpInfoEntity;

public interface UserSignUpInfoRepo {

	boolean save(UserSignUpInfoEntity entity);

	UserSignUpInfoEntity findByEmail(String email);
}
