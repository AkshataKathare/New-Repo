package com.xworkz.parkingRentalSystem.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.parkingRentalSystem.dto.AdminParkingInfoDTO;
import com.xworkz.parkingRentalSystem.dto.UserParkingInfoDTO;
import com.xworkz.parkingRentalSystem.entity.AdminParkingInfoEntity;
import com.xworkz.parkingRentalSystem.entity.UserParkingInfoEntity;
import com.xworkz.parkingRentalSystem.entity.UserSignUpInfoEntity;
import com.xworkz.parkingRentalSystem.repository.UserParkingInfoRepo;
import com.xworkz.parkingRentalSystem.repository.UserSignUpInfoRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserParkingInfoServiceImpl implements UserParkingInfoService {

	@Autowired
	private UserParkingInfoRepo repo;

	@Autowired
	private UserSignUpInfoRepo infoRepo;

//	@Autowired
//	private AdminParkingInfoRepo infoRepo;

	public UserParkingInfoServiceImpl() {
		log.info("Created UserParkingInfoServiceImpl using no-arg const");
	}

	@Override
	public boolean saveInfo(UserParkingInfoDTO dto, String email) {
		log.info("Running saveInfo method in UserParkingInfoServiceImpl");
		UserParkingInfoEntity entity = new UserParkingInfoEntity();

		BeanUtils.copyProperties(dto, entity);
		UserSignUpInfoEntity entity2 = this.infoRepo.findByEmail(email);
		entity.setUserId_fk(entity2.getUserId());
		return this.repo.saveInfo(entity);

	}

	@Override
	public AdminParkingInfoDTO find(String location, String vehicleType, String vehicleClassification, String term) {
		log.info("Running find method in UserParkingInfoServiceImpl");
		AdminParkingInfoEntity infoEntity = this.repo.findByParameters(location, vehicleType, vehicleClassification,
				term);
		System.out.println("infoEntity : " + infoEntity);
		if (location.equals(infoEntity.getLocation()) && vehicleType.equals(infoEntity.getVehicleType())
				&& vehicleClassification.equals(infoEntity.getVehicleClassification())
				&& term.equals(infoEntity.getTerm())) {
			log.info("Entity :" + infoEntity);
			AdminParkingInfoDTO dto = new AdminParkingInfoDTO();

			BeanUtils.copyProperties(infoEntity, dto);
			return dto;
		}
		return null;
	}

}
