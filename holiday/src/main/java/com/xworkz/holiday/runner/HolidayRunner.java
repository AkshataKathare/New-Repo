package com.xworkz.holiday.runner;

import com.xworkz.holiday.entity.HolidayEntity;
import com.xworkz.holiday.repository.HolidayRepoImpl;
import com.xworkz.holiday.repository.HolidayRepository;

public class HolidayRunner {

	public static void main(String[] args) {

		HolidayEntity entity = new HolidayEntity(1, "April", "June", "Shimoga");

		HolidayRepository holidayRepository = new HolidayRepoImpl();
		boolean saved = holidayRepository.save(entity);
		System.out.println(saved);
	}

}
