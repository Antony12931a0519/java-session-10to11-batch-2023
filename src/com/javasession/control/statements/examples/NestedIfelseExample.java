package com.javasession.control.statements.examples;

import java.util.Scanner;

public class NestedIfelseExample {

	// if toatl >=1000 and less than 5000 ===give 5 percent discount

	// if toatl >=5000 and less than 30k ===give 10 percent discount

	// if toatl >=30000 ===give 15 percent discount

	public static void main(String[] args) {

		int totalPrice = 1000;
		int discountPercetage = 5;
		String customerName = "XXXX";

		Scanner scanner = new Scanner(System.in);

		totalPrice = scanner.nextInt();

		if (totalPrice > 0 && totalPrice <= 5000) {
			discountPercetage = 5;
			System.out
					.println(customerName + " got " + discountPercetage + "%");

		} else if (totalPrice > 5000 && totalPrice <= 30000) {
			discountPercetage = 10;
			System.out
					.println(customerName + " got " + discountPercetage + "%");

		} else if (totalPrice > 30000) {
			discountPercetage = 15;
			System.out
					.println(customerName + " got " + discountPercetage + "%");

		} else {
			System.out.println("You are not eligible for any discount");
		}

	}

}
