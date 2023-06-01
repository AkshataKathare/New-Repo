package com.xworkz.save.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ListWebInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses method");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses method");
		return new Class[] { ListConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getRootConfigClasses method");
		return new String[] { "/" };
	}

}
