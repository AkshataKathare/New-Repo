package com.xworkz.donation.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DonationWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	public DonationWebInit() {

		System.out.println("Created  " + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		System.out.println("running getServletConfigClasses");
		return new Class[] { DonationConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stubnew
		System.out.println("running getServletMappings");
		return new String[] { "/" };
	}

}
