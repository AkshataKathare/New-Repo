package com.xworkz.contactInfo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.contactInfo.dto.ContactDTO;
import com.xworkz.contactInfo.entity.ContactInfoEntity;
import com.xworkz.contactInfo.repository.ContactRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository repository;

	@Override
	public boolean validateAndThenSave(ContactDTO dto) {
		log.info("Running validateAndSave method in ServiceImpl " + dto);

		ContactInfoEntity entity = new ContactInfoEntity();
		BeanUtils.copyProperties(dto, entity);

		log.info("Entity :" + entity);
		return this.repository.save(entity);
	}

	@Override
	public List<ContactDTO> findByName(String name) {
		log.info("running findByName");
		List<ContactInfoEntity> entities = this.repository.findByName(name);

		List<ContactDTO> dtos = entities.stream().map(ent -> {
			ContactDTO contactDTO = new ContactDTO();
			BeanUtils.copyProperties(ent, contactDTO);
			return contactDTO;
		}).collect(Collectors.toList());

		return dtos;
	}

}
