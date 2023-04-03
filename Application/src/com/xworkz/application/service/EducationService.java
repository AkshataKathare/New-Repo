package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.dto.EducationDTO;
import com.xworkz.application.exception.InvalidEducationException;

public interface EducationService {
	boolean validateAndThenSave(EducationDTO dto) throws InvalidEducationException;

	EducationDTO find(EducationDTO dto);

	EducationDTO findByCandidateName(String name);

	EducationDTO findByCandidateNameAndUniversity(String university, String name);

	boolean findBacklogByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university);

	EducationDTO findByCandidateNameAndStartDateAndEndDate(String candidateName, LocalDate startDate,
			LocalDate endDate);

	double findPercentageByCandidateName(String candidateName);

	String findStreamByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university);

	int findIdByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName, String university);

	String findUniversityByCandidateName(String candidateName);

	int total();

}
