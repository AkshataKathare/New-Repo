package com.xworkz.association.things;

public class Isro {
	public String[] locations;
	public int[] satelliteNos;
	public Scientist[] scientists;

	public Isro() {
		System.out.println("No-arg constructor of Isro");
	}

	public void setLocations(String[] locations) {
		this.locations = locations;
	}

	public void setSatelliteNos(int[] satelliteNos) {
		this.satelliteNos = satelliteNos;
	}

	public void setScientists(Scientist[] scientists) {
		this.scientists = scientists;
	}

	public void display() {
		System.out.println("Details of Isro");

		if (this.locations != null) {
			for (int seq = 0; seq < this.locations.length; seq++) {
				String element = this.locations[seq];
				System.out.println("Location :" + element + " at index " + seq);
			}

		} else {
			System.err.println("this.locations is not pointing to any memory..");
		}
		if (this.satelliteNos != null) {
			for (int seq = 0; seq < this.satelliteNos.length; seq++) {
				int element = this.satelliteNos[seq];
				System.out.println("Satellite number :" + element + " at index " + seq);
			}

		} else {
			System.err.println("this.satelliteNos is not pointing to any memory..");
		}
		if (this.scientists != null) {
			for (int seq = 0; seq < this.scientists.length; seq++) {
				Scientist element = this.scientists[seq];
				System.out.println("At index no :" + seq);
				element.display();
			}

		} else {
			System.err.println("this.scientists is not pointing to any memory..");

		}

	}

}
