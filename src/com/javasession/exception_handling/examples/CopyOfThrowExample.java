package com.javasession.exception_handling.examples;

public class CopyOfThrowExample {

	public static void main(String[] args) {

		String password = "12347";

		if (password.equals("1234")) {

			System.out.println("Welcome to the applcation.");

		} else {
			System.out
					.println("You have entered wromg password ,Please try again");
		}

		System.out.println("Thank you for the transaction");
	}

}
