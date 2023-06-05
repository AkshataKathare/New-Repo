package com.xworkz.holiday.service;

import com.xworkz.holiday.entity.HolidayEntity;

public interface HolidayService {

	boolean validatAndThenSave(HolidayEntity entity);
}
