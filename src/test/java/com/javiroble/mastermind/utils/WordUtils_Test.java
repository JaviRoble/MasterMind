package com.javiroble.mastermind.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WordUtils_Test {

	@DisplayName("Get Random Word")
	@Test
	public void getRandomWord_Ok() {
		String word = WordUtils.getRandomWord();
		assertNotNull(word);
		assertTrue(word.length()<=Constants.DEFAULT_MAX_LENGTH);
	}
}
