package com.javasession.interitance.examples;

import com.javasession.interitance.examples.Animal;
//child/derived/sub class
public class Dog extends Animal {

	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println("Dog makes this sound: " + dog.makeSound());
		System.out.println("Dog is an : " + dog.typeOfAniml());

	}

}
