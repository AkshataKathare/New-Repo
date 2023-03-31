package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.constant.Language;
import com.xworkz.application.constant.OSType;
import com.xworkz.application.constant.Type;
import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.repository.ApplicationRepository;

public class ApplicationServiceImpl implements ApplicationService {

	private ApplicationRepository applicationRepository;

	public ApplicationServiceImpl(ApplicationRepository applicationRepository) {
		this.applicationRepository = applicationRepository;
	}

	@Override
	public boolean validateAndThenSave(ApplicationDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null and can be validated");
			String name = dto.getName();
			double version = dto.getVersion();
			LocalDate createdDate = dto.getCreatedDate();
			double size = dto.getSize();
			String developedBy = dto.getDevelopedBy();
			Type type = dto.getType();
			double price = dto.getPrice();
			LocalDate firstVersionReleaseDate = dto.getFirstVersionReleaseDate();
			LocalDate currentVersionReleaseDate = dto.getCurrentVersionReleaseDate();
			LocalDate nextVersionReleaseDate = dto.getNextVersionReleaseDate();
			int trailDays = dto.getTrialDays();
			Language languageUsed = dto.getLanguageUsed();
			float minProcessorSpeed = dto.getMinProcessorSpeed();
			float minRamSpace = dto.getMinRamSpaceRequired();
			boolean internetNeeded = dto.isInternetNeeded();
			int ageLimit = dto.getAgeLimit();
			int noOfDownloads = dto.getNoOfDownloads();
			int rating = dto.getRating();
			OSType osType = dto.getOsTypeSupported();

			boolean validName = false;
			boolean validVersion = false;
			boolean validCreatedDate = false;
			boolean validSize = false;
			boolean validDevelopedBy = false;
			boolean validType = false;
			boolean validPrice = false;
			boolean validFirstVersion = false;
			boolean validCurrentVersion = false;
			boolean validNextVersion = false;
			boolean validTrialDays = false;
			boolean validLangUsed = false;
			boolean validMinProcessorSpeed = false;
			boolean validMinRamSpace = false;
			boolean validInternetNeeded = false;
			boolean validAgeLimit = false;
			boolean validDownloads = false;
			boolean validRating = false;
			boolean validOSType = false;

			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 30) {
				System.out.println("name is valid");
				validName = true;
			} else {
				System.err.println("name is invalid");
			}
			if (version > 0 && version < 100) {
				System.out.println("version is valid");
				validVersion = true;
			} else {
				System.err.println("version is invalid");
			}
			LocalDate today = LocalDate.now().plusDays(1);
			LocalDate year = LocalDate.of(2001, 1, 1);
			if (createdDate != null && createdDate.isBefore(today) && createdDate.isAfter(year)) {
				System.out.println("createdDate is valid");
				validCreatedDate = true;
			} else {
				System.err.println("createdDate is invalid");
			}
			if (size > 0 && size < 5) {
				System.out.println("size is valid");
				validSize = true;
			} else {
				System.err.println("size is invalid");
			}
			if (developedBy != null && !developedBy.isEmpty() && developedBy.length() > 3 && developedBy.length() < 30)
				if (type != null) {
					System.out.println("type is valid");
					validType = true;
				} else {
					System.err.println("type is invalid");
				}
			if (price > 0 && price < 100) {
				System.out.println("price is valid");
				validPrice = true;
			} else {
				System.err.println("price is invalid");
			}
			LocalDate startDate = LocalDate.of(2003, 2, 1);
			if (firstVersionReleaseDate != null && firstVersionReleaseDate.isAfter(startDate)) {
				System.out.println("firstVersionReleaseDate is valid");
				validFirstVersion = true;
			} else {
				System.err.println("firstVersionReleaseDate is invalid");
			}

			if (currentVersionReleaseDate != null && currentVersionReleaseDate.isBefore(today)) {
				System.out.println("currentVersionReleaseDate is valid");
				validCurrentVersion = true;
			} else {
				System.err.println("currentVersionReleaseDate is invalid");
			}
			if (nextVersionReleaseDate != null && nextVersionReleaseDate.isAfter(today)) {
				System.out.println("nextVersionReleaseDate is valid");
				validNextVersion = true;
			} else {
				System.err.println("nextVersionReleaseDate is invalid");
			}
			if (trailDays > 0 && trailDays < 100) {
				System.out.println("trailDays is valid");
				validTrialDays = true;
			} else {
				System.err.println("trailDays is invalid");
			}
			if (languageUsed != null) {
				System.out.println("languageUsed is valid");
				validLangUsed = true;
			} else {
				System.err.println("languageUsed is invalid");
			}
			if (minProcessorSpeed > 0 && minProcessorSpeed < 100) {
				System.out.println("minProcessorSpeed is valid");
				validMinProcessorSpeed = true;
			} else {
				System.err.println("minProcessorSpeed is invalid");
			}
			if (minRamSpace > 0 && minRamSpace < 100) {
				System.out.println("minRamSpace is valid");
				validMinRamSpace = true;
			} else {
				System.err.println("minRamSpace is invalid");
			}
			if (internetNeeded == true) {
				System.out.println("internetNeeded is valid");
				validInternetNeeded = true;
			} else {
				System.err.println("internetNeeded is invalid");
			}
			if (ageLimit > 0 && ageLimit < 100) {
				System.out.println("ageLimit is valid");
				validAgeLimit = true;
			} else {
				System.err.println("ageLimit is invalid");
			}
			if (noOfDownloads > 0 && noOfDownloads < 100) {
				System.out.println("noOfDownloads is valid");
				validDownloads = true;
			} else {
				System.err.println("noOfDownloads is invalid");
			}
			if (rating > 0 && rating < 4) {
				System.out.println("rating is valid");
				validRating = true;
			} else {
				System.err.println("rating is invalid");
			}
			if (osType != null) {
				System.out.println("osType is valid");
				validOSType = true;
			} else {
				System.err.println("osType is invalid");
			}
			if (validAgeLimit && validCreatedDate && validCurrentVersion && validDownloads && validFirstVersion
					&& validInternetNeeded && validLangUsed && validMinProcessorSpeed && validMinRamSpace && validName
					&& validNextVersion && validOSType && validPrice && validRating && validSize && validTrialDays
					&& validType && validVersion && validDevelopedBy) {

				boolean saved = this.applicationRepository.save(dto);
				return saved;
			}

			return false;

		}

		else {
			System.out.println("dto is null and cannot be continued");
		}
		return false;
	}

}
