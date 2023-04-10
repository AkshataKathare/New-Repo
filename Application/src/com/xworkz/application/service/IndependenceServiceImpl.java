package com.xworkz.application.service;

import java.time.LocalDate;
import static com.xworkz.application.util.ValidationUtil.*;

import com.xworkz.application.dto.IndependenceDTO;
import com.xworkz.application.exception.InvalidIndependenceException;
import com.xworkz.application.repository.IndependenceRepository;

public class IndependenceServiceImpl implements IndependenceService {

	private IndependenceRepository independenceRepository;

	public IndependenceServiceImpl(IndependenceRepository independenceRepository) {
		super();
		this.independenceRepository = independenceRepository;
	}

	@Override
	public boolean validatAndThenSave(IndependenceDTO dto) throws InvalidIndependenceException {
		if (dto != null) {
			System.out.println("dto is not null");
			String gotFreeFrom = dto.getGotFreeFrom();
			LocalDate indepDate = dto.getGotIndependenceOn();
			String freedomFighter = dto.getMainFreedomFighter();
			String month = dto.getMonth();
			int years = dto.getYears();

			boolean validFreeFrom = false;
			boolean validIndepDate = false;
			boolean validFreedomFighter = false;
			boolean validMonth = false;
			boolean validYears = false;

			if (validString(month)) {
				System.out.println("valid month");
				validMonth = true;
			} else {
				System.err.println("invalid month");
			}
			if (validString(freedomFighter)) {
				System.out.println("valid freedomFighter");
				validFreedomFighter = true;
			} else {
				System.err.println("invalid freedomFighter");
			}
			if (validString(gotFreeFrom)) {
				System.out.println("valid gotFreeFrom");
				validFreeFrom = true;
			} else {
				System.err.println("invalid gotFreeFrom");
			}
			if (validNumber(years)) {
				System.out.println("valid years");
				validYears = true;
			} else {
				System.err.println("invalid years");
			}
			if (validDate(indepDate, LocalDate.of(1940, 3, 15))) {
				System.out.println("indepDate is valid");
				validIndepDate = true;
			} else {
				System.err.println("indepDate is invalid");
			}
			if (validFlag(validFreedomFighter && validFreeFrom && validIndepDate && validMonth && validYears)) {
				System.out.println("dto is valid");
				boolean exists = this.independenceRepository.isExist(dto);
				if (!exists) {
					boolean saved = this.independenceRepository.save(dto);
					System.out.println("DTO is saved :" + saved);
					return true;
				}
			} else {
				System.err.println("dto is invalid");
				throw new InvalidIndependenceException("data in dto is invalid");
			}

		} else {
			System.err.println("dto is null");
		}
		return false;
	}

	@Override
	public IndependenceDTO find(IndependenceDTO dto) {
		return this.independenceRepository.find(dto);
	}

	@Override
	public IndependenceDTO findByMonth(String month) {
		if (validString(month)) {
			return this.independenceRepository.findByMonth(month);
		}
		return null;
	}

	@Override
	public String findgotFreedomFromBymainFreedomFighterAndyears(String mainFreedomFighter, int years) {
		if (validString(mainFreedomFighter) && validNumber(years)) {
			return this.independenceRepository.findgotFreedomFromBymainFreedomFighterAndyears(mainFreedomFighter,
					years);
		}
		return null;
	}

	@Override
	public IndependenceDTO[] findAll() {
		IndependenceDTO[] ownDTO = new IndependenceDTO[3];
		IndependenceDTO[] repoDTO = this.independenceRepository.findAll();
		int i = 0;
		if (i < repoDTO.length) {

			for (int j = 0; j < repoDTO.length; j++) {
				if (repoDTO[j] != null) {
					ownDTO[i] = repoDTO[j];
					System.out.println(ownDTO[i]);
					i++;
				}
			}
		}
		return ownDTO;
	}

	@Override
	public IndependenceDTO findBymonthOrgotFreedomFromOrgotIndependenceOn(String month, String gotFreedomFrom,
			LocalDate gotIndependenceOn) {
		if (validString(gotFreedomFrom) && validString(month)
				&& validDate(gotIndependenceOn, LocalDate.of(1940, 3, 15))) {
			return this.independenceRepository.findBymonthOrgotFreedomFromOrgotIndependenceOn(month, gotFreedomFrom,
					gotIndependenceOn);
		}
		return null;
	}

	@Override
	public int total() {
		return this.independenceRepository.getTotal();
	}

}
