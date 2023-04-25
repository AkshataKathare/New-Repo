package com.xworkz.electricity.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.xworkz.electricity.constant.ShowRoomLocation;

public class ShowRoomDTO implements Serializable, Comparable<ShowRoomDTO> {

	@Min(value = 3)
	@Max(value = 30)
	private int id;

	@NotNull
	@Size(min = 3, max = 30)
	private String name;

	@NotNull
	private ShowRoomLocation location;

	@Min(value = 3)
	@Max(value = 300)
	private int number;

	@NotNull
	@Past
	private LocalDate openDate;

	@AssertTrue
	private boolean closed;

	public ShowRoomDTO() {
		// TODO Auto-generated constructor stub
	}

	public ShowRoomDTO(int id, String name, ShowRoomLocation location, int number, LocalDate openDate, boolean closed) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.number = number;
		this.openDate = openDate;
		this.closed = closed;
	}

	@Override
	public String toString() {
		return "ShowRoomDTO [id=" + id + ", name=" + name + ", location=" + location + ", number=" + number
				+ ", openDate=" + openDate + ", closed=" + closed + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(closed, id, location, name, number, openDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ShowRoomDTO)) {
			return false;
		}
		ShowRoomDTO other = (ShowRoomDTO) obj;
		return closed == other.closed && id == other.id && location == other.location
				&& Objects.equals(name, other.name) && number == other.number
				&& Objects.equals(openDate, other.openDate);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ShowRoomLocation getLocation() {
		return location;
	}

	public void setLocation(ShowRoomLocation location) {
		this.location = location;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public LocalDate getOpenDate() {
		return openDate;
	}

	public void setOpenDate(LocalDate openDate) {
		this.openDate = openDate;
	}

	public boolean isClosed() {
		return closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}

	@Override
	public int compareTo(ShowRoomDTO o) {
		return this.getName().compareTo(o.getName());
	}

}
