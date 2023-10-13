package com.xworkz.parkingRentalSystem.service;

import java.time.Instant;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.parkingRentalSystem.entity.UserSignUpInfoEntity;
import com.xworkz.parkingRentalSystem.repository.UserLoginRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserLoginServiceImpl implements UserLoginService {

	@Autowired
	private UserLoginRepo loginRepo;

	@Override
	public boolean updateOTP(String userEmail) {
		log.info("Running findByMail method in UserLoginServiceImpl");
		UserSignUpInfoEntity entity = this.loginRepo.findByEmail(userEmail);
		if (entity != null) {
			Random random = new Random();
			entity.setOtp(random.nextInt(9999));
			entity.setOtpRequestedTime(Date.from(Instant.now()));
			this.loginRepo.updateOTP(entity);
			return true;
		}
		return false;
	}

	@Override
	public boolean sendUserLogin(int otp) {
		log.info("Running sendUserLogin method in UserLoginServiceImpl");
		UserSignUpInfoEntity entity = this.loginRepo.findByOTP(otp);
		if (entity!=null) {
			log.info("OTP is not expired");
			boolean notExpired = entity.isOTPRequired();

			if (notExpired) {
				log.info("OTP is correct");
				return true;
			}
		} else {
			log.info("OTP is expired");
		}
		return false;
	}

}