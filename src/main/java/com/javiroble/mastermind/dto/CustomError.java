package com.javiroble.mastermind.dto;

import com.javiroble.mastermind.utils.ErrorConstants;

public class CustomError extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomError() {
		this.errorCode = ErrorConstants.CUSTOM_ERROR_NUM;
		this.errorMessage = ErrorConstants.CUSTOM_ERROR_DESC;
	}

	public CustomError(int errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public CustomError(int errorCode) {
		this.errorCode = errorCode;
		this.errorMessage = (ErrorConstants.ERRORS.containsKey(errorCode) ? ErrorConstants.ERRORS.get(errorCode) : ErrorConstants.CUSTOM_ERROR_DESC);
	}

	public CustomError(String errorMessage) {
		this.errorCode = ErrorConstants.CUSTOM_ERROR_NUM;
		this.errorMessage = errorMessage;
	}

	private int errorCode;
	private String errorMessage;
	
	public int getErrorCode() { return errorCode; }
	public String getErrorMessage() { return errorMessage; }
	
}
