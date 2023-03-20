package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.constant.Language;
import com.xworkz.application.constant.OSType;
import com.xworkz.application.constant.Type;
import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.repository.ApplicationRepository;
import com.xworkz.application.repository.ApplicationRepositoryImpl;
import com.xworkz.application.service.ApplicationService;
import com.xworkz.application.service.ApplicationServiceImpl;

public class ApplicationRunner {

	public static void main(String[] args) {

		ApplicationDTO applicationDTO = new ApplicationDTO();
		applicationDTO.setAgeLimit(25);
		applicationDTO.setCreatedDate(LocalDate.of(2006, 5, 17));
		applicationDTO.setCurrentVersionReleaseDate(LocalDate.now());
		applicationDTO.setDevelopedBy("Arun");
		applicationDTO.setFirstVersionReleaseDate(LocalDate.of(2009, 10, 4));
		applicationDTO.setInternetNeeded(true);
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

		ApplicationRepository applicationRepository = new ApplicationRepositoryImpl();

		ApplicationService applicationService = new ApplicationServiceImpl(applicationRepository);
		boolean saved = applicationService.validateAndThenSave(applicationDTO);

		System.out.println("Saved in data store:" + saved);

		System.out.println("    ");

		ApplicationDTO applicationDTO2 = new ApplicationDTO();
		applicationDTO2.setAgeLimit(29);
		applicationDTO2.setCreatedDate(LocalDate.of(2006, 5, 17));
		applicationDTO2.setCurrentVersionReleaseDate(LocalDate.now());
		applicationDTO2.setDevelopedBy("Hasmukh");
		applicationDTO2.setFirstVersionReleaseDate(LocalDate.of(2009, 10, 4));
		applicationDTO2.setInternetNeeded(true);
		applicationDTO2.setLanguageUsed(Language.HINDI);
		applicationDTO2.setMinProcessorSpeed(20);
		applicationDTO2.setMinRamSpaceRequired(30);
		applicationDTO2.setName("Instagram");
		applicationDTO2.setNextVersionReleaseDate(LocalDate.of(2030, 12, 16));
		applicationDTO2.setNoOfDownloads(4);
		applicationDTO2.setOsTypeSupported(OSType.LINUX);
		applicationDTO2.setPrice(90);
		applicationDTO2.setRating(2);
		applicationDTO2.setSize(3);
		applicationDTO2.setTrialDays(15);
		applicationDTO2.setType(Type.SOCIALMEDIA);
		applicationDTO2.setVersion(3.2);

		ApplicationService applicationService1 = new ApplicationServiceImpl(applicationRepository);
		boolean saved2 = applicationService1.validateAndThenSave(applicationDTO2);

		System.out.println("Saved in data store:" + saved2);

	}

}
