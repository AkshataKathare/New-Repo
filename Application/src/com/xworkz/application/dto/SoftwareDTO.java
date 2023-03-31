package com.xworkz.application.dto;

import java.io.Serializable;
import java.util.Objects;

public class SoftwareDTO implements Serializable {

	private int id;
	private String name;
	private String version;
	private String developedBy;

	public SoftwareDTO() {
		System.out.println("No arg const in SoftwareDTO");
	}

	public SoftwareDTO(int id, String name, String version, String developedBy) {
		super();
		this.id = id;
		this.name = name;
		this.version = version;
		this.developedBy = developedBy;
	}

	@Override
	public String toString() {
		return "SoftwareDTO [id=" + id + ", name=" + name + ", version=" + version + ", developedBy=" + developedBy
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof SoftwareDTO)) {
			return false;
		}
		SoftwareDTO other = (SoftwareDTO) obj;
		return id == other.id && Objects.equals(name, other.name);
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

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

}
