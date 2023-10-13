package com.xworkz.parkingRentalSystem.service;

public interface UserLoginService {

	boolean updateOTP(String userEmail);

	boolean sendUserLogin(int otp);

}