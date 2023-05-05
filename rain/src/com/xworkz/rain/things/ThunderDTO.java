package com.xworkz.rain.things;

import java.io.Serializable;
import java.util.Objects;

public class ThunderDTO implements Serializable {
	private boolean danger;
	private double time;

	public ThunderDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ThunderDTO [danger=" + danger + ", time=" + time + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(danger);
	}

	public boolean isDanger() {
		return danger;
	}

	public void setDanger(boolean danger) {
		this.danger = danger;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ThunderDTO)) {
			return false;
		}
		ThunderDTO other = (ThunderDTO) obj;
		return danger == other.danger;
	}

}
