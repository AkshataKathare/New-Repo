package com.xworkz.application.boot;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.exception.InvalidDesertException;
import com.xworkz.application.repository.DesertRepository;
import com.xworkz.application.repository.DesertRepositoryImpl;
import com.xworkz.application.service.DesertService;
import com.xworkz.application.service.DesertServiceImpl;

public class DesertRunner {

	public static void main(String[] args) {

		DesertDTO desertDTO = new DesertDTO(123, "Antarctic Desert", "Antarctica", 123.45, 45, 65);
		DesertRepository desertRepository = new DesertRepositoryImpl();
		DesertService desertService = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO2 = new DesertDTO(127, "Kalahari Desert", "Namibia", 147, 50, 60);

		DesertDTO desertDTO3 = new DesertDTO(345, "Guban Desert", "Somalia", 200, 40, 55);

		DesertDTO desertDTO4 = new DesertDTO(400, "Sahara Desert", "Namibia", 566, 50, 60);

		DesertDTO desertDTO5 = new DesertDTO(366, "Kalbi Desert", "Columbia", 47, 40, 65);

		DesertDTO desertDTO6 = new DesertDTO(999, "Djurab Desert", "Chad", 456, 50, 60);

		DesertDTO desertDTO7 = new DesertDTO(300, "Nubian Desert", "Sudan", 145, 30, 55);

		DesertDTO desertDTO8 = new DesertDTO(900, "Gobi Desert", "Mangolia", 207, 34, 70);

		DesertDTO desertDTO9 = new DesertDTO(111, "Atacama Desert", "Sudan", 145, 30, 55);

		DesertDTO desertDTO10 = new DesertDTO(1245, "Taklamakan Desert", "Sudan", 234, 30, 55);

		DesertDTO desertDTO11 = new DesertDTO(5555, "Arabian Desert", "Sudan", 567, 30, 55);

		DesertDTO desertDTO12 = new DesertDTO(5555, "Syrian Desert", "Sudan", 567, 30, 55);

		DesertDTO desertDTO13 = new DesertDTO(5555, "Great Basin Desert", "Sudan", 567, 30, 55);

		DesertDTO desertDTO14 = new DesertDTO(5555, "Thar Desert", "Sudan", 567, 30, 55);

		DesertDTO desertDTO15 = new DesertDTO(5555, "Namib Desert", "Sudan", 567, 30, 55);

		DesertDTO desertDTO16 = new DesertDTO(5555, "Danakil Desert", "Sudan", 567, 30, 55);

		DesertDTO desertDTO17 = new DesertDTO(5555, "Majove Desert", "Sudan", 567, 30, 55);

		DesertDTO desertDTO18 = new DesertDTO(5555, "Ferlo Desert", "Sudan", 567, 30, 55);

		DesertDTO desertDTO19 = new DesertDTO(5555, "Columbia Basin Desert", "Sudan", 567, 30, 55);

		DesertDTO desertDTO20 = new DesertDTO(5555, "Registan Desert", "Sudan", 567, 30, 55);

		DesertDTO desertDTO21 = new DesertDTO(5555, "Ustyurt Desert", "Sudan", 567, 30, 55);

		DesertDTO desertDTO22 = new DesertDTO(5555, "Ogden Desert", "Sudan", 567, 30, 55);

		DesertDTO desertDTO23 = new DesertDTO(5555, "Colorado Desert", "Sudan", 567, 30, 55);

		try {
			boolean saved1 = desertService.validateAndThenSave(desertDTO);
			System.out.println(saved1);

			boolean saved2 = desertService.validateAndThenSave(desertDTO2);
			System.out.println(saved2);

			boolean saved3 = desertService.validateAndThenSave(desertDTO3);
			System.out.println(saved3);

			boolean saved4 = desertService.validateAndThenSave(desertDTO4);
			System.out.println(saved4);

			boolean saved5 = desertService.validateAndThenSave(desertDTO5);
			System.out.println(saved5);

			boolean saved6 = desertService.validateAndThenSave(desertDTO6);
			System.out.println(saved6);

			boolean saved7 = desertService.validateAndThenSave(desertDTO7);
			System.out.println(saved7);

			boolean saved8 = desertService.validateAndThenSave(desertDTO8);
			System.out.println(saved8);

			boolean saved9 = desertService.validateAndThenSave(desertDTO9);
			System.out.println(saved9);

			boolean saved10 = desertService.validateAndThenSave(desertDTO10);
			System.out.println(saved10);

			boolean saved11 = desertService.validateAndThenSave(desertDTO11);
			System.out.println(saved11);

			boolean saved12 = desertService.validateAndThenSave(desertDTO12);
			System.out.println(saved12);

			boolean saved13 = desertService.validateAndThenSave(desertDTO13);
			System.out.println(saved13);

			boolean saved14 = desertService.validateAndThenSave(desertDTO14);
			System.out.println(saved14);

			boolean saved15 = desertService.validateAndThenSave(desertDTO15);
			System.out.println(saved15);

			boolean saved16 = desertService.validateAndThenSave(desertDTO16);
			System.out.println(saved16);

			boolean saved17 = desertService.validateAndThenSave(desertDTO17);
			System.out.println(saved17);

			boolean saved18 = desertService.validateAndThenSave(desertDTO18);
			System.out.println(saved18);

			boolean saved19 = desertService.validateAndThenSave(desertDTO19);
			System.out.println(saved19);

			boolean saved20 = desertService.validateAndThenSave(desertDTO20);
			System.out.println(saved20);

			boolean saved21 = desertService.validateAndThenSave(desertDTO21);
			System.out.println(saved21);

			boolean saved22 = desertService.validateAndThenSave(desertDTO22);
			System.out.println(saved22);

			boolean saved23 = desertService.validateAndThenSave(desertDTO23);
			System.out.println(saved23);

			System.out.println("%%%%%%%%%%%%%%%");

		} catch (InvalidDesertException e) {

		}
		System.out.println(desertService.findAreaByName("Antarctic Desert"));
		System.out.println(desertService.find(desertDTO));
		System.out.println(desertService.findByName("Antarctic Desert"));
		System.out.println(desertService.findByNameAndCountryAndArea("Antarctic Desert", "Antarctica", 123.45));

		System.out.println("*****************");

		System.out.println(desertService.findAreaByName("Kalahari Desert"));
		System.out.println(desertService.find(desertDTO2));
		System.out.println(desertService.findByName("Kalahari Desert"));
		System.out.println(desertService.findByNameAndCountryAndArea("Kalahari Desert", "Namibia", 147));

		System.out.println("*****************");

		System.out.println(desertService.findAreaByName("Guban Desert"));
		System.out.println(desertService.find(desertDTO3));
		System.out.println(desertService.findByName("Guban Desert"));
		System.out.println(desertService.findByNameAndCountryAndArea("Guban Desert", "Somalia", 200));

		System.out.println("*****************");

		System.out.println(desertService.findAreaByName("Sahara Desert"));
		System.out.println(desertService.find(desertDTO4));
		System.out.println(desertService.findByName("Sahara Desert"));
		System.out.println(desertService.findByNameAndCountryAndArea("Sahara Desert", "Namibia", 566));

		System.out.println("*****************");

		System.out.println(desertService.findAreaByName("Kalbi Desert"));
		System.out.println(desertService.find(desertDTO5));
		System.out.println(desertService.findByName("Kalbi Desert"));
		System.out.println(desertService.findByNameAndCountryAndArea("Kalbi Desert", "Columbia", 47));

		System.out.println("*****************");

		System.out.println(desertService.findAreaByName("Djurab Desert"));
		System.out.println(desertService.find(desertDTO6));
		System.out.println(desertService.findByName("Djurab Desert"));
		System.out.println(desertService.findByNameAndCountryAndArea("Djurab Desert", "Chad", 456));

		System.out.println("*****************");

		System.out.println(desertService.findAreaByName("Nubian Desert"));
		System.out.println(desertService.find(desertDTO7));
		System.out.println(desertService.findByName("Nubian Desert"));
		System.out.println(desertService.findByNameAndCountryAndArea("Nubian Desert", "Sudan", 145));

		System.out.println("*****************");

		System.out.println(desertService.findAreaByName("Gobi Desert"));
		System.out.println(desertService.find(desertDTO8));
		System.out.println(desertService.findByName("Gobi Desert"));
		System.out.println(desertService.findByNameAndCountryAndArea("Gobi Desert", "Mangolia", 207));

		System.out.println("*****************");

		System.out.println(desertService.findAreaByName("Atacama Desert"));
		System.out.println(desertService.find(desertDTO9));
		System.out.println(desertService.findByName("Atacama Desert"));
		System.out.println(desertService.findByNameAndCountryAndArea("Atacama Desert", "Sudan", 145));

		System.out.println("*****************");

		System.out.println(desertService.findAreaByName("Taklamakan Desert"));
		System.out.println(desertService.find(desertDTO10));
		System.out.println(desertService.findByName("Taklamakan Desert"));
		System.out.println(desertService.findByNameAndCountryAndArea("Taklamakan Desert", "USA", 234));

		System.out.println("*****************");

		System.out.println(desertService.findAreaByName("Arabian Desert"));
		System.out.println(desertService.find(desertDTO11));
		System.out.println(desertService.findByName("Arabian Desert"));
		System.out.println(desertService.findByNameAndCountryAndArea("Arabian Desert", "Sudan", 456));

		System.out.println("*****************");

		System.out.println(desertService.findAreaByName("Syrian Desert"));
		System.out.println(desertService.find(desertDTO12));
		System.out.println(desertService.findByName("Syrian Desert"));
		System.out.println(desertService.findByNameAndCountryAndArea("Syrian Desert", "Sudan", 567));

		System.out.println("*****************");

		System.out.println(desertService.findAreaByName("Great Basin Desert"));
		System.out.println(desertService.find(desertDTO13));
		System.out.println(desertService.findByName("Great Basin Desert"));
		System.out.println(desertService.findByNameAndCountryAndArea("Great Basin Desert", "Sudan", 567));

		System.out.println("*****************");

		System.out.println(desertService.findAreaByName("Thar Desert"));
		System.out.println(desertService.find(desertDTO14));
		System.out.println(desertService.findByName("Thar Desert"));
		System.out.println(desertService.findByNameAndCountryAndArea("Thar Desert", "Sudan", 567));

		System.out.println("*****************");

		System.out.println(desertService.findAreaByName("Namib Desert"));
		System.out.println(desertService.find(desertDTO15));
		System.out.println(desertService.findByName("Namib Desert"));
		System.out.println(desertService.findByNameAndCountryAndArea("Namib Desert", "Sudan", 567));

		System.out.println("*****************");

		System.out.println(desertService.findAreaByName("Danakil Desert"));
		System.out.println(desertService.find(desertDTO16));
		System.out.println(desertService.findByName("Danakil Desert"));
		System.out.println(desertService.findByNameAndCountryAndArea("Danakil Desert", "Sudan", 567));

		System.out.println("*****************");

		System.out.println(desertService.findAreaByName("Majove Desert"));
		System.out.println(desertService.find(desertDTO17));
		System.out.println(desertService.findByName("Majove Desert"));
		System.out.println(desertService.findByNameAndCountryAndArea("Majove Desert", "Sudan", 567));

		System.out.println("*****************");

		System.out.println(desertService.findAreaByName("Majove Desert"));
		System.out.println(desertService.find(desertDTO18));
		System.out.println(desertService.findByName("Majove Desert"));
		System.out.println(desertService.findByNameAndCountryAndArea("Majove Desert", "Sudan", 567));

		System.out.println("*****************");

		System.out.println(desertService.findAreaByName("Majove Desert"));
		System.out.println(desertService.find(desertDTO19));
		System.out.println(desertService.findByName("Majove Desert"));
		System.out.println(desertService.findByNameAndCountryAndArea("Majove Desert", "Sudan", 567));

		System.out.println("*****************");

		System.out.println(desertService.findAreaByName("Registan Desert"));
		System.out.println(desertService.find(desertDTO20));
		System.out.println(desertService.findByName("Registan Desert"));
		System.out.println(desertService.findByNameAndCountryAndArea("Registan Desert", "Sudan", 567));

		System.out.println("*****************");

		System.out.println(desertService.findAreaByName("Ogden Desert"));
		System.out.println(desertService.find(desertDTO22));
		System.out.println(desertService.findByName("Ogden Desert"));
		System.out.println(desertService.findByNameAndCountryAndArea("Ogden Desert", "Sudan", 567));

		System.out.println("*****************");

		System.out.println(desertService.findAreaByName("Colorado Desert"));
		System.out.println(desertService.find(desertDTO23));
		System.out.println(desertService.findByName("Colorado Desert"));
		System.out.println(desertService.findByNameAndCountryAndArea("Colorado Desert", "Sudan", 567));

		System.out.println(desertService.total());

	}

}
