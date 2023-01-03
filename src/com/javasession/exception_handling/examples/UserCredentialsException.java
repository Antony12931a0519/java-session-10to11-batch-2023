package com.javasession.exception_handling.examples;

public class UserCredentialsException extends Exception {

	private String errorMessage;

	public UserCredentialsException(String errorMessage, Throwable errorCode) {
		super(errorMessage, errorCode);

	}

	private int errorCode;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

}
