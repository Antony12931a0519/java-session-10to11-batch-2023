package com.javasession.readvaluesfromconsole.examples;

import java.util.Scanner;

public class MethodsExample {

	// int a = 10, b = 20;
	int a, b;

	// non static menthd
	int addition(int a, int b) {

		// return a+b;

		return a + b;
	}

	// sttaic method
	static int sub(int a, int b) {

		// return a-b;

		return a - b;
	}

	public static void main(String[] args) {

		// Classname ref = new Classname();

		MethodsExample methodsExample = new MethodsExample();

		System.out.println("Please enter the value for a :");

		Scanner scanner = new Scanner(System.in);

		methodsExample.a = scanner.nextInt();

		System.out.println("Please enter the value for b :");
		methodsExample.b = scanner.nextInt();

		System.out.println("The addition of " + methodsExample.a + " and "
				+ methodsExample.b + " is :"
				+ methodsExample.addition(methodsExample.a, methodsExample.b));
		System.out.println("The sub of" + methodsExample.a + " and "
				+ methodsExample.b + " is :"
				+ sub(methodsExample.a, methodsExample.b));

	}

}
