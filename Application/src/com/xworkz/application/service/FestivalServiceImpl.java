package com.xworkz.application.service;

import java.time.LocalDate;
import static com.xworkz.application.util.FestivalValidationUtil.*;
import com.xworkz.application.dto.FestivalDTO;
import com.xworkz.application.exception.InvalidFestivalException;
import com.xworkz.application.repository.FestivalRepository;

public class FestivalServiceImpl implements FestivalService {

	private FestivalRepository festivalRepository;

	public FestivalServiceImpl(FestivalRepository festivalRepository) {
		this.festivalRepository = festivalRepository;
	}

	@Override
	public boolean validateAndThenSave(FestivalDTO dto) throws InvalidFestivalException {
		if (dto != null) {
			System.out.println("dto is not null " + dto);
			double id = dto.getId();
			String name = dto.getName();
			String godName = dto.getGodName();
			LocalDate startDate = dto.getStartDate();
			LocalDate endDate = dto.getEndDate();
			String sweet = dto.getSweet();

			boolean validID = false;
			boolean validName = false;
			boolean validGodName = false;
			boolean validStartDate = false;
			boolean validEndDate = false;
			boolean validSweet = false;

			if (validString(name)) {
				System.out.println("name is valid");
				validName = true;
			} else {
				System.err.println("name is invalid");
			}
			if (validString(godName)) {
				System.out.println("godName is valid");
				validGodName = true;
			} else {
				System.err.println("godName is invalid");
			}
			if (validString(sweet)) {
				System.out.println("sweet is valid");
				validSweet = true;
			} else {
				System.err.println("sweet is invalid");
			}
			if (validNumber(id)) {
				System.out.println("id id valid");
				validID = true;
			} else {
				System.err.println("id is invalid");
			}
			if (validDate(startDate)) {
				System.out.println("startDate is valid");
				validStartDate = true;
			} else {
				System.err.println("startDate is invalid");
			}
			if (validDate(endDate) && endDate.isAfter(startDate)) {
				System.out.println("endDate is valid");
				validEndDate = true;
			} else {
				System.err.println("endDate is invalid");
			}
			if (validFlag(validEndDate && validGodName && validID && validName && validStartDate && validSweet)) {
				System.out.println("dto is valid and can be saved");
				boolean saved = this.festivalRepository.save(dto);
				return saved;
			} else {
				throw new InvalidFestivalException("data is invalid");
			}
		} else {
			System.err.println("dto is null");
		}
		return false;
	}

}
