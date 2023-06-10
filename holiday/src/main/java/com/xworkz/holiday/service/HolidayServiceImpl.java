package com.xworkz.holiday.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.holiday.entity.HolidayEntity;
import com.xworkz.holiday.repository.HolidayRepository;
import com.xworkz.holiday.util.JPAUtil;

@Component
public class HolidayServiceImpl implements HolidayService {

	@Autowired
	private HolidayRepository repository;

	@Override
	public boolean validatAndThenSave(HolidayEntity entity) {
		boolean valid = JPAUtil.valid(entity);

		if (valid) {
			System.out.println("Entity has no violations and hence the data will be saved");
			boolean save = repository.save(entity);
			System.out.println(save);
		}
		return true;
	}

}
