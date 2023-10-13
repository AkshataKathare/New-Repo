package com.xworkz.parkingRentalSystem.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.parkingRentalSystem.dto.UserSignUpInfoDTO;
import com.xworkz.parkingRentalSystem.entity.UserSignUpInfoEntity;
import com.xworkz.parkingRentalSystem.repository.UserSignUpInfoRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserSignUpInfoServiceImpl implements UserSignUpInfoService {

	@Autowired
	private UserSignUpInfoRepo repository;

	public UserSignUpInfoServiceImpl() {
		log.info("Created UserSignUpInfoServiceImpl using no-arg const");
	}

	@Override
	public boolean save(UserSignUpInfoDTO dto) {
		log.info("Running save method in UserSignUpInfoServiceImpl");
		UserSignUpInfoEntity entity = new UserSignUpInfoEntity();
		BeanUtils.copyProperties(dto, entity);
		return this.repository.save(entity);
	}

	@Override
	public UserSignUpInfoDTO findByEmail(String email) {
		log.info("Running findByEmail method in UserParkingInfoServiceImpl");
		UserSignUpInfoEntity entity = this.repository.findByEmail(email);
		if (entity != null) {
			UserSignUpInfoDTO dto = new UserSignUpInfoDTO();
			BeanUtils.copyProperties(entity, dto);
			return dto;
		}
		return null;
	}

}