package com.adsoft.exception;

public class ReferralsException extends Exception {

	private static final long serialVersionUID = 6694276883619295012L;
	private String errorMessage = "";

	public ReferralsException() {
		super();
	}

	public ReferralsException(String message) {
		super(message);
	}

	public ReferralsException(Throwable cause) {
		super(cause);
	}

	public ReferralsException(String message, Throwable cause) {
		super(message, cause);
	}

	public final String getErrorMessage() {
		return errorMessage;
	}

	public final void setErrorMessage(final String errorMsg) {
		this.errorMessage = errorMsg;
	}
}
