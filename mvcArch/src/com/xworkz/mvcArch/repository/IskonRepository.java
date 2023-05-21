package com.xworkz.mvcArch.repository;

import java.util.Optional;

import com.xworkz.mvcArch.dto.IskonDTO;

public interface IskonRepository {

	boolean save(IskonDTO dto);

	Optional<IskonDTO> findByLocation(String location);

	boolean insertIskon(IskonDTO dto);

	boolean updateByLocation(String location);

	boolean readIskon(IskonDTO dto);

	boolean deleteIskon(IskonDTO dto);
}
