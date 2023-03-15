package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.constant.WeaponType;
import com.xworkz.application.dto.WeaponDTO;
import com.xworkz.application.service.WeaponService;
import com.xworkz.application.service.WeoponServiceImpl;

public class WeaponRunner {

	public static void main(String[] args) {
		WeaponDTO weapon = new WeaponDTO(23, "AK47", WeaponType.GUN, 55000, "Steel&Wood", "Sagar", "Akshata",
				LocalDate.of(2021, 3, 15), "Abhi", "Hunting", 400);

		WeaponService service = new WeoponServiceImpl();
		boolean same = service.validateAndThenSave(weapon);
		System.out.println("DTO is saved :" + same);
	}

}
