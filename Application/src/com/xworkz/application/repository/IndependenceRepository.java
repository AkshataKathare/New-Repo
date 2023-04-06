package com.xworkz.application.repository;

import java.time.LocalDate;

import com.xworkz.application.dto.IndependenceDTO;

public interface IndependenceRepository {

	boolean save(IndependenceDTO dto);

	boolean isExist(IndependenceDTO dto);

	IndependenceDTO find(IndependenceDTO dto);

	IndependenceDTO findByMonth(String month);

	String findgotFreedomFromBymainFreedomFighterAndyears(String mainFreedomFighter, int years);

	IndependenceDTO[] findAll();

	IndependenceDTO findBymonthOrgotFreedomFromOrgotIndependenceOn(String month, String gotFreedomFrom,
			LocalDate gotIndependenceOn);

	int getTotal();
}
