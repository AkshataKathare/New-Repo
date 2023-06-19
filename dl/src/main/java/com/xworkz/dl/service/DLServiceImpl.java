package com.xworkz.dl.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.dl.dto.DrivingLicenseDTO;
import com.xworkz.dl.entity.DlEntity;
import com.xworkz.dl.repository.DLRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DLServiceImpl implements DLService {

	@Autowired
	private DLRepository dlRepository;

	public DLServiceImpl() {
		log.info("Created " + this.getClass().getSimpleName());
// resources
	}

	@Override
	public boolean validateAndSave(DrivingLicenseDTO dto) {
		log.info("executing ValidateAndSave " + dto);

		DlEntity dlEntity = new DlEntity();
		// property name should be same in both ref
		BeanUtils.copyProperties(dto, dlEntity);
		boolean saved = dlRepository.save(dlEntity);
		log.info("Entity after copy.." + dlEntity);
		return saved;
	}

	@Override
	public List<DrivingLicenseDTO> findByName(String fullName) {
		log.info("Running findByName method in DLService");
		List<DlEntity> entities = this.dlRepository.findByName(fullName);

		List<DrivingLicenseDTO> dtos = entities.stream().map(ent -> {
			DrivingLicenseDTO dto = new DrivingLicenseDTO();
			BeanUtils.copyProperties(ent, dto);
			return dto;
		}).collect(Collectors.toList());

		return dtos;
	}

}
