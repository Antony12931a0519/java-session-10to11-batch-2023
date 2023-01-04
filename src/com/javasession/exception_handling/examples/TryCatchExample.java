package com.javasession.exception_handling.examples;

public class TryCatchExample {

	public static void main(String[] args) throws Exception {

		System.out.println(2 / 1);

		try {
			System.out.println(1 / 0);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException exw) {
			System.out.println("there is some issue with the code" + exw);
			System.out.println("---------");
			System.out.println(exw.getLocalizedMessage());
			System.out.println("---------");
			System.out.println(exw.getMessage());
			System.out.println("---------");
			exw.printStackTrace();
			throw new Exception();

		} catch (Exception ex) {
			System.out.println("there is some issue with the code" + ex);

			ex.getLocalizedMessage();
			ex.printStackTrace();
			throw new Exception();

		}

		finally {
			System.out.println("Thank you");
		}

	}

}
