package com.xworkz.mvcArch.service;

import java.util.Optional;

import com.xworkz.mvcArch.dto.IskonDTO;

public interface IskonService {

	boolean validateAndThenSave(IskonDTO dto);

	Optional<IskonDTO> findByLocation(String location);

}