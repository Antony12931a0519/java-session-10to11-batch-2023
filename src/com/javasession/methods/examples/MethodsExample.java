package com.javasession.methods.examples;

import com.javasession.interitance.examples.Animal;

public class MethodsExample extends Animal {

//	int a = 10, b = 20;
	int a,b;

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

		System.out.println("The addition of " + methodsExample.a + " and "
				+ methodsExample.b + " is :"
				+ methodsExample.addition(methodsExample.a, methodsExample.b));
		System.out.println("The sub of" + methodsExample.a + " and "
				+ methodsExample.b + " is :"
				+ sub(methodsExample.a, methodsExample.b));
		
		methodsExample.showMessage();

	}

}
