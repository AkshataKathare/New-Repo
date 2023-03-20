package com.xworkz.application.repository;

import com.xworkz.application.dto.WeaponDTO;

public class WeaponRepositoryImpl implements WeaponRepository {

	private WeaponDTO[] weaponDTOs = new WeaponDTO[2];
	private int weaponIndex = 0;

	@Override
	public boolean save(WeaponDTO dto) {
		if (this.weaponIndex < weaponDTOs.length) {
			this.weaponDTOs[weaponIndex] = dto;
			System.out.println("dto saved at index :" + weaponIndex + " " + dto);
			this.weaponIndex++;
			return true;
		} else {
			System.err.println("memory is full ,cannot add the element");
		}
		return false;
	}

}
