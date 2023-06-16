package com.xworkz.contactInfo.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.contactInfo.entity.ContactInfoEntity;

public interface ContactRepository {

	boolean save(ContactInfoEntity entity);

	default List<ContactInfoEntity> findByName(String name) {
		return Collections.emptyList();
	}

}
