package com.javasession.arrays.examples;

public class PredefinedArrayExamples {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 56 };

//		String[] names = new String[3];
		
		String[] names = {"fwefew","ewfwf","dsfs"};

//		names[0] = "kjo";
//		names[1] = "kjo";
//		names[2] = "kjo";
//		names[4] = "kjo";
//		names[5] = "kjo";

		System.out.println(names);
		
		for (int a = 0; a < names.length; a++) {
			System.out.println(names[a]);
		}
		
		/*
		 * System.out.println(numbers);
		 * 
		 * System.out.println(numbers.length); for (int a = 0; a < 6; a++) {
		 * 
		 * System.out.println(numbers[a]); }
		 */

	}

}
