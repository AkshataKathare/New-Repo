package com.xworkz.application.repository;

import com.xworkz.application.dto.SoftwareDTO;

public interface SoftwareRepository {

	boolean save(SoftwareDTO dto);

	boolean isExist(SoftwareDTO dto);

	int totalSaved();

	default SoftwareDTO findById(int id) {
		return null;
	}

	default SoftwareDTO findByName(String name) {
		return null;
	}

	default SoftwareDTO findByNameAndId(String name, int id) {
		return null;
	}
}
