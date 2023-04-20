package com.xworkz.collection.map;

import java.util.HashMap;
import java.util.Map;

public class SoftwareDetail {

	public static void main(String[] args) {

		Map<Integer, String> softwares = new HashMap<>();
		System.out.println("Insertion");
		softwares.put(1, "macOS");
		softwares.put(2, "Microsoft");
		softwares.put(3, "Linux");
		softwares.put(4, "Window11");
		softwares.put(5, "Google Drive");
		softwares.put(6, "Asana");
		softwares.put(7, "Quicken");
		softwares.put(8, "Adobe Photoshop");
		softwares.put(9, "Windows Disk Cleanup");
		softwares.put(10, "IBM");
		softwares.put(null, "IBM");
		softwares.put(null, "IBM");
		softwares.put(10, "Intel");

		System.out.println(softwares);

		System.out.println("Read");
		String software = softwares.get(10);
		System.out.println(software);

		softwares.replace(5, "Google Drive", "Google");
		System.out.println(softwares);

		System.out.println("Deletion");
		softwares.clear();
		System.out.println(softwares);
	}

}
