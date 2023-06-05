package com.xworkz.jdbcIntegration.repository;

import java.sql.SQLException;

import com.xworkz.jdbcIntegration.dto.EducationDTO;

public interface EducationRepo {

	boolean save(EducationDTO dto) throws SQLException, ClassNotFoundException;

//	boolean update(EducationDTO dto) throws ClassNotFoundException, SQLException;
}
