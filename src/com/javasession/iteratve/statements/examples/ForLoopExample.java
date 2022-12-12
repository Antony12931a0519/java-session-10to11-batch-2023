package com.javasession.iteratve.statements.examples;

public class ForLoopExample {

	// I love you

	public static void main(String[] args) {

		// for (int i = 1; i <= 100; i++) {
		//
		// System.out.println("I love you");
		// }

		for (int i = 1; i <= 10; i++) {

			System.out.println(2 + "*" + i + "=" + (2 * i));//2*1=2
		}
		
		
		System.out.println("-----------------------------");
		for (int i = 1; i <= 10; i++) {

			System.out.println(5 + "*" + i + "=" + (5 * i));//2*1=2
		}
		System.out.println("-----------------------------");
		for (int i = 10; i >= 1; i--) {

			System.out.println(5 + "*" + i + "=" + (5 * i));//2*1=2
		}

	}

}
