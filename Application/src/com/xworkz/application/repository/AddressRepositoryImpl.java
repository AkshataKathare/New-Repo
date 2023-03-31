package com.xworkz.application.repository;

import com.xworkz.application.dto.AddressDTO;

public class AddressRepositoryImpl implements AddressRepository {

	private AddressDTO[] addressDTOs = new AddressDTO[10];
	private int addressIndex = 0;

	@Override
	public boolean save(AddressDTO dto) {
		if (this.addressIndex < this.addressDTOs.length) {
			this.addressDTOs[addressIndex] = dto;
			System.out.println("dto is saved at the index :" + this.addressIndex);
			this.addressIndex++;
			return true;
		} else {
			System.err.println("memory is full as the length is 5");
		}
		return false;
	}

	@Override
	public boolean isExist(AddressDTO dto) {
		if (this.addressIndex == 0) {
			System.out.println("first element cannot be checked");
			return false;
		} else {
			for (int index = 0; index < this.addressIndex; index++) {
				AddressDTO addDTO = this.addressDTOs[index];
				if (addDTO.equals(dto)) {
					System.out.println("Cannot be saved as it is a duplicate of existing one");
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public int total() {
		return this.addressIndex;
	}

	@Override
	public AddressDTO findByNumber(int number) {
		for (int index = 0; index < this.addressDTOs.length; index++) {
			AddressDTO ele = this.addressDTOs[index];
			if (ele.getNumber() == number) {
				System.out.println("This number is present in dto :" + number);
				return ele;
			}
//			 else {
//				System.err.println("This number is not present in dto");
//			}
		}
		return null;

	}

	@Override
	public boolean find(AddressDTO dto) {
		return false;
	}

	@Override
	public AddressDTO findByStreet(String street) {
		for (int index = 0; index < this.addressDTOs.length; index++) {
			AddressDTO ele1 = this.addressDTOs[index];
			if (ele1.getStreet().equals(street)) {
				System.out.println("This street is present in dto :" + street);
				return ele1;
			}
// else {
//				System.err.println("This street is not present in dto");
//			}

		}
		return null;
	}

	@Override
	public AddressDTO findByPinCode(int pinCode) {
		for (int index = 0; index < this.addressDTOs.length; index++) {
			AddressDTO ele2 = this.addressDTOs[index];
			if (ele2.getPinCode() == pinCode) {
				System.out.println("This pinCode is present in dto :" + pinCode);
				return ele2;
			}
		}
//			 else {
//				System.err.println("This pinCode is not present in dto");
//			}

		return null;
	}

	@Override
	public AddressDTO findByStreetAndPinCodeAndArea(int pinCode, String area, String street) {
		for (int index = 0; index < this.addressDTOs.length; index++) {
			AddressDTO ele3 = this.addressDTOs[index];
			if (ele3.getPinCode() == pinCode && ele3.getArea().equals(area) && ele3.getStreet().equals(street)) {
				System.out.println(
						"This pinCode,area and street is present in dto :" + pinCode + " " + area + " " + street);
				return ele3;
			}
		}
//			} else {
//				System.err.println("This pinCode,area and street is not present in dto ");
//			}

		return null;
	}

	@Override
	public AddressDTO findByCityAndState(String city, String state) {
		for (int index = 0; index < this.addressDTOs.length; index++) {
			AddressDTO ele4 = this.addressDTOs[index];
			if (ele4.getCity().equals(city) && ele4.getState().equals(state)) {
				System.out.println("This city,state is present in dto :" + city + " " + state);
				return ele4;
			}
//			 else {
//				System.err.println("This city,state is not present in dto");
//			}
		}
		return null;
	}

	@Override
	public int findFloorByNumber(int number) {
		for (int index = 0; index < this.addressDTOs.length; index++) {
			AddressDTO elem = this.addressDTOs[index];
			if (elem.getNumber() == number) {
				System.out.println("This number is present in dto :" + number);
				int floor = elem.getFloor();
				return floor;
			}
//			 else {
//				System.err.println("This number is not present in dto ");
//			}
		}
		return 0;
	}

	@Override
	public String findCityByNumberAndFloorAndStreetAndPinCode(int number, int floor, String street, int pinCode) {
		for (int index = 0; index < this.addressDTOs.length; index++) {
			AddressDTO elem5 = this.addressDTOs[index];
			if (elem5.getNumber() == number && elem5.getFloor() == floor && elem5.getStreet().equals(street)
					&& elem5.getPinCode() == pinCode) {
				System.out.println("This number,floor,street and pinCode is present in dto :" + number + " " + floor
						+ " " + street + " " + pinCode);
				String cityName = elem5.getCity();
				return cityName;
			}
//			 else {
//				System.err.println("This number,floor,street and pinCode is not present in dto");
//			}
		}
		return null;
	}

	@Override
	public int findPinCodeByNumber(int number) {
		for (int index = 0; index < this.addressDTOs.length; index++) {
			AddressDTO ele6 = this.addressDTOs[index];
			if (ele6.getNumber() == number) {
				System.out.println("This number is present in dto :" + number);
				int pinCodeNum = ele6.getPinCode();
				return pinCodeNum;
			}
//			 else {
//				System.err.println("This number is not present in dto");
//			}
		}
		return 0;
	}

}
