package com.javasession.operators.examples;

public class LogicalOperators_2 {
	
	//and--> T T --T  rest all combinations are false.
	//or-->F F --F  rest all combinations are true.

	public static String findBiggerNummber() {

		int person1Age = 100;

		if (person1Age < 50 || person1Age > 40) {

			return "You are eligible ";
		}
		return null;

	}

	public static void main(String[] args) {

		System.out.println(findBiggerNummber());

	}

}
