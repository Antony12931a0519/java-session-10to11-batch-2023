package com.javasession.collections.examples;

//import java.util.ArrayList;
//import java.util.List;

//import java.util.ArrayList;

import java.util.*;

public class List_ArrayList_PredefindedExample {

	public static void main(String[] args) {

		List<Double> numbers = new ArrayList<>();
		numbers.add(123.0);
		numbers.add(123.0);
		numbers.add(123.0);
		numbers.add(123.0);
		numbers.add(123.0);
		numbers.add(123.0);
		numbers.add(123.0);
		numbers.add(123.0);
		numbers.add(123.0);
		numbers.add(123.0);
		numbers.add(123.0);
		numbers.add(123.0);
		numbers.add(123.0);
		numbers.add(123.0);
		numbers.add(123.0);
		numbers.add(123.0);
		numbers.add(123.0);
		numbers.add(123.0);
		numbers.add(123.0);
		numbers.add(123.0);
		numbers.add(123.0);
		
		
		numbers.add(0, 1.0);
//		numbers.clear();
		boolean out1= numbers.contains(1.0);
		boolean out2=numbers.contains("a");
		
		System.out.println(out1);
		System.out.println(out2);
		
//		numbers.
		
		
		
		System.out.println(numbers);

		System.out.println(numbers.size());
		for (Double number : numbers) {
			System.out.println(number);
		}

	}

}
