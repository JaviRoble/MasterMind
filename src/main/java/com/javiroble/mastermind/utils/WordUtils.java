package com.javiroble.mastermind.utils;

public class WordUtils {
	
	public static String getRandomWord() {
		return Constants.DEFAULT_WORDS[(int) (Math.random()*Constants.DEFAULT_WORDS.length)];
	}

}
