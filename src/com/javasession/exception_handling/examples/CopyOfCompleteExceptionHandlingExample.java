package com.javasession.exception_handling.examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CopyOfCompleteExceptionHandlingExample {

	public static void main(String[] args) {

		// finally {
		// scanner = null;
		// }

		Scanner scanner = new Scanner(System.in);
		int a = 0;
		int b = 0;

		System.out.println("output: " + a / b);

	}
}
