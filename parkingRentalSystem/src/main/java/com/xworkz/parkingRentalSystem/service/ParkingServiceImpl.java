package com.xworkz.parkingRentalSystem.service;

import java.time.LocalDateTime;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.parkingRentalSystem.dto.ParkingDTO;
import com.xworkz.parkingRentalSystem.entity.AdminEntity;
import com.xworkz.parkingRentalSystem.repository.ParkingRepo;
import com.xworkz.parkingRentalSystem.util.ParkingEmail;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ParkingServiceImpl implements ParkingService {

	@Autowired
	private ParkingRepo repo;

	public ParkingServiceImpl() {
		log.info("Created ParkingServiceImpl using no-arg const");
	}

	@Override
	public ParkingDTO validate(ParkingDTO dto) {
		log.info("Running validate method in RepoImpl");
		System.out.println(dto.getEmail());

		AdminEntity entity = this.repo.findByMail(dto.getEmail());
		if (entity.getEmail().equals(dto.getEmail())
				&& entity.getPassword().equals(dto.getPassword())) {

			ParkingEmail.sendmail(entity.getEmail(), entity.getName());
			entity.setLoginTime(LocalDateTime.now());
//			this.repo.updateByMail(entity.getEmail(), entity.getLoginTime());

			this.repo.update(entity);

			BeanUtils.copyProperties(entity, dto);
			return dto;

		} else {
			log.info("invalid credential");
		}
		return null;
	}

}
