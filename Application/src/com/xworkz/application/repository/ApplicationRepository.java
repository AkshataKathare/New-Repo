package com.xworkz.application.repository;

import com.xworkz.application.dto.ApplicationDTO;

public interface ApplicationRepository {

	boolean save(ApplicationDTO dto);

}
