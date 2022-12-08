package com.javasession.operators.examples;

public class TernaryOperator {

	public static void main(String[] args) {

		int a = 100;
		int b = 34;

		if (a > b)
			System.out.println(a + "is bigger");
		else
			System.out.println(a + "is bigger");

		String result = a > b ? a + "is bigger" : b + "is bigger";
		System.out.println(result);

	}
}
