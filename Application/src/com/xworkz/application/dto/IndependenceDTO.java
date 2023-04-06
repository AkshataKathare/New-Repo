package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class IndependenceDTO implements Serializable {

	private LocalDate gotIndependenceOn;
	private String month;
	private String mainFreedomFighter;
	private String gotFreeFrom;
	private int years;

	public IndependenceDTO() {
		System.out.println("No-arg const of IndependenceDTO");
	}

	public IndependenceDTO(LocalDate gotIndependenceOn, String month, String mainFreedomFighter, String gotFreeFrom,
			int years) {
		super();
		this.gotIndependenceOn = gotIndependenceOn;
		this.month = month;
		this.mainFreedomFighter = mainFreedomFighter;
		this.gotFreeFrom = gotFreeFrom;
		this.years = years;
	}

	@Override
	public String toString() {
		return "IndependenceDTO [gotIndependenceOn=" + gotIndependenceOn + ", month=" + month + ", mainFreedomFighter="
				+ mainFreedomFighter + ", gotFreeFrom=" + gotFreeFrom + ", years=" + years + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(gotFreeFrom, gotIndependenceOn, mainFreedomFighter, month, years);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof IndependenceDTO)) {
			return false;
		}
		IndependenceDTO other = (IndependenceDTO) obj;
		return Objects.equals(gotFreeFrom, other.gotFreeFrom)
				&& Objects.equals(gotIndependenceOn, other.gotIndependenceOn)
				&& Objects.equals(mainFreedomFighter, other.mainFreedomFighter) && Objects.equals(month, other.month)
				&& years == other.years;
	}

	public LocalDate getGotIndependenceOn() {
		return gotIndependenceOn;
	}

	public void setGotIndependenceOn(LocalDate gotIndependenceOn) {
		this.gotIndependenceOn = gotIndependenceOn;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getMainFreedomFighter() {
		return mainFreedomFighter;
	}

	public void setMainFreedomFighter(String mainFreedomFighter) {
		this.mainFreedomFighter = mainFreedomFighter;
	}

	public String getGotFreeFrom() {
		return gotFreeFrom;
	}

	public void setGotFreeFrom(String gotFreeFrom) {
		this.gotFreeFrom = gotFreeFrom;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

}
