package com.xworkz.dl.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.dl.entity.DlEntity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class DLRepositoryImpl implements DLRepository {

	@Override
	public boolean save(DlEntity dlEntity) {
		log.info("running save in repo" + dlEntity);

		return true;
	}

}
