package com.javasession.operators.examples;

public class LogicalOperators {

	public static String findBiggerNummber() {

		int a = 100;
		int b = 50;
		int c = 299;

		if (a > b && a > c) {

			return a + " is bigger ";
		}
		if (b > a && b > c) {

			return b + " is bigger ";
		}
		if (c > a && c > b) {

			return c + " is bigger ";
		}
		return null;

	}

	public static void main(String[] args) {

		System.out.println(findBiggerNummber());

	}

}
