package com.javasession.collections.examples;

public class Hospitals {

	private int id;
	private String name;
	private int numberOfBranches;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Hospitals [id=" + id + ", name=" + name + ", numberOfBranches="
				+ numberOfBranches + "]";
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the numberOfBranches
	 */
	public int getNumberOfBranches() {
		return numberOfBranches;
	}

	/**
	 * @param numberOfBranches
	 *            the numberOfBranches to set
	 */
	public void setNumberOfBranches(int numberOfBranches) {
		this.numberOfBranches = numberOfBranches;
	}

}
