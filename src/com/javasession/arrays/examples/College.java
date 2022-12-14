package com.javasession.arrays.examples;

public class College {

	int collegeId;
	String collegeName;
	char intial;

	public char getIntial() {
		return intial;
	}

	public void setIntial(char intial) {
		this.intial = intial;
	}

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName="
				+ collegeName + "]";
	}

	// @Override
	// public String toString() {
	// return "College details are collegeid is"+collegeId
	// +"  and collegeName is  "+collegeName;
	// }

}
