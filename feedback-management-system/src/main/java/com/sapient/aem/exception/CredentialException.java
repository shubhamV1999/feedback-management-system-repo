package com.sapient.aem.exception;

public class CredentialException extends Exception {
	private static final long serialVersionUID = 1L;

	public CredentialException() {
		super("Credential Exception");
	}

	public CredentialException(String message) {

		super(message);

	}

	public CredentialException(String message,Throwable t) {

		super(message,t);

	}

}
