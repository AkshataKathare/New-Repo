package com.xworkz.holiday.service;

import com.xworkz.holiday.entity.HolidayEntity;
import com.xworkz.holiday.util.JPAUtil;

public class HolidayServiceImpl implements HolidayService {

	private JPAUtil jpaUtil;

	@Override
	public boolean validatAndThenSave(HolidayEntity entity) {
		boolean valid = jpaUtil.valid(entity);

		if (valid) {
			System.out.println("Entity has no violations and hence the data will be saved");
		}
		return valid;
	}

}
