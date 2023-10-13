package com.xworkz.parkingRentalSystem.service;

import com.xworkz.parkingRentalSystem.dto.UserSignUpInfoDTO;

public interface UserSignUpInfoService {

	boolean save(UserSignUpInfoDTO dto);

	UserSignUpInfoDTO findByEmail(String email);

}
