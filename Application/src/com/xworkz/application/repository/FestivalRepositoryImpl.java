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

	@Override
	public boolean isExist(FestivalDTO dto) {
		if (festivalIndex == 0) {
			System.out.println("first element in index");
			return false;
		} else {
			System.out.println("comparing from first element onwards");
			for (int index = 0; index < this.festivalIndex; index++) {
				FestivalDTO tempDTO = this.festivalDTOs[index];
				if (tempDTO.equals(dto)) {
					System.out.println("dto cannot be saved as it is duplicate");
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public int getTotal() {
		return this.festivalIndex;
	}

}
