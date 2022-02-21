package com.javiroble.mastermind.dto;

import com.javiroble.mastermind.utils.ErrorConstants;

public class CustomError extends Throwable {

	public CustomError(int errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public CustomError(int errorCode) {
		this.errorCode = errorCode;
		this.errorMessage = ErrorConstants.MAX_LENGTH_ERROR.get(errorCode);
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
