package com.javasession.variables.examples;

public class VariablesTypeExample {
//global variabes
	int age = 100;// non static

	double weight = 45.7;

	static String name = "Anthony";
	static char initial = 'A';
	
	final int ageLimitForVoting=18;

	public static void main(String[] args) {
		//local variables
		String address = "Hyderabad";
		
		name = "Anthony Sampath";
		
		System.out.println("Address is :"+address);

		VariablesTypeExample ref = new VariablesTypeExample();

		System.out.println("The value for age is :" + ref.age);
		System.out.println("The value for age is :" + ref.weight);

		System.out.println("The value for name is :" + name);
		System.out.println("The value for initial is :" + initial);

		System.out.println("The value for name is :" + ref.name);
		System.out.println("The value for initial is :" + ref.initial);

		System.out.println("The value for name is :"
				+ VariablesTypeExample.name);
		System.out.println("The value for initial is :"
				+ VariablesTypeExample.initial);

	}

}
