package com.xworkz.contactInfo.configuration;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.contactInfo.constants.ContactConstants;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ContactWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	public ContactWebInit() {
		log.info("Creating ContactWebInit using no-arg const");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		log.info("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		log.info("Running getServletConfigClasses");
		return new Class[] { ContactConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		log.info("Running getServletMappings");
		return new String[] { "/" };
	}

	@Override
	protected void customizeRegistration(Dynamic registration) {
		log.info("Running customizeRegistration method");

		int fileSize = ContactConstants.FILE_SIZE;

		MultipartConfigElement configElement = new MultipartConfigElement(ContactConstants.TEMPORARY_FILE_LOCATION,
				fileSize, fileSize * 2, fileSize / 2);
		registration.setMultipartConfig(configElement);
	}

}
