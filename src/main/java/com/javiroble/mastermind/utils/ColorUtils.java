package com.javiroble.mastermind.utils;

import java.util.ArrayList;
import java.util.List;

import com.javiroble.mastermind.dto.CustomError;
import com.javiroble.mastermind.dto.GAME_COLOR;

public class ColorUtils {

	public static List<GAME_COLOR> getColors(List<String> words) throws CustomError {
		List<GAME_COLOR> colors = new ArrayList<>();
		for (String word : words) {
			colors.add(getColor(word));
		}
		return colors;
	}

	public static GAME_COLOR getColor(String word) throws CustomError {
		word = word.toLowerCase();
		if (Constants.BLACK.contains(word))
			return GAME_COLOR.BLACK;
		if (Constants.WHITE.contains(word))
			return GAME_COLOR.WHITE;
		if (Constants.BLUE.contains(word))
			return GAME_COLOR.BLUE;
		if (Constants.RED.contains(word))
			return GAME_COLOR.RED;
		if (Constants.GREEN.contains(word))
			return GAME_COLOR.GREEN;
		if (Constants.YELLOW.contains(word))
			return GAME_COLOR.YELLOW;
		throw new CustomError(ErrorConstants.WRONG_COLOR_ERROR_NUM);
	}

}
