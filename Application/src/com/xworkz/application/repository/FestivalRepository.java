package com.xworkz.application.repository;

import com.xworkz.application.dto.FestivalDTO;

public interface FestivalRepository {

	boolean save(FestivalDTO dto);

	default boolean isExist(FestivalDTO dto) {
		return false;
	}

	default int getTotal() {
		return 0;
	}

}
