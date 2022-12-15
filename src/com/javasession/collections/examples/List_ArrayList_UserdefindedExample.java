package com.javasession.collections.examples;

//import java.util.ArrayList;
//import java.util.List;

//import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class List_ArrayList_UserdefindedExample {

	public static void main(String[] args) {

		List<Hospitals> hospitalsList = new ArrayList<Hospitals>();

		Hospitals h1 = new Hospitals();
		
		Hospitals h2 = new Hospitals();

		hospitalsList.add(h1);
		hospitalsList.add(h2);
		
		System.out.println(hospitalsList);

	}

}
