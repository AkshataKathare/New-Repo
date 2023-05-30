package com.xworkz.mvcArch.service;

import com.xworkz.mvcArch.dto.IskonDTO;

public interface IskonService {

	boolean validateAndThenSave(IskonDTO dto);

	boolean findByLocation(String location);

	boolean updateByLocation(String location);

	boolean deleteIskon(String location);

}