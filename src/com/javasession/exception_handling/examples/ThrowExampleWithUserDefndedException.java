package com.javasession.exception_handling.examples;

public class ThrowExampleWithUserDefndedException {

	public static void main(String[] args) throws Exception {

		String password = "12347";

		if (password.equals("1234")) {

			System.out.println("Welcome to the applcation.");

		} else {
			throw new UserCredentialsException(
					"Password is in correct,Please try again", new Exception("200"));
			
		}

		System.out.println("Thank you for the transaction");
	}

}
