package com.xworkz.application.repository;

import com.xworkz.application.dto.HeadPhoneDTO;

public class HeadPhoneRepositoryImpl implements HeadPhoneRepository {

	private HeadPhoneDTO[] headPhoneDTOs = new HeadPhoneDTO[2];
	private int headPhoneIndex = 0;

	@Override
	public boolean save(HeadPhoneDTO dto) {
		if (this.headPhoneIndex < headPhoneDTOs.length) {
			this.headPhoneDTOs[headPhoneIndex] = dto;
			System.out.println("dto is saved at dto :" + this.headPhoneIndex + "" + dto);
			this.headPhoneIndex++;
			return true;
		} else {
			System.err.println("memory is full and cant store the element");
		}

		return false;
	}

}
