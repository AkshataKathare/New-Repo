package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.xworkz.application.constant.Language;
import com.xworkz.application.constant.OSType;
import com.xworkz.application.constant.Type;

public class ApplicationDTO implements Serializable {

	public ApplicationDTO() {
		System.out.println("No-arg const of ApplicationDTO");
	}

	private String name;
	private double version;
	private LocalDate createdDate;
	private double size;
	private String developedBy;
	private Type type;
	private double price;
	private LocalDate firstVersionReleaseDate;
	private LocalDate currentVersionReleaseDate;
	private LocalDate nextVersionReleaseDate;
	private int trialDays;
	private Language languageUsed;
	private float minProcessorSpeed;
	private float minRamSpaceRequired;
	private boolean internetNeeded;
	private int ageLimit;
	private int noOfDownloads;
	private int rating;
	private OSType osTypeSupported;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getFirstVersionReleaseDate() {
		return firstVersionReleaseDate;
	}

	public void setFirstVersionReleaseDate(LocalDate firstVersionReleaseDate) {
		this.firstVersionReleaseDate = firstVersionReleaseDate;
	}

	public LocalDate getCurrentVersionReleaseDate() {
		return currentVersionReleaseDate;
	}

	public void setCurrentVersionReleaseDate(LocalDate currentVersionReleaseDate) {
		this.currentVersionReleaseDate = currentVersionReleaseDate;
	}

	public LocalDate getNextVersionReleaseDate() {
		return nextVersionReleaseDate;
	}

	public void setNextVersionReleaseDate(LocalDate nextVersionReleaseDate) {
		this.nextVersionReleaseDate = nextVersionReleaseDate;
	}

	public int getTrialDays() {
		return trialDays;
	}

	public void setTrialDays(int trialDays) {
		this.trialDays = trialDays;
	}

	public Language getLanguageUsed() {
		return languageUsed;
	}

	public void setLanguageUsed(Language languageUsed) {
		this.languageUsed = languageUsed;
	}

	public float getMinProcessorSpeed() {
		return minProcessorSpeed;
	}

	public void setMinProcessorSpeed(float minProcessorSpeed) {
		this.minProcessorSpeed = minProcessorSpeed;
	}

	public float getMinRamSpaceRequired() {
		return minRamSpaceRequired;
	}

	public void setMinRamSpaceRequired(float minRamSpaceRequired) {
		this.minRamSpaceRequired = minRamSpaceRequired;
	}

	public boolean isInternetNeeded() {
		return internetNeeded;
	}

	public void setInternetNeeded(boolean internetNeeded) {
		this.internetNeeded = internetNeeded;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}

	public int getNoOfDownloads() {
		return noOfDownloads;
	}

	public void setNoOfDownloads(int noOfDownloads) {
		this.noOfDownloads = noOfDownloads;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public OSType getOsTypeSupported() {
		return osTypeSupported;
	}

	public void setOsTypeSupported(OSType osTypeSupported) {
		this.osTypeSupported = osTypeSupported;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", version=" + version + ", createdDate=" + createdDate + ", size="
				+ size + ", developedBy=" + developedBy + ", type=" + type + ", price=" + price
				+ ", firstVersionReleaseDate=" + firstVersionReleaseDate + ", currentVersionReleaseDate="
				+ currentVersionReleaseDate + ", nextVersionReleaseDate=" + nextVersionReleaseDate + ", trialDays="
				+ trialDays + ", languageUsed=" + languageUsed + ", minProcessorSpeed=" + minProcessorSpeed
				+ ", minRamSpaceRequired=" + minRamSpaceRequired + ", internetNeeded=" + internetNeeded + ", ageLimit="
				+ ageLimit + ", noOfDownloads=" + noOfDownloads + ", rating=" + rating + ", osTypeSupported="
				+ osTypeSupported + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ageLimit, createdDate, currentVersionReleaseDate, developedBy, firstVersionReleaseDate,
				internetNeeded, languageUsed, minProcessorSpeed, minRamSpaceRequired, name, nextVersionReleaseDate,
				noOfDownloads, osTypeSupported, price, rating, size, trialDays, type, version);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ApplicationDTO)) {
			return false;
		}
		ApplicationDTO other = (ApplicationDTO) obj;
		return ageLimit == other.ageLimit && Objects.equals(createdDate, other.createdDate)
				&& Objects.equals(currentVersionReleaseDate, other.currentVersionReleaseDate)
				&& Objects.equals(developedBy, other.developedBy)
				&& Objects.equals(firstVersionReleaseDate, other.firstVersionReleaseDate)
				&& internetNeeded == other.internetNeeded && Objects.equals(languageUsed, other.languageUsed)
				&& Float.floatToIntBits(minProcessorSpeed) == Float.floatToIntBits(other.minProcessorSpeed)
				&& Float.floatToIntBits(minRamSpaceRequired) == Float.floatToIntBits(other.minRamSpaceRequired)
				&& Objects.equals(name, other.name)
				&& Objects.equals(nextVersionReleaseDate, other.nextVersionReleaseDate)
				&& noOfDownloads == other.noOfDownloads && Objects.equals(osTypeSupported, other.osTypeSupported)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && rating == other.rating
				&& Double.doubleToLongBits(size) == Double.doubleToLongBits(other.size)
				&& Objects.equals(trialDays, other.trialDays) && Objects.equals(type, other.type)
				&& Double.doubleToLongBits(version) == Double.doubleToLongBits(other.version);
	}
}
