package com.xworkz.collect.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class RunnerQueue {

	public static void main(String[] args) {

		Queue<String> elements = new PriorityQueue<>();
		elements.add("Akshata");
		elements.add("Abhishek");
		elements.add("Arpita");
		elements.add("Sagar");
		elements.add("Darshan");
		elements.add("Bindu");
		elements.add("Vikas");

		String ele = elements.remove();
		System.out.println(ele);

		System.out.println(elements);

		String name = elements.peek();
		System.out.println(name);
	}

}
