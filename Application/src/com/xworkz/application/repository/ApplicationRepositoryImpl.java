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

	@Override
	public boolean isExist(ApplicationDTO dto) {
		if (applicationIndex == 0) {
			System.out.println("first index element and will not compare");
		} else {
			System.out.println("comparing first element onwards");
			for (int index = 0; index < this.applicationIndex; index++) {
				ApplicationDTO tempDTO = this.applicationDTOs[index];
				if (tempDTO.equals(dto)) {
					System.out.println("dto can be saved as it is not a duplicate of any dto :" + tempDTO);
					return true;
				} else {

					return false;
				}
			}
		}
		return ApplicationRepository.super.isExist(dto);
	}

}
