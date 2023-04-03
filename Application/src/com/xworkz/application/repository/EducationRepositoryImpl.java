package com.xworkz.application.repository;

import java.time.LocalDate;

import com.xworkz.application.dto.EducationDTO;
import com.xworkz.application.exception.EducationMemoryFullException;

public class EducationRepositoryImpl implements EducationRepository {

	private EducationDTO[] educationDTOs = new EducationDTO[20];
	private int educationIndex = 0;

	@Override
	public boolean save(EducationDTO dto) {
		if (this.educationIndex < this.educationDTOs.length) {
			this.educationDTOs[educationIndex] = dto;
			System.out.println("dto is saved :" + dto + " at the index :" + educationIndex);
			this.educationIndex++;
			return true;
		} else {
			System.err.println("memory is full and cannot be saved as the length is 20");
			throw new EducationMemoryFullException("Cannot add elements further");
		}
	}

	@Override
	public boolean isExist(EducationDTO dto) {
		if (this.educationIndex == 0) {
			System.out.println("first element will not be compared");
			return false;
		} else {
			System.out.println("comparing from first");
			for (int index = 0; index < this.educationIndex; index++) {
				EducationDTO element = this.educationDTOs[index];
				if (element != null && element.equals(dto)) {
					System.out.println("Cannot be saved as the dto already exists");
					return true;
				}
			}
		}

		return false;
	}

	@Override
	public EducationDTO find(EducationDTO dto) {
		for (int index = 0; index < this.educationDTOs.length; index++) {
			EducationDTO element2 = this.educationDTOs[index];
			if (element2 != null && element2.equals(dto)) {
				System.out.println("dto is same :" + dto);
				return element2;
			}
		}
		return null;
	}

	@Override
	public EducationDTO findByCandidateName(String name) {
		for (int index = 0; index < this.educationDTOs.length; index++) {
			EducationDTO element3 = this.educationDTOs[index];
			if (element3 != null && element3.getCandidateName().equals(name)) {
				System.out.println("dto with this candidateName exists :" + name);
				return element3;
			}
		}
		return null;
	}

	@Override
	public EducationDTO findByCandidateNameAndUniversity(String university, String name) {
		for (int index = 0; index < this.educationDTOs.length; index++) {
			EducationDTO element4 = this.educationDTOs[index];
			if (element4 != null && element4.getUniversity().equals(university)
					&& element4.getCandidateName().equals(name)) {
				System.out.println("dto with this university and candidateName exists :" + university + ", " + name);
				return element4;
			}
		}
		return null;
	}

	@Override
	public boolean findBacklogByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university) {
		for (int index = 0; index < this.educationDTOs.length; index++) {
			EducationDTO element5 = this.educationDTOs[index];
			if (element5 != null && element5.getCandidateName().equals(candidateName)
					&& element5.getDegreeName().equals(degreeName) && element5.getUniversity().equals(university)) {
				System.out.println("dto with this candidateName,degreeName and university exists :" + candidateName
						+ ", " + degreeName + ", " + university);
				boolean backLo = element5.getBacklog();
				return backLo;
			}
		}
		return false;
	}

	@Override
	public EducationDTO findByCandidateNameAndStartDateAndEndDate(String candidateName, LocalDate startDate,
			LocalDate endDate) {
		for (int index = 0; index < this.educationDTOs.length; index++) {
			EducationDTO element6 = this.educationDTOs[index];
			if (element6 != null && element6.getCandidateName().equals(candidateName)
					&& element6.getStartDate().equals(startDate) && element6.getEndDate().equals(endDate)) {
				System.out.println("dto with this candidateName,startDate and endDate exists :" + candidateName + ", "
						+ startDate + ", " + endDate);
				return element6;
			}
		}
		return null;
	}

	@Override
	public double findPercentageByCandidateName(String candidateName) {
		for (int index = 0; index < this.educationDTOs.length; index++) {
			EducationDTO element7 = this.educationDTOs[index];
			if (element7 != null && element7.getCandidateName().equals(candidateName)) {
				System.out.println("dto with this candidateName exists :" + candidateName);
				double percent = element7.getPercentage();
				return percent;
			}
		}
		return 0;
	}

	@Override
	public String findStreamByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university) {
		for (int index = 0; index < this.educationDTOs.length; index++) {
			EducationDTO element8 = this.educationDTOs[index];
			if (element8 != null && element8.getCandidateName().equals(candidateName)
					&& element8.getDegreeName().equals(degreeName) && element8.getUniversity().equals(university)) {
				System.out.println("dto with this candidateName,degreeName and university exists :" + candidateName);
				String stream = element8.getStream();
				return stream;
			}
		}

		return null;
	}

	@Override
	public int findIdByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university) {
		for (int index = 0; index < this.educationDTOs.length; index++) {
			EducationDTO element9 = this.educationDTOs[index];
			if (element9 != null && element9.getCandidateName().equals(candidateName)
					&& element9.getDegreeName().equals(degreeName) && element9.getUniversity().equals(university)) {
				System.out.println("dto with this candidateName exists :" + candidateName);
				int id = element9.getId();
				return id;
			}
		}
		return 0;
	}

	@Override
	public String findUniversityByCandidateName(String candidateName) {
		for (int index = 0; index < this.educationDTOs.length; index++) {
			EducationDTO element10 = this.educationDTOs[index];
			if (element10 != null && element10.getCandidateName().equals(candidateName)) {
				System.out.println("dto with this candidateName exists :" + candidateName);
				String university = element10.getUniversity();
				return university;
			}
		}
		return null;
	}

	@Override
	public int total() {
		return this.educationIndex;
	}

}
