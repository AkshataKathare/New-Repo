package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class ApplicationDTO implements Serializable {

	private String name;
	private String createdBy;
	private int since;
	private LocalDate launchDate;
	private boolean mobileApp;

	public ApplicationDTO() {
		System.out.println("No-arg const in Application");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}

	public LocalDate getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(LocalDate launchDate) {
		this.launchDate = launchDate;
	}

	public boolean isMobileApp() {
		return mobileApp;
	}

	public void setMobileApp(boolean mobileApp) {
		this.mobileApp = mobileApp;
	}

	@Override
	public String toString() {
		return "Application [name=" + name + ", createdBy=" + createdBy + ", since=" + since + ", launchDate="
				+ launchDate + ", mobileApp=" + mobileApp + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdBy, launchDate, mobileApp, name, since);
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
		return Objects.equals(createdBy, other.createdBy) && Objects.equals(launchDate, other.launchDate)
				&& mobileApp == other.mobileApp && Objects.equals(name, other.name) && since == other.since;
	}

}
