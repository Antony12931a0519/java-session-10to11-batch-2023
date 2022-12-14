package com.javasession.arrays.examples;

public class UserdefndedArrayExample {

	public static void main(String[] args) {

		College[] colleges = new College[2];

		College college1 = new College();
//		college1.collegeId = 12345;
//		college1.collegeName = "oxford";
		college1.setCollegeId(12345);
		college1.setIntial('A');
		college1.setCollegeName("Abc");
		

		College college2 = new College();
		college2.collegeId = 123456;
		college2.collegeName = "cambridge";

		colleges[0] = college1;
		colleges[1] = college2;

		System.out.println(colleges);

		for (int a = 0; a < colleges.length; a++) {
			System.out.println(colleges[a].collegeId);
			System.out.println(colleges[a].collegeName);
			
			System.out.println(colleges[a].getCollegeId());
			System.out.println(colleges[a].getCollegeName());
			
			
		}

	}

}
