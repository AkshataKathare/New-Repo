package com.xworkz.application.repository;

import com.xworkz.application.dto.ApplicationDTO;

public class ApplicationRepositoryImpl implements ApplicationRepository {

	private ApplicationDTO[] applicationDTOs = new ApplicationDTO[3];
	private int applicationIndex = 0;

	@Override
	public boolean save(ApplicationDTO dto) {
		if (applicationIndex < applicationDTOs.length) {
			System.out.println("dto saved at index :" + applicationIndex + " " + dto);
			this.applicationDTOs[applicationIndex] = dto;
			this.applicationIndex++;
			return true;
		} else {
			System.err.println("memory is full,elements cannot be stored further");
		}
		return false;
	}

}
