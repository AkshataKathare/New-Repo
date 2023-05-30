package com.xworkz.mvcArch.util;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public final class JDBCUtil {

	public static final String JDBC_URL = "jdbc:mysql://localhost:3306/jdbc";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "19S10020";

	public Validator validator() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		return validator;
	}

}
