package com.xworkz.application.service;

import com.xworkz.application.dto.AddressDTO;
import com.xworkz.application.repository.AddressRepository;

import static com.xworkz.application.util.AddressUtil.*;

public class AddressServiceImpl implements AddressService {

	private AddressRepository addressRepository;

	public AddressServiceImpl(AddressRepository addressRepository) {
		super();
		this.addressRepository = addressRepository;
	}

	@Override
	public boolean validateAndThenSave(AddressDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null");
			String street = dto.getStreet();
			String area = dto.getArea();
			int pinCode = dto.getPinCode();
			int floor = dto.getFloor();
			int number = dto.getNumber();
			String city = dto.getCity();
			String state = dto.getState();

			boolean validStreet = false;
			boolean validArea = false;
			boolean validPinCode = false;
			boolean validFloor = false;
			boolean validNumber = false;
			boolean validCity = false;
			boolean validState = false;

			if (validString(street)) {
				System.out.println("street is valid");
				validStreet = true;
			} else {
				System.err.println("street is invalid");
			}
			if (validString(area)) {
				System.out.println("area is valid");
				validArea = true;
			} else {
				System.err.println("area is invalid");
			}
			if (validString(city)) {
				System.out.println("city is valid");
				validCity = true;
			} else {
				System.err.println("city is invalid");
			}
			if (validString(state)) {
				System.out.println("state is valid");
				validState = true;
			} else {
				System.err.println("state is invalid");
			}
			if (validInt(number)) {
				System.out.println("number is valid");
				validNumber = true;
			} else {
				System.err.println("number is invalid");
			}
			if (validInt(floor)) {
				System.out.println("floor is valid");
				validFloor = true;
			} else {
				System.err.println("floor is invalid");
			}
			if (validInt(pinCode)) {
				System.out.println("pinCOde is valid");
				validPinCode = true;
			} else {
				System.err.println("pinCode is invalid");
			}
			if (validFlags(
					validArea && validCity && validFloor && validNumber && validPinCode && validState && validStreet)) {
				System.out.println("Valid dto");
				boolean exists = this.addressRepository.isExist(dto);
				if (!exists) {
					boolean saved = this.addressRepository.save(dto);
					System.out.println(saved);
					return true;
				}
			} else {
				System.err.println("invalid dto");
			}
		} else {
			System.err.println("dto is null");
		}
		return false;
	}

	@Override
	public int total() {
		return this.addressRepository.total();
	}

	@Override
	public AddressDTO findByNumber(int number) {
		if (validInt(number)) {
			return this.addressRepository.findByNumber(number);
		}
		return null;
	}

	@Override
	public boolean find(AddressDTO dto) {
		return this.addressRepository.find(dto);
	}

	@Override
	public AddressDTO findByStreet(String street) {
		if (validString(street)) {
			return this.addressRepository.findByStreet(street);
		}
		return null;
	}

	@Override
	public AddressDTO findByPinCode(int pinCode) {
		if (validInt(pinCode)) {
			return this.addressRepository.findByPinCode(pinCode);
		}
		return null;
	}

	@Override
	public AddressDTO findByStreetAndPinCodeAndArea(int pinCode, String area, String street) {
		if (validInt(pinCode) && validString(street) && validString(area)) {
			return this.addressRepository.findByStreetAndPinCodeAndArea(pinCode, area, street);
		}
		return null;
	}

	@Override
	public AddressDTO findByCityAndState(String city, String state) {
		if (validString(state) && validString(city)) {
			return this.addressRepository.findByCityAndState(city, state);
		}
		return null;
	}

	@Override
	public int findFloorByNumber(int number) {
		if (validInt(number)) {
			return this.addressRepository.findFloorByNumber(number);
		}
		return 0;

	}

	@Override
	public String findCityByNumberAndFloorAndStreetAndPinCode(int number, int floor, String street, int pinCode) {
		if (validString(street) && validInt(number) && validInt(floor) && validInt(pinCode)) {
			return this.addressRepository.findCityByNumberAndFloorAndStreetAndPinCode(number, floor, street, pinCode);
		}
		return null;
	}

	@Override
	public int findPinCodeByNumber(int number) {
		if (validInt(number)) {
			return this.addressRepository.findPinCodeByNumber(number);
		}
		return 0;
	}

}
