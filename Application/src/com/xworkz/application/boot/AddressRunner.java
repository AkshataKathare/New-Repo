package com.xworkz.application.boot;

import com.xworkz.application.dto.AddressDTO;
import com.xworkz.application.repository.AddressRepository;
import com.xworkz.application.repository.AddressRepositoryImpl;
import com.xworkz.application.service.AddressService;
import com.xworkz.application.service.AddressServiceImpl;

public class AddressRunner {

	public static void main(String[] args) {

		AddressDTO addressDTO = new AddressDTO("Gandhi Chowk", "Raviwar Peth", 12237, 2, 12, "Dharwad", "Karnataka");
		AddressRepository addressRepository = new AddressRepositoryImpl();
		AddressService addressService = new AddressServiceImpl(addressRepository);
		boolean saved = addressService.validateAndThenSave(addressDTO);
		System.out.println(saved);

		System.out.println(" ");

		System.out.println(addressService.findFloorByNumber(12));
		System.out.println(" ");
		System.out.println(addressService.find(addressDTO));
		System.out.println(" ");
		System.out.println(addressService.findPinCodeByNumber(12));
		System.out.println(" ");
		System.out.println(addressService.findByCityAndState("Dharwad", "Karnataka"));
		System.out.println(" ");
		System.out.println(addressService.findByNumber(12));
		System.out.println(" ");
		System.out.println(addressService.findByPinCode(12237));
		System.out.println(" ");
		System.out.println(addressService.findByStreet("Gandhi Chowk"));

		System.out.println(addressService.findByStreetAndPinCodeAndArea(12237, "Gandhi Chowk", "Raviwar Peth"));
		System.out.println(addressService.findCityByNumberAndFloorAndStreetAndPinCode(12, 2, "Gandhi Chowk", 12237));

		System.out.println(" **************** ");

		AddressDTO addressDTO1 = new AddressDTO("BB Street", "Gandhi Bazar", 52321, 3, 21, "Shimoga", "Karnataka");
		AddressService addressService1 = new AddressServiceImpl(addressRepository);
		boolean saved1 = addressService1.validateAndThenSave(addressDTO1);
		System.out.println(saved1);

		System.out.println(" ");

		System.out.println(addressService1.findFloorByNumber(21));
		System.out.println(" ");
		System.out.println(addressService1.find(addressDTO1));
		System.out.println(" ");
		System.out.println(addressService1.findPinCodeByNumber(21));
		System.out.println(" ");
		System.out.println(addressService1.findByCityAndState("Shimoga", "Karnataka"));
		System.out.println(" ");
		System.out.println(addressService1.findByNumber(21));
		System.out.println(" ");
		System.out.println(addressService1.findByPinCode(52321));
		System.out.println(" ");
		System.out.println(addressService1.findByStreet("BB Street"));
	}

}
