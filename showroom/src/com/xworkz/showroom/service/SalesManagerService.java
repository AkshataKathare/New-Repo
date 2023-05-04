package com.xworkz.showroom.service;

import com.xworkz.showroom.dto.SalesManagerDTO;

public interface SalesManagerService {

	boolean validateAndThenSave(SalesManagerDTO dto);
}
