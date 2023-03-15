package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.constant.Language;
import com.xworkz.application.constant.OSType;
import com.xworkz.application.constant.Type;
import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.impl.ApplicationServiceImpl;
import com.xworkz.application.service.ApplicationService;

public class ApplicationRunner {

	public static void main(String[] args) {

		ApplicationDTO applicationDTO = new ApplicationDTO();
		applicationDTO.setAgeLimit(25);
		applicationDTO.setCreatedDate(LocalDate.of(2006, 5, 17));
		applicationDTO.setCurrentVersionReleaseDate(LocalDate.now());
		applicationDTO.setDevelopedBy("Arun");
		applicationDTO.setFirstVersionReleaseDate(LocalDate.of(2009, 10, 4));
		applicationDTO.setInternetNeeded(false);
		applicationDTO.setLanguageUsed(Language.ENGLISH);
		applicationDTO.setMinProcessorSpeed(20);
		applicationDTO.setMinRamSpaceRequired(30);
		applicationDTO.setName("Instagram");
		applicationDTO.setNextVersionReleaseDate(LocalDate.of(2030, 12, 16));
		applicationDTO.setNoOfDownloads(4);
		applicationDTO.setOsTypeSupported(OSType.ANDROID);
		applicationDTO.setPrice(90);
		applicationDTO.setRating(2);
		applicationDTO.setSize(3);
		applicationDTO.setTrialDays(15);
		applicationDTO.setType(Type.SOCIALMEDIA);
		applicationDTO.setVersion(3.2);

		ApplicationService applicationService = new ApplicationServiceImpl();
		boolean saved=applicationService.validateAndThenSave(applicationDTO);
		System.out.println("Saved in data store:"+saved);

	}

}
