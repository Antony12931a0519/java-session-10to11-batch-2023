package com.javasession.exception_handling.examples;

public class TryCatchExample {

	public static void main(String[] args) {

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
			
			log.nfo
			log.error
			log.debug
		} catch (Exception ex) {
			System.out.println("there is some issue with the code" + ex);

			ex.getLocalizedMessage();
			ex.printStackTrace();
			
			log.error(exw);
		}

		System.out.println(1 / 1);
	}

}
