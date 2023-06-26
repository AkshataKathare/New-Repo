package com.xworkz.parkingRentalSystem.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.parkingRentalSystem.dto.AdminParkingInfoDTO;
import com.xworkz.parkingRentalSystem.entity.AdminParkingInfoEntity;
import com.xworkz.parkingRentalSystem.repository.AdminParkingInfoRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AdminParkingInfoServiceImpl implements AdminParkingInfoService {

	@Autowired
	private AdminParkingInfoRepo repo;

	public AdminParkingInfoServiceImpl() {
		log.info("Created AdminParkingInfoServiceImpl using no-arg const");
	}

	@Override
	public boolean save(AdminParkingInfoDTO dto) {
		log.info("Running save method in AdminParkingInfoServiceImpl");
		AdminParkingInfoEntity record = this.repo.entityExists(dto.getLocation(), dto.getVehicleType(),
				dto.getVehicleClassification(), dto.getTerm());
		if (record != null) {
			log.info("Data already exists");
			return false;
		} else {
			log.info("data not found, saving new record");
			AdminParkingInfoEntity entity = new AdminParkingInfoEntity();
			BeanUtils.copyProperties(dto, entity);
			return this.repo.save(entity);
		}
	}

	@Override
	public List<AdminParkingInfoDTO> findByLocation(String location) {
		log.info("Running findByLocation method in AdminParkingInfoServiceImpl");
		List<AdminParkingInfoDTO> dtos = this.repo.findByLocation(location).stream().map(ent -> {
			AdminParkingInfoDTO dto = new AdminParkingInfoDTO();
			BeanUtils.copyProperties(ent, dto);
			return dto;
		}).collect(Collectors.toList());
		return dtos;
	}
}
