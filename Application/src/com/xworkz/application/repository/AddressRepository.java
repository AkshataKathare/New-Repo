package com.xworkz.application.repository;

import com.xworkz.application.dto.AddressDTO;

public interface AddressRepository {

	boolean save(AddressDTO dto);

	boolean isExist(AddressDTO dto);

	int total();

	AddressDTO findByNumber(int number);

	boolean find(AddressDTO dto);

	AddressDTO findByStreet(String street);

	AddressDTO findByPinCode(int pinCode);

	AddressDTO findByStreetAndPinCodeAndArea(int pinCode, String area, String street);

	AddressDTO findByCityAndState(String city, String state);

	int findFloorByNumber(int number);

	String findCityByNumberAndFloorAndStreetAndPinCode(int number, int floor, String street, int pinCode);

	int findPinCodeByNumber(int number);

}
