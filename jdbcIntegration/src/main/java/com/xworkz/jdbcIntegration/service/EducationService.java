package com.xworkz.jdbcIntegration.service;

import java.sql.SQLException;

import com.xworkz.jdbcIntegration.dto.EducationDTO;

public interface EducationService {

	boolean validateAndThenSave(EducationDTO dto) throws ClassNotFoundException, SQLException;
}
