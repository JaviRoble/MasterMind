package com.javiroble.mastermind.utils;

import java.util.HashMap;
import java.util.Map;

public class ErrorConstants {
	
	public static final Map<Integer,String> MAX_LENGTH_ERROR = new HashMap<>();

	// Wrong Color Error
	public static final int WRONG_COLOR_ERROR_NUM = 4;
	public static final String WRONG_COLOR_ERROR_DESC = "Color erróneo";
	
	// Max length Error
	public static final int MAX_LENGTH_ERROR_NUM = 5;
	public static final String MAX_LENGTH_ERROR_DESC = "La longitud de la palabra escogida es mayor a 5";
	
	// Max Words Amount Error
	public static final int MAX_WORDS_AMOUNT_ERROR_NUM = 6;
	public static final String MAX_WORDS_AMOUNT_ERROR_DESC = "No se admite más de 1 palabra";
	
	// Custom error
	public static final int CUSTOM_ERROR_NUM = 99;
	public static final String CUSTOM_ERROR_DESC = "Error inesperado";
	
	static {
		MAX_LENGTH_ERROR.put(WRONG_COLOR_ERROR_NUM, WRONG_COLOR_ERROR_DESC);
		MAX_LENGTH_ERROR.put(MAX_LENGTH_ERROR_NUM, MAX_LENGTH_ERROR_DESC);
		MAX_LENGTH_ERROR.put(MAX_WORDS_AMOUNT_ERROR_NUM, MAX_WORDS_AMOUNT_ERROR_DESC);
		MAX_LENGTH_ERROR.put(CUSTOM_ERROR_NUM, MAX_LENGTH_ERROR_DESC);
    }

}
