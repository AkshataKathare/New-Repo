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
		DesertService desertService2 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO3 = new DesertDTO(345, "Guban Desert", "Somalia", 200, 40, 55);
		DesertService desertService3 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO4 = new DesertDTO(400, "Sahara Desert", "Namibia", 566, 50, 60);
		DesertService desertService4 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO5 = new DesertDTO(366, "Kalbi Desert", "Columbia", 47, 40, 65);
		DesertService desertService5 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO6 = new DesertDTO(999, "Djurab Desert", "Chad", 456, 50, 60);
		DesertService desertService6 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO7 = new DesertDTO(300, "Nubian Desert", "Sudan", 145, 30, 55);
		DesertService desertService7 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO8 = new DesertDTO(900, "Gobi Desert", "Mangolia", 207, 34, 70);
		DesertService desertService8 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO9 = new DesertDTO(111, "Atacama Desert", "Sudan", 145, 30, 55);
		DesertService desertService9 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO10 = new DesertDTO(1245, "Taklamakan Desert", "USA", 234, 30, 55);
		DesertService desertService10 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO11 = new DesertDTO(5555, "Arabian Desert", "Sudan", 567, 30, 55);
		DesertService desertService11 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO12 = new DesertDTO(5555, "Syrian Desert", "Sudan", 567, 30, 55);
		DesertService desertService12 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO13 = new DesertDTO(5555, "Great Basin Desert", "Sudan", 567, 30, 55);
		DesertService desertService13 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO14 = new DesertDTO(5555, "Thar Desert", "Sudan", 567, 30, 55);
		DesertService desertService14 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO15 = new DesertDTO(5555, "Namib Desert", "Sudan", 567, 30, 55);
		DesertService desertService15 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO16 = new DesertDTO(5555, "Danakil Desert", "Sudan", 567, 30, 55);
		DesertService desertService16 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO17 = new DesertDTO(5555, "Majove Desert", "Sudan", 567, 30, 55);
		DesertService desertService17 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO18 = new DesertDTO(5555, "Ferlo Desert", "Sudan", 567, 30, 55);
		DesertService desertService18 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO19 = new DesertDTO(5555, "Columbia Basin Desert", "Sudan", 567, 30, 55);
		DesertService desertService19 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO20 = new DesertDTO(5555, "Registan Desert", "Sudan", 567, 30, 55);
		DesertService desertService20 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO21 = new DesertDTO(5555, "Ustyurt Desert", "Sudan", 567, 30, 55);
		DesertService desertService21 = new DesertServiceImpl(desertRepository);
		System.out.println(desertService21.findAreaByName("Ustyurt Desert"));
		System.out.println(desertService21.find(desertDTO21));
		System.out.println(desertService21.findByName("Ustyurt Desert"));
		System.out.println(desertService21.findByNameAndCountryAndArea("Ustyurt Desert", "Sudan", 567));

		DesertDTO desertDTO22 = new DesertDTO(5555, "Ogden Desert", "Sudan", 567, 30, 55);
		DesertService desertService22 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO23 = new DesertDTO(5555, "Colorado Desert", "Sudan", 567, 30, 55);
		DesertService desertService23 = new DesertServiceImpl(desertRepository);

		try {
			boolean saved1 = desertService.validateAndThenSave(desertDTO);
			System.out.println(saved1);

			boolean saved2 = desertService2.validateAndThenSave(desertDTO2);
			System.out.println(saved2);

			boolean saved3 = desertService3.validateAndThenSave(desertDTO3);
			System.out.println(saved3);

			boolean saved4 = desertService4.validateAndThenSave(desertDTO4);
			System.out.println(saved4);

			boolean saved5 = desertService5.validateAndThenSave(desertDTO5);
			System.out.println(saved5);

			boolean saved6 = desertService6.validateAndThenSave(desertDTO6);
			System.out.println(saved6);

			boolean saved7 = desertService7.validateAndThenSave(desertDTO7);
			System.out.println(saved7);

			boolean saved8 = desertService8.validateAndThenSave(desertDTO8);
			System.out.println(saved8);

			boolean saved9 = desertService9.validateAndThenSave(desertDTO9);
			System.out.println(saved9);

			boolean saved10 = desertService10.validateAndThenSave(desertDTO10);
			System.out.println(saved10);

			boolean saved11 = desertService11.validateAndThenSave(desertDTO11);
			System.out.println(saved11);

			boolean saved12 = desertService12.validateAndThenSave(desertDTO12);
			System.out.println(saved12);

			boolean saved13 = desertService13.validateAndThenSave(desertDTO13);
			System.out.println(saved13);

			boolean saved14 = desertService14.validateAndThenSave(desertDTO14);
			System.out.println(saved14);

			boolean saved15 = desertService15.validateAndThenSave(desertDTO15);
			System.out.println(saved15);

			boolean saved16 = desertService16.validateAndThenSave(desertDTO16);
			System.out.println(saved16);

			boolean saved17 = desertService17.validateAndThenSave(desertDTO17);
			System.out.println(saved17);

			boolean saved18 = desertService18.validateAndThenSave(desertDTO18);
			System.out.println(saved18);

			boolean saved19 = desertService19.validateAndThenSave(desertDTO19);
			System.out.println(saved19);

			boolean saved20 = desertService20.validateAndThenSave(desertDTO20);
			System.out.println(saved20);

			boolean saved21 = desertService21.validateAndThenSave(desertDTO21);
			System.out.println(saved21);

			boolean saved22 = desertService22.validateAndThenSave(desertDTO22);
			System.out.println(saved22);

			boolean saved23 = desertService23.validateAndThenSave(desertDTO23);
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

		System.out.println(desertService3.findAreaByName("Guban Desert"));
		System.out.println(desertService3.find(desertDTO3));
		System.out.println(desertService3.findByName("Guban Desert"));
		System.out.println(desertService3.findByNameAndCountryAndArea("Guban Desert", "Somalia", 200));

		System.out.println("*****************");

		System.out.println(desertService4.findAreaByName("Sahara Desert"));
		System.out.println(desertService4.find(desertDTO4));
		System.out.println(desertService4.findByName("Sahara Desert"));
		System.out.println(desertService4.findByNameAndCountryAndArea("Sahara Desert", "Namibia", 566));

		System.out.println("*****************");

		System.out.println(desertService5.findAreaByName("Kalbi Desert"));
		System.out.println(desertService5.find(desertDTO5));
		System.out.println(desertService5.findByName("Kalbi Desert"));
		System.out.println(desertService5.findByNameAndCountryAndArea("Kalbi Desert", "Columbia", 47));

		System.out.println("*****************");

		System.out.println(desertService6.findAreaByName("Djurab Desert"));
		System.out.println(desertService6.find(desertDTO6));
		System.out.println(desertService6.findByName("Djurab Desert"));
		System.out.println(desertService6.findByNameAndCountryAndArea("Djurab Desert", "Chad", 456));

		System.out.println("*****************");

		System.out.println(desertService7.findAreaByName("Nubian Desert"));
		System.out.println(desertService7.find(desertDTO7));
		System.out.println(desertService7.findByName("Nubian Desert"));
		System.out.println(desertService7.findByNameAndCountryAndArea("Nubian Desert", "Sudan", 145));

		System.out.println("*****************");

		System.out.println(desertService8.findAreaByName("Gobi Desert"));
		System.out.println(desertService8.find(desertDTO8));
		System.out.println(desertService8.findByName("Gobi Desert"));
		System.out.println(desertService8.findByNameAndCountryAndArea("Gobi Desert", "Mangolia", 207));

		System.out.println("*****************");

		System.out.println(desertService9.findAreaByName("Atacama Desert"));
		System.out.println(desertService9.find(desertDTO9));
		System.out.println(desertService9.findByName("Atacama Desert"));
		System.out.println(desertService9.findByNameAndCountryAndArea("Atacama Desert", "Sudan", 145));

		System.out.println("*****************");

		System.out.println(desertService10.findAreaByName("Taklamakan Desert"));
		System.out.println(desertService10.find(desertDTO10));
		System.out.println(desertService10.findByName("Taklamakan Desert"));
		System.out.println(desertService10.findByNameAndCountryAndArea("Taklamakan Desert", "USA", 234));

		System.out.println("*****************");

		System.out.println(desertService11.findAreaByName("Arabian Desert"));
		System.out.println(desertService11.find(desertDTO11));
		System.out.println(desertService11.findByName("Arabian Desert"));
		System.out.println(desertService11.findByNameAndCountryAndArea("Arabian Desert", "Sudan", 456));

		System.out.println("*****************");

		System.out.println(desertService12.findAreaByName("Syrian Desert"));
		System.out.println(desertService12.find(desertDTO12));
		System.out.println(desertService12.findByName("Syrian Desert"));
		System.out.println(desertService12.findByNameAndCountryAndArea("Syrian Desert", "Sudan", 567));

		System.out.println("*****************");

		System.out.println(desertService13.findAreaByName("Great Basin Desert"));
		System.out.println(desertService13.find(desertDTO13));
		System.out.println(desertService13.findByName("Great Basin Desert"));
		System.out.println(desertService13.findByNameAndCountryAndArea("Great Basin Desert", "Sudan", 567));

		System.out.println("*****************");

		System.out.println(desertService14.findAreaByName("Thar Desert"));
		System.out.println(desertService14.find(desertDTO14));
		System.out.println(desertService14.findByName("Thar Desert"));
		System.out.println(desertService14.findByNameAndCountryAndArea("Thar Desert", "Sudan", 567));

		System.out.println("*****************");

		System.out.println(desertService15.findAreaByName("Namib Desert"));
		System.out.println(desertService15.find(desertDTO15));
		System.out.println(desertService15.findByName("Namib Desert"));
		System.out.println(desertService15.findByNameAndCountryAndArea("Namib Desert", "Sudan", 567));

		System.out.println("*****************");

		System.out.println(desertService16.findAreaByName("Danakil Desert"));
		System.out.println(desertService16.find(desertDTO16));
		System.out.println(desertService16.findByName("Danakil Desert"));
		System.out.println(desertService16.findByNameAndCountryAndArea("Danakil Desert", "Sudan", 567));

		System.out.println("*****************");

		System.out.println(desertService17.findAreaByName("Majove Desert"));
		System.out.println(desertService17.find(desertDTO17));
		System.out.println(desertService17.findByName("Majove Desert"));
		System.out.println(desertService17.findByNameAndCountryAndArea("Majove Desert", "Sudan", 567));

		System.out.println("*****************");

		System.out.println(desertService18.findAreaByName("Majove Desert"));
		System.out.println(desertService18.find(desertDTO18));
		System.out.println(desertService18.findByName("Majove Desert"));
		System.out.println(desertService18.findByNameAndCountryAndArea("Majove Desert", "Sudan", 567));

		System.out.println("*****************");

		System.out.println(desertService19.findAreaByName("Majove Desert"));
		System.out.println(desertService19.find(desertDTO19));
		System.out.println(desertService19.findByName("Majove Desert"));
		System.out.println(desertService19.findByNameAndCountryAndArea("Majove Desert", "Sudan", 567));

		System.out.println("*****************");

		System.out.println(desertService20.findAreaByName("Registan Desert"));
		System.out.println(desertService20.find(desertDTO20));
		System.out.println(desertService20.findByName("Registan Desert"));
		System.out.println(desertService20.findByNameAndCountryAndArea("Registan Desert", "Sudan", 567));

		System.out.println("*****************");

		System.out.println(desertService22.findAreaByName("Ogden Desert"));
		System.out.println(desertService22.find(desertDTO22));
		System.out.println(desertService22.findByName("Ogden Desert"));
		System.out.println(desertService22.findByNameAndCountryAndArea("Ogden Desert", "Sudan", 567));

		System.out.println("*****************");

		System.out.println(desertService23.findAreaByName("Colorado Desert"));
		System.out.println(desertService23.find(desertDTO23));
		System.out.println(desertService23.findByName("Colorado Desert"));
		System.out.println(desertService23.findByNameAndCountryAndArea("Colorado Desert", "Sudan", 567));

	}

}
