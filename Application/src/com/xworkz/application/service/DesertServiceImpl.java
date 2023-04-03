package com.xworkz.application.service;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.exception.InvalidDesertException;
import com.xworkz.application.repository.DesertRepository;

import static com.xworkz.application.util.DesertValidationUtil.*;

public class DesertServiceImpl implements DesertService {

	private DesertRepository desertRepository;

	public DesertServiceImpl(DesertRepository desertRepository) {
		super();
		this.desertRepository = desertRepository;
	}

	@Override
	public boolean validateAndThenSave(DesertDTO dto) throws InvalidDesertException {
		if (dto != null) {
			System.out.println("dto is not null");
			double area = dto.getArea();
			String country = dto.getCountry();
			int id = dto.getId();
			double maxTemperature = dto.getMaxTemp();
			double minTemperature = dto.getMinTemp();
			String name = dto.getName();

			boolean validArea = false;
			boolean validCountry = false;
			boolean validID = false;
			boolean validMaxTemperature = false;
			boolean validMinTemperature = false;
			boolean validName = false;

			if (validString(name)) {
				System.out.println("name is valid");
				validName = true;
			} else {
				System.err.println("name is invalid");
			}
			if (validString(country)) {
				System.out.println("valid country");
				validCountry = true;
			} else {
				System.err.println("invalid country");
			}
			if (validDouble(minTemperature)) {
				System.out.println("valid minTemperature");
				validMinTemperature = true;
			} else {
				System.err.println("invalid minTemperature");
			}
			if (validDouble(maxTemperature)) {
				System.out.println("valid maxTemperature");
				validMaxTemperature = true;
			} else {
				System.err.println("invalid maxTemperature");
			}
			if (validDouble(id)) {
				System.out.println("valid id");
				validID = true;
			} else {
				System.err.println("invalid id");
			}
			if (validDouble(area)) {
				System.out.println("valid area");
				validArea = true;
			} else {
				System.err.println("invalid area");
			}
			if (validFlags(
					validArea && validCountry && validID && validMaxTemperature && validMinTemperature && validName)) {
				System.out.println("data is valid and hence will be saved");
				boolean exists = this.desertRepository.isExist(dto);
				if (!exists) {
					System.out.println("same dto does not exist in any index :" + dto);
					boolean saved = this.desertRepository.save(dto);
					System.out.println("Saved :" + saved);
				}
			} else {
				throw new InvalidDesertException("invalid data in dto");
			}
		} else {
			System.err.println("dto is null");
		}
		return false;
	}

	@Override
	public DesertDTO find(DesertDTO dto) {
		if (dto != null) {
			return this.desertRepository.find(dto);
		}
		return null;
	}

	@Override
	public DesertDTO findByName(String name) {
		if (validString(name)) {
			return this.desertRepository.findByName(name);
		}
		return null;
	}

	@Override
	public double findAreaByName(String name) {
		if (validString(name)) {
			return this.desertRepository.findAreaByName(name);
		}
		return 0;
	}

	@Override
	public DesertDTO findByNameAndCountryAndArea(String name, String country, double area) {
		if (validString(name) && validString(country) && validDouble(area)) {
			return this.desertRepository.findByNameAndCountryAndArea(name, country, area);
		}
		return null;
	}

	@Override
	public int total() {
		return this.desertRepository.total();
	}

}
