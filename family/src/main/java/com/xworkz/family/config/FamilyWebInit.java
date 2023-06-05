package com.xworkz.family.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FamilyWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	public FamilyWebInit() {
		System.out.println("Creating FamilyWebInit using no arg const");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses method");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses method");
		return new Class[] { FamilyConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings method");
		return new String[] { "/" };
	}

}
