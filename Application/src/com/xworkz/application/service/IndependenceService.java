package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.dto.IndependenceDTO;
import com.xworkz.application.exception.InvalidIndependenceException;

public interface IndependenceService {

	boolean validatAndThenSave(IndependenceDTO dto) throws InvalidIndependenceException;

	IndependenceDTO find(IndependenceDTO dto);

	IndependenceDTO findByMonth(String month);

	String findgotFreedomFromBymainFreedomFighterAndyears(String mainFreedomFighter, int years);

	IndependenceDTO[] findAll();

	IndependenceDTO findBymonthOrgotFreedomFromOrgotIndependenceOn(String month, String gotFreedomFrom,
			LocalDate gotIndependenceOn);

	int total();

}
