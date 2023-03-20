package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.constant.Brand;
import com.xworkz.application.constant.Color;
import com.xworkz.application.constant.TypeAndWeight;
import com.xworkz.application.dto.HeadPhoneDTO;
import com.xworkz.application.repository.HeadPhoneRepository;
import com.xworkz.application.repository.HeadPhoneRepositoryImpl;
import com.xworkz.application.service.HeadPhoneService;
import com.xworkz.application.service.HeadPhoneServiceImpl;

public class HeadPhoneRunner {

	public static void main(String[] args) {

		HeadPhoneDTO headPhoneDTO = new HeadPhoneDTO();
		headPhoneDTO.setBass(false);
		headPhoneDTO.setBrand(Brand.ADIDAS);
		headPhoneDTO.setColor(Color.BLACK);
		headPhoneDTO.setCustomerName("Akshata");
		headPhoneDTO.setInvoiceNo(2);
		headPhoneDTO.setMfgDate(LocalDate.now());
		headPhoneDTO.setModelNo("qr1.2");
		headPhoneDTO.setPrice(2000);
		headPhoneDTO.setTypeAndWeight(TypeAndWeight.EARPODS);
		headPhoneDTO.setWarrantyPeriod(6);

		HeadPhoneRepository headPhoneRepository = new HeadPhoneRepositoryImpl();

		HeadPhoneService headPhoneService = new HeadPhoneServiceImpl(headPhoneRepository);
		boolean saved = headPhoneService.validateAndThenSave(headPhoneDTO);
		System.out.println("Saved :" + saved);
		System.out.println(TypeAndWeight.IN_EAR.getWeight());

		HeadPhoneDTO headPhoneDTO2 = new HeadPhoneDTO();
		headPhoneDTO2.setBass(false);
		headPhoneDTO2.setBrand(Brand.BOAT);
		headPhoneDTO2.setColor(Color.GREEN);
		headPhoneDTO2.setCustomerName("Akshata");
		headPhoneDTO2.setInvoiceNo(2);
		headPhoneDTO2.setMfgDate(LocalDate.now());
		headPhoneDTO2.setModelNo("qr1.2");
		headPhoneDTO2.setPrice(2000);
		headPhoneDTO2.setTypeAndWeight(TypeAndWeight.EARPODS);
		headPhoneDTO2.setWarrantyPeriod(6);

		HeadPhoneService headPhoneService2 = new HeadPhoneServiceImpl(headPhoneRepository);
		boolean saved2 = headPhoneService2.validateAndThenSave(headPhoneDTO2);
		System.out.println("Saved :" + saved2);
	}

}
