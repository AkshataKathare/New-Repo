package com.xworkz.reevaluation.configuration;

import javax.servlet.MultipartConfigElement;

import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.reevaluation.constants.ApplicationConstant;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReEvalWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		log.info("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		log.info("Running getServletConfigClasses");
		return new Class[] { ReEvaluationConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		log.info("Running getServletMappings");
		return new String[] { "/" };
	}

	@Override
	protected void customizeRegistration(Dynamic registration) {
		int maxSize = ApplicationConstant.MAX_FILE_SIZE;
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(
				ApplicationConstant.TEMP_FILE_LOCATION, maxSize, maxSize * 2, maxSize / 2);

		registration.setMultipartConfig(multipartConfigElement);
	}
}