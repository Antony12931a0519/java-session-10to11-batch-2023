package com.javasession.exception_handling.examples;

public class ThrowExample {

	public static void main(String[] args) throws Exception {

		String password = "12347";
		

		/*if (password.equals("1234")) {

			System.out.println("Welcome to the applcation.");
			
		} else {
			throw new Exception("Password is in correct,Please try again");
		}*/
		
		try{
			
			throw new Exception();
//			System.out.println(1/0);
			
		}finally{
			System.out.println("end");
		}
		

//		System.out.println("Thank you for the transaction");
	}

}
