package com.javasession.interitance.examples;

import com.javasession.interitance.examples.Animal;

public class Cat extends Animal {
	@Override
	String makeSound() {
		return "Mau Mau";

	}

	String typeOfAniml() {

		return "Can be either domestic or wild Aimal";
	}

	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println("Cat makes this sound: " + cat.makeSound());
		System.out.println("Cat is an : " + cat.typeOfAniml());

	}

}
