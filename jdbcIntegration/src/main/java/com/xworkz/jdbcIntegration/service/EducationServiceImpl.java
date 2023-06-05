package com.xworkz.jdbcIntegration.service;

import java.sql.SQLException;

import com.xworkz.jdbcIntegration.dto.EducationDTO;
import com.xworkz.jdbcIntegration.repository.EducationRepo;
import com.xworkz.jdbcIntegration.util.ValidationUtil;

public class EducationServiceImpl implements EducationService {

	private EducationRepo educationRepo;

	public EducationServiceImpl(EducationRepo educationRepo) {
		System.out.println("Creating Education Service using const");
		this.educationRepo = educationRepo;
	}

	@Override
	public boolean validateAndThenSave(EducationDTO dto) throws ClassNotFoundException, SQLException {
		System.out.println("Running validateAndThenSave method " + dto);
		if (dto != null) {
			System.out.println("dto is not null");

			if (ValidationUtil.valid(dto)) {
				System.out.println("No violations and hence will be saved");
				return this.educationRepo.save(dto);
			}
		} else {
			System.err.println("dto is null");
		}

		return false;
	}

}
