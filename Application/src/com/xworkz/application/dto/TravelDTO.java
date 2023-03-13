package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class TravelDTO implements Serializable {

	private String destination;
	private String busName;
	private int travelCharge;
	private int noOfTravellers;
	private LocalDate dateOfReachingDestiny;

	public TravelDTO() {
		System.out.println("No-arg const of TravelDTO");
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public int getTravelCharge() {
		return travelCharge;
	}

	public void setTravelCharge(int travelCharge) {
		this.travelCharge = travelCharge;
	}

	public int getNoOfTravellers() {
		return noOfTravellers;
	}

	public void setNoOfTravellers(int noOfTravellers) {
		this.noOfTravellers = noOfTravellers;
	}

	public LocalDate getDateOfReachingDestiny() {
		return dateOfReachingDestiny;
	}

	public void setDateOfReachingDestiny(LocalDate dateOfReachingDestiny) {
		this.dateOfReachingDestiny = dateOfReachingDestiny;
	}

	@Override
	public String toString() {
		return "TravelDTO [destination=" + destination + ", busName=" + busName + ", travelCharge=" + travelCharge
				+ ", noOfTravellers=" + noOfTravellers + ", dateOfReachingDestiny=" + dateOfReachingDestiny + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(busName, dateOfReachingDestiny, destination, noOfTravellers, travelCharge);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof TravelDTO)) {
			return false;
		}
		TravelDTO other = (TravelDTO) obj;
		return Objects.equals(busName, other.busName)
				&& Objects.equals(dateOfReachingDestiny, other.dateOfReachingDestiny)
				&& Objects.equals(destination, other.destination) && noOfTravellers == other.noOfTravellers
				&& travelCharge == other.travelCharge;
	}

}
