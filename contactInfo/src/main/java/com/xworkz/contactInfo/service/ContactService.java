package com.xworkz.contactInfo.service;

import java.util.Collections;
import java.util.List;

import com.xworkz.contactInfo.dto.ContactDTO;

public interface ContactService {

	boolean validateAndThenSave(ContactDTO dto);

	default List<ContactDTO> findByName(String name) {
		return Collections.emptyList();
	}

}
