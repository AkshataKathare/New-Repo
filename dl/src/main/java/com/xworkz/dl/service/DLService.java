package com.xworkz.dl.service;

import com.xworkz.dl.dto.DrivingLicenseDTO;

public interface DLService {
	
	boolean validateAndSave(DrivingLicenseDTO dto);

}
