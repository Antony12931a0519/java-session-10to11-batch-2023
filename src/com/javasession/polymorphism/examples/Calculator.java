package com.javasession.polymorphism.examples;

public class Calculator {
	
	public static  int addition(int a,int b){
		return a+b;
		
	}
	
	public static float addition(int a,float b){
		return a+b;
		
	}
	
	public static void main(String[] args) {
		
		addition(1,2);
		addition(1,2.0f);
		
		System.out.println(addition(1,2));
		
//		save(User usr);
//		save(Admin usr);
		
		
		
	}

}
