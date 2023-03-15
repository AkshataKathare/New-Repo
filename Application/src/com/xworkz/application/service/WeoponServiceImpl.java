package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.constant.WeaponType;
import com.xworkz.application.dto.WeaponDTO;

public class WeoponServiceImpl implements WeaponService {

	@Override
	public boolean validateAndThenSave(WeaponDTO dto) {
		System.out.println("Running validateAndThenSave " + dto);
		if (dto != null) {
			// store the properties in local variables
			double cost = dto.getCost();
			int id = dto.getId();
			String madeBy = dto.getMadeby();
			String manufacturedBy = dto.getManufacturedBy();
			LocalDate manufacturedYear = dto.getManufacturedYear();
			String material = dto.getMaterial();
			String name = dto.getName();
			WeaponType type = dto.getType();
			String usedBy = dto.getUsedBy();
			String usedFor = dto.getUsedFor();
			double weight = dto.getWeight();

			// declare boolean variables

			boolean validCost = false;
			boolean validID = false;
			boolean validMadeBy = false;
			boolean validManufacturedBy = false;
			boolean validManufacturedYear = false;
			boolean validMaterial = false;
			boolean validName = false;
			boolean validType = false;
			boolean validUsedBy = false;
			boolean validUsedFor = false;
			boolean validWeight = false;

			if (cost > 100 && cost < 100000) {
				System.out.println("valid cost");
				validCost = true;
			} else {
				System.err.println("invalid cost");
			}
			if (id > 0 && id < 100) {
				System.out.println("valid id");
				validID = true;
			} else {
				System.err.println("invalid id");
			}
			if (madeBy != null && !madeBy.isEmpty() && madeBy.length() > 3 && madeBy.length() < 30) {
				System.out.println("valid madeBy");
				validMadeBy = true;
			} else {
				System.err.println("invalid madeBy");
			}
			if (manufacturedBy != null && !manufacturedBy.isEmpty() && manufacturedBy.length() > 3
					&& manufacturedBy.length() < 30) {
				System.out.println("valid manufacturedBy");
				validManufacturedBy = true;
			} else {
				System.err.println("invalid manufacturedBy");
			}

			LocalDate thisDay = LocalDate.now();
			LocalDate after = LocalDate.of(2001, 1, 16);
			if (manufacturedYear != null && manufacturedYear.isBefore(thisDay) && manufacturedYear.isAfter(after)) {
				System.out.println("valid manufacturedYear");
				validManufacturedYear = true;
			} else {
				System.err.println("invalid manufacturedYear");
			}
			if (material != null && !material.isEmpty() && material.length() > 3 && material.length() < 30) {
				System.out.println("valid material");
				validMaterial = true;
			} else {
				System.err.println("invalid material");
			}
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 30) {
				System.out.println("valid name");
				validName = true;
			} else {
				System.err.println("invalid name");
			}
			if (type != null) {
				System.out.println("valid type");
				validType = true;
			} else {
				System.err.println("invalid type");
			}
			if (usedBy != null && !usedBy.isEmpty() && usedBy.length() > 3 && usedBy.length() < 30) {
				System.out.println("valid usedBy");
				validUsedBy = true;
			} else {
				System.err.println("invalid usedBy");
			}
			if (usedFor != null && !usedFor.isEmpty() && usedFor.length() > 3 && usedFor.length() < 30) {
				System.out.println("valid usedFor");
				validUsedFor = true;
			} else {
				System.err.println("invalid usedFor");
			}
			if (weight > 250 && weight < 1000) {
				System.out.println("valid weight");
				validWeight = true;
			} else {
				System.err.println("invalid weight");
			}
			if (validCost && validID && validMadeBy && validManufacturedBy && validManufacturedYear && validMaterial
					&& validName && validType && validUsedBy && validUsedFor && validWeight) {
				System.out.println("Everything is valid and dto can be saved");
				return true;
			} else {
				System.err.println("Something is invalid");
			}

		} else {
			System.out.println("dto is null");
		}
		return false;
	}

}
