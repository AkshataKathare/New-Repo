package com.xworkz.mvcArch.service;

import com.xworkz.mvcArch.dto.IskonDTO;

public interface IskonService {

	boolean validateAndThenSave(IskonDTO dto);

	IskonDTO findByLocation(String location);

	boolean insertIskon(IskonDTO dto);

	boolean updateByLocation(String location);

	boolean readIskon(IskonDTO dto);

}