package com.javasession.exception_handling.examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CopyOfCopyOfCompleteExceptionHandlingExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = 0;
		int b = 0;

		try {
			a = scanner.nextInt();
			b = scanner.nextInt();
		} finally {
			scanner = null;
		}

		System.out.println("output: " + a / b);

	}
}
