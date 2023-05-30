package com.xworkz.mvcArch.repository;

import com.xworkz.mvcArch.dto.IskonDTO;

public interface IskonRepository {

	boolean save(IskonDTO dto);

	boolean findByLocation(String location);

	boolean updateByLocation(String location);

	boolean deleteIskon(String location);
}
