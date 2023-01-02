package com.javasession.collections.examples;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetWithSortedOrderExample {

	public static void main(String[] args) {

		/*
		 * List<Integer> numbers = new ArrayList<>();
		 * 
		 * numbers.add(120); numbers.add(12330); numbers.add(3120);
		 * numbers.add(1204); numbers.add(20);
		 */

		// Set<Integer> numbers = new HashSet<>();

		Set<Integer> numbers = new TreeSet<>();
		numbers.add(3120);
		numbers.add(12330);
		numbers.add(20);
		numbers.add(120);
		numbers.add(1204);

		System.out.println(numbers);

	}

}
