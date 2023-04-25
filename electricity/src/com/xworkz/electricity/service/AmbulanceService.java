package com.xworkz.electricity.service;

import com.xworkz.electricity.dto.AmbulanceDTO;

public interface AmbulanceService {

	boolean validateAndThenSave(AmbulanceDTO dto);
}
