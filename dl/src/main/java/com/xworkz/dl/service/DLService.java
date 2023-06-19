package com.xworkz.dl.service;

import java.util.List;

import com.xworkz.dl.dto.DrivingLicenseDTO;

public interface DLService {

	boolean validateAndSave(DrivingLicenseDTO dto);

	List<DrivingLicenseDTO> findByName(String fullName);
}
