package com.xworkz.dl.configuration;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.dl.constant.DLConstants;

public class DrivingLicenseWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses");
		return new Class[] { DriveLicenseConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings");
		return new String[] { "/" };
	}

	@Override
	protected void customizeRegistration(Dynamic registration) {
		System.out.println("Running customizeRegistration method");

		int fileSize = DLConstants.FILE_SIZE;

		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(DLConstants.LOCATION_OF_TEMP_FILES,
				fileSize, fileSize * 2, fileSize / 2);

		registration.setMultipartConfig(multipartConfigElement);
	}

}
