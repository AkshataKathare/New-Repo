package com.xworkz.application.service;

import java.time.LocalDate;
import static com.xworkz.application.util.EducationValidationUtil.*;

import com.xworkz.application.dto.EducationDTO;
import com.xworkz.application.exception.InvalidEducationException;
import com.xworkz.application.repository.EducationRepository;

public class EducationServiceImpl implements EducationService {

	private EducationRepository educationRepository;

	public EducationServiceImpl(EducationRepository educationRepository) {
		this.educationRepository = educationRepository;
	}

	@Override
	public boolean validateAndThenSave(EducationDTO dto) throws InvalidEducationException {
		if (dto != null) {
			System.out.println("dto is not null :" + dto);
			boolean backLog = dto.getBacklog();
			String candidateName = dto.getCandidateName();
			String degreeName = dto.getDegreeName();
			LocalDate startDate = dto.getStartDate();
			LocalDate endDate = dto.getEndDate();
			int id = dto.getId();
			double percentage = dto.getPercentage();
			String stream = dto.getStream();
			String university = dto.getUniversity();

			boolean validBackLog = false;
			boolean validCandidateName = false;
			boolean validDegreeName = false;
			boolean validStartDate = false;
			boolean validEndDate = false;
			boolean validID = false;
			boolean validPercentage = false;
			boolean validStream = false;
			boolean validUniversity = false;

			if (validString(candidateName)) {
				System.out.println("candidateName is valid");
				validCandidateName = true;
			} else {
				System.err.println("candidateName is invalid");
			}
			if (validString(degreeName)) {
				System.out.println("degreeName is valid");
				validDegreeName = true;
			} else {
				System.err.println("degreeName is invalid");
			}
			if (validString(university)) {
				System.out.println("university is valid");
				validUniversity = true;
			} else {
				System.err.println("university is invalid");
			}
			if (validString(stream)) {
				System.out.println("stream is valid");
				validStream = true;
			} else {
				System.err.println("stream is invalid");
			}
			if (id > 0) {
				System.out.println("id is valid");
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
			if (percentage > 0 && percentage < 100) {
				System.out.println("percentage is valid");
				validPercentage = true;
			} else {
				System.err.println("percentage is invalid");
			}
			if (backLog = true) {
				System.out.println("backLog is valid");
				validBackLog = true;
			} else {
				System.err.println("backLog is invalid");
			}
			if (validFlags(validBackLog && validCandidateName && validDegreeName && validEndDate && validID
					&& validPercentage && validStartDate && validStream && validUniversity)) {
				System.out.println("valid dto :" + dto);
				boolean exists = this.educationRepository.isExist(dto);
				if (!exists) {
					boolean saved = this.educationRepository.save(dto);
					System.out.println(saved);
				}

			} else {
				throw new InvalidEducationException("dto is duplicate");
			}

		} else {
			System.err.println("dto is null");
		}
		return false;
	}

	@Override
	public EducationDTO find(EducationDTO dto) {
		return this.educationRepository.find(dto);
	}

	@Override
	public EducationDTO findByCandidateName(String name) {
		if (validString(name)) {
			return this.educationRepository.findByCandidateName(name);
		}
		return null;
	}

	@Override
	public EducationDTO findByCandidateNameAndUniversity(String university, String name) {
		if (validString(university) && validString(university)) {
			return this.educationRepository.findByCandidateNameAndUniversity(university, name);
		}
		return null;
	}

	@Override
	public boolean findBacklogByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university) {
		if (validString(candidateName) && validString(degreeName) && validString(university)) {
			return this.educationRepository.findBacklogByCandidateNameAndDegreeNameAndUniversity(candidateName,
					degreeName, university);
		}
		return false;
	}

	@Override
	public EducationDTO findByCandidateNameAndStartDateAndEndDate(String candidateName, LocalDate startDate,
			LocalDate endDate) {
		if (validString(candidateName) && validDate(startDate) && validDate(endDate)) {
			return this.educationRepository.findByCandidateNameAndStartDateAndEndDate(candidateName, startDate,
					endDate);
		}
		return null;
	}

	@Override
	public double findPercentageByCandidateName(String candidateName) {
		if (validString(candidateName)) {
			return this.educationRepository.findPercentageByCandidateName(candidateName);
		}
		return 0;
	}

	@Override
	public String findStreamByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university) {
		if (validString(candidateName) && validString(university) && validString(degreeName)) {
			return this.educationRepository.findStreamByCandidateNameAndDegreeNameAndUniversity(candidateName,
					degreeName, university);
		}
		return null;
	}

	@Override
	public int findIdByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university) {
		if (validString(candidateName) && validString(university) && validString(degreeName)) {
			return this.educationRepository.findIdByCandidateNameAndDegreeNameAndUniversity(candidateName, degreeName,
					university);
		}
		return 0;
	}

	@Override
	public String findUniversityByCandidateName(String candidateName) {
		if (validString(candidateName)) {
			return this.educationRepository.findUniversityByCandidateName(candidateName);
		}
		return null;
	}

	@Override
	public int total() {
		return this.educationRepository.total();
	}

}
