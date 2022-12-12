package com.javasession.control.statements.examples;

public class SwitchExample {

	public static void main(String[] args) {

		int option = 0;

		switch (option) {

		case 1:
			addition(1, 2);
			break;
		case 2:
			subtraction(1, 2);
			break;
		case 3:
			mul(1, 2);
			break;
		case 4:
			div(1, 2);
			break;

		default:
			System.out.println("No option selected.");
			break;

		}

		String options = "addition";

		switch (options) {

		case "addition":
			addition(1, 2);
			break;

		default:
			System.out.println("No option selected.");
			break;

		}

	}

	private static void div(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i / j);

	}

	private static void mul(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i * j);

	}

	private static void subtraction(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i - j);

	}

	private static void addition(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i + j);

	}

}
