package com.xworkz.association.boot;

import com.xworkz.association.things.Address;
import com.xworkz.association.things.Area;
import com.xworkz.association.things.City;
import com.xworkz.association.things.Company;
import com.xworkz.association.things.Country;
import com.xworkz.association.things.Mall;
import com.xworkz.association.things.Security;
import com.xworkz.association.things.State;

public class MallRunner {

	public static void main(String[] args) {

		Area area = new Area();
		area.setPopulation(25000);
		area.setStreet(10);

		City city = new City();
		city.setArea(area);

		city.setDistrict("Dharwad");
		city.setCapital(true);

		State state = new State();
		state.setCMName("Basavaraj Bommai");
		state.setCity(city);

		Country country = new Country();
		country.setPresident("Draupadi Murmu");
		country.setDev(true);
		country.setState(state);

		Address address = new Address();
		address.setCountry(country);

		Company company = new Company();
		company.setSince(1996);
		company.setAddress(address);

		Security security = new Security();
		security.setNum(50);
		security.setheadStaff("Darshan");
		security.setCompany(company);

		Mall mall = new Mall();
		mall.setFloors(5);
		mall.setSecurity(security);

		mall.display();

	}

}
