package com.xworkz.application.repository;

import com.xworkz.application.dto.FestivalDTO;
import com.xworkz.application.exception.FestivalMemoryFullException;

public class FestivalRepositoryImpl implements FestivalRepository {

	private FestivalDTO[] festivalDTOs = new FestivalDTO[3];
	private int festivalIndex = 0;

	@Override
	public boolean save(FestivalDTO dto) {
		if (this.festivalIndex < this.festivalDTOs.length) {
			this.festivalDTOs[festivalIndex] = dto;
			System.out.println("dto is saved at the index :" + festivalIndex + " :" + dto);
			this.festivalIndex++;
			return true;
		} else {
			System.err.println("memory is full and we cannot add the festivals");
			throw new FestivalMemoryFullException("Memory is full and cannot add festivals..");
		}
	}

}
