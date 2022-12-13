package com.javasession.arrays.examples;

public class UserdefndedArrayExample {

	public static void main(String[] args) {

		College[] colleges = new College[2];

//		College college1 = new College();
		colleges[0].collegeId = 12345;
		colleges[0].collegeName = "oxford";

//		College college2 = new College();
		colleges[1].collegeId = 123456;
		colleges[1].collegeName = "cambridge";

//		colleges[0] = college1;
//		colleges[1] = college2;

		System.out.println(colleges);

		for (int a = 0; a < colleges.length; a++) {
			System.out.println(colleges[a].collegeId);
			System.out.println(colleges[a].collegeName);
		}

	}

}
