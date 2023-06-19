package com.xworkz.dl.repository;

import java.util.List;

import com.xworkz.dl.entity.DlEntity;

public interface DLRepository {

	boolean save(DlEntity dlEntity);

	List<DlEntity> findByName(String fullName);
}
