package com.javasession.exception_handling.examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompleteExceptionHandlingExample {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		int a = 0;
		final int amount = 1000;
		final String expectedPassword = "1234";
		String actualPassword = null;

		try {
			System.out
					.println("Enter the amount to be withdrawn from account:");
			a = scanner.nextInt();

			System.out
					.println("Please enter the pin number associated with  the account:");
			actualPassword = scanner.next();

			while (!expectedPassword.equals(actualPassword)) {
				System.out.println("Password is not matching,Please try again");

				System.out
						.println("Please re-enter the correct pin number associated with  the account:");
				actualPassword = scanner.next();

			}
			/*
			 * if (!expectedPassword.equals(actualPassword)) {
			 * 
			 * 
			 * }
			 */
			System.out.println("Remaining Amount in the account is :"
					+ (amount - a));
			System.out
					.println("Transaction is processed successfuly,Thank you.");

		} catch (InputMismatchException ime) {
			System.out.println("Please enter expected value");

		} finally {

			scanner = null;
		}

	}
}
