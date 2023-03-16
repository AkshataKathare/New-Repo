package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.constant.Brand;
import com.xworkz.application.constant.Color;
import com.xworkz.application.constant.TypeAndWeight;
import com.xworkz.application.dto.HeadPhoneDTO;
import static com.xworkz.application.util.ValidationUtil.*;

public class HeadPhoneServiceImpl implements HeadPhoneService {

	@Override
	public boolean validateAndThenSave(HeadPhoneDTO dto) {
		System.out.println("Running validateAndThenSave" + dto);
		if (dto != null) {
			Brand brand = dto.getBrand();
			Color color = dto.getColor();
			String customerName = dto.getCustomerName();
			int invoiceNo = dto.getInvoiceNo();
			LocalDate mfgDate = dto.getMfgDate();
			String modelNo = dto.getModelNo();
			double price = dto.getPrice();
			TypeAndWeight typeAndWeight = dto.getTypeAndWeight();
			int warrantyPeriod = dto.getWarrantyPeriod();
			boolean bass = dto.isBass();

			boolean validBrand = false;
			boolean validColor = false;
			boolean validCustomerName = false;
			boolean validInvoiceno = false;
			boolean validMfgDate = false;
			boolean validModelNo = false;
			boolean validPrice = false;
			boolean validTypeAndWeight = false;
			boolean validWarrantyPeriod = false;
			boolean validBass = false;

			if (validString(modelNo)) {
				System.out.println("valid modelNo");
				validModelNo = true;
			} else {
				System.err.println("invalid modelNo");
			}
			if (brand != null) {
				System.out.println("brand is valid");
				validBrand = true;
			} else {
				System.err.println("invalid brand");
			}
			if (color != null) {
				System.out.println("valid color");
				validColor = true;
			} else {
				System.err.println("invalid color");
			}
			if (typeAndWeight != null) {
				System.out.println("valid typeAndWeight");
				validTypeAndWeight = true;
			} else {
				System.err.println("invalid typeAndWeight");
			}
			if (validString(customerName)) {
				System.out.println("valid customerName");
				validCustomerName = true;
			} else {
				System.err.println("invalid customerName");
			}
			if (validNumber(invoiceNo)) {
				System.out.println("valid invoiceNo");
				validInvoiceno = true;
			} else {
				System.err.println("invalid invoiceNo");
			}
			if (validNumber(warrantyPeriod)) {
				System.out.println("valid warrantyPeriod");
				validWarrantyPeriod = true;
			} else {
				System.err.println("invalid warrantyPeriod");
			}
			if (validPrice(price)) {
				System.out.println("valid price");
				validPrice = true;
			} else {
				System.err.println("invalid price");
			}
			if (validDate(mfgDate, LocalDate.of(2001, 1, 1))) {
				System.out.println("valid mfgDate");
				validMfgDate = true;
			} else {
				System.err.println("invalid mfgDate");
			}
			if (!validBass) {
				System.out.println("valid bass");
				validBass = true;
			} else {
				System.err.println("invalid bass");
			}
			if (validFlag(validBass, validBrand, validColor, validCustomerName, validInvoiceno, validMfgDate,
					validModelNo, validPrice, validTypeAndWeight, validWarrantyPeriod)) {
				System.out.println("valid dto");
				return true;
			} else {
				System.err.println("invalid dto");
				return false;
			}

		}
		return false;
	}

}
