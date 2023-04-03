package com.xworkz.application.repository;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.exception.DesertMemoryFullException;

public class DesertRepositoryImpl implements DesertRepository {

	private DesertDTO[] desertDTOs = new DesertDTO[23];
	private int desertIndex = 0;

	@Override
	public boolean save(DesertDTO dto) {
		if (this.desertIndex < this.desertDTOs.length) {
			this.desertDTOs[desertIndex] = dto;
			System.out.println("dto is saved :" + dto + " " + "at the index :" + desertIndex);
			this.desertIndex++;
			return true;
		} else {
			throw new DesertMemoryFullException("Memory is full and hence cannot save the data");
		}
	}

	@Override
	public boolean isExist(DesertDTO dto) {
		if (this.desertIndex == 0) {
			System.out.println("First element will not be compared");
			return false;
		} else {
			for (int index = 0; index < this.desertIndex; index++) {
				DesertDTO element = this.desertDTOs[index];
				if (element.equals(dto)) {
					System.out.println("this dto exists and hence will not be saved");
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public DesertDTO find(DesertDTO dto) {
		for (int index = 0; index < this.desertDTOs.length; index++) {
			DesertDTO element2 = this.desertDTOs[index];
			if (element2 != null && element2.equals(dto)) {
				System.out.println("dto is same");
				return element2;
			}
		}
		return null;
	}

	@Override
	public DesertDTO findByName(String name) {
		for (int index = 0; index < this.desertDTOs.length; index++) {
			DesertDTO element3 = this.desertDTOs[index];
			if (element3 != null && element3.getName().equals(name)) {
				System.out.println("dto with this name exists :" + name);
				return element3;
			}
		}
		return null;
	}

	@Override
	public double findAreaByName(String name) {
		for (int index = 0; index < this.desertDTOs.length; index++) {
			DesertDTO element4 = this.desertDTOs[index];
			if (element4 != null && element4.getName().equals(name)) {
				System.out.println("dto with this name exists :" + name);
				return element4.getArea();
			}
		}
		return 0;
	}

	@Override
	public DesertDTO findByNameAndCountryAndArea(String name, String country, double area) {
		for (int index = 0; index < this.desertDTOs.length; index++) {
			DesertDTO element5 = this.desertDTOs[index];
			if (element5 != null && element5.getName().equals(name) && element5.getCountry().equals(country)
					&& element5.getArea() == area) {
				System.out.println("dto with this name,country,area exists :" + name + "," + country + "," + area);
				return element5;
			}
		}
		return null;
	}

	@Override
	public int total() {
		return this.desertIndex;
	}

}
