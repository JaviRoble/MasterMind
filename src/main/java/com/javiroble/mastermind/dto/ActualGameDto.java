package com.javiroble.mastermind.dto;

import java.util.List;

import com.javiroble.mastermind.utils.ColorUtils;
import com.javiroble.mastermind.utils.Constants;
import com.javiroble.mastermind.utils.ErrorConstants;
import com.javiroble.mastermind.utils.WordUtils;

public class ActualGameDto {
	
	private char[] word;
	private List<GAME_COLOR> color;
	private boolean isColor = false;
	private boolean isHard = true;
	private int triesAmount = Constants.DEFAULT_TRIES_AMOUNT;
	private List<GameTriesDto> tries;
	private boolean isWon = false;
	private boolean isFinished = false;
	
	//CONSTRUCTORS
	public ActualGameDto() throws CustomError {
		this.word = WordUtils.getRandomWord().toCharArray();
	}
	public ActualGameDto(String word) throws CustomError {
		if (word.length() > Constants.DEFAULT_MAX_LENGTH) throw new CustomError(ErrorConstants.MAX_LENGTH_ERROR_NUM);
		this.word = word.toCharArray();
	}
	public ActualGameDto(String word, int triesAmount) throws CustomError {
		if (word.length() > Constants.DEFAULT_MAX_LENGTH) throw new CustomError(ErrorConstants.MAX_LENGTH_ERROR_NUM);
		this.word = word.toCharArray();
		this.triesAmount = triesAmount;
	}
	public ActualGameDto(String word, int triesAmount, int maxLength) throws CustomError {
		if (word.length() > maxLength) throw new CustomError(ErrorConstants.MAX_LENGTH_ERROR_NUM);
		this.word = word.toCharArray();
		this.triesAmount = triesAmount;
	}
	public ActualGameDto(List<String> words, boolean isColor) throws CustomError {
		if (isColor) {
			if (words.size() > Constants.DEFAULT_MAX_LENGTH) throw new CustomError(ErrorConstants.MAX_LENGTH_ERROR_NUM);
			this.color = ColorUtils.getColors(words);
			this.isColor = true;
		} else throw new CustomError(ErrorConstants.MAX_WORDS_AMOUNT_ERROR_NUM);
	}
	public ActualGameDto(List<GAME_COLOR> color) throws CustomError {
		if (color.size() > Constants.DEFAULT_MAX_LENGTH) throw new CustomError(ErrorConstants.MAX_LENGTH_ERROR_NUM);
		this.color = color;
		this.isColor = true;
	}
	public ActualGameDto(List<GAME_COLOR> color, int triesAmount) throws CustomError {
		if (color.size() > Constants.DEFAULT_MAX_LENGTH) throw new CustomError(ErrorConstants.MAX_LENGTH_ERROR_NUM);
		this.color = color;
		this.triesAmount = triesAmount;
		this.isColor = true;
	}
	public ActualGameDto(List<GAME_COLOR> color, int triesAmount, int maxLength) throws CustomError {
		if (color.size() > maxLength) throw new CustomError(ErrorConstants.MAX_LENGTH_ERROR_NUM);
		this.color = color;
		this.triesAmount = triesAmount;
		this.isColor = true;
	}
	
	// GETTERS
	public char[] getWord() {
		return word;
	}
	public List<GAME_COLOR> getColor() {
		return color;
	}
	public boolean isColor() {
		return isColor;
	}
	public boolean isHard() {
		return isHard;
	}
	public int getTriesAmount() {
		return triesAmount;
	}
	public List<GameTriesDto> getTries() {
		return tries;
	}
	public boolean isWon() {
		return isWon;
	}
	public boolean isFinished() {
		return isFinished;
	}

	// SETTERS
	public void setTries(GameTriesDto tries) {
		this.tries.add(tries);
		if (this.tries.size() == this.triesAmount) this.isFinished = true; // TODO: lógica de decisión de victoria o derrota (en servicio)
	}
	public void won() {
		this.isWon = true;
	}

}
 