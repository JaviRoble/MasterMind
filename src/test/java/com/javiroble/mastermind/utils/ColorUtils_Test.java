package com.javiroble.mastermind.utils;

import com.javiroble.mastermind.dto.CustomError;
import com.javiroble.mastermind.dto.GAME_COLOR;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ColorUtils_Test {

    @DisplayName("Get Color - Black")
    @ParameterizedTest
    @CsvSource({"Negro", "negro", "oscuro", "moreno"})
    public void getColor_Black(String word) throws CustomError {
        GAME_COLOR color = ColorUtils.getColor(word);
        assertNotNull(color);
        assertEquals(GAME_COLOR.BLACK, color);
    }

    @DisplayName("Get Color - White")
    @ParameterizedTest
    @CsvSource({"Blanco", "blanco", "claro", "albo"})
    public void getColor_White(String word) throws CustomError {
        GAME_COLOR color = ColorUtils.getColor(word);
        assertNotNull(color);
        assertEquals(GAME_COLOR.WHITE, color);
    }

    @DisplayName("Get Color - Blue")
    @ParameterizedTest
    @CsvSource({"Azul", "azul", "cian", "añil"})
    public void getColor_Blue(String word) throws CustomError {
        GAME_COLOR color = ColorUtils.getColor(word);
        assertNotNull(color);
        assertEquals(GAME_COLOR.BLUE, color);
    }

    @DisplayName("Get Color - Red")
    @ParameterizedTest
    @CsvSource({"Rojo", "rojo", "carmesi", "rosa", "escarlata", "colorado"})
    public void getColor_Red(String word) throws CustomError {
        GAME_COLOR color = ColorUtils.getColor(word);
        assertNotNull(color);
        assertEquals(GAME_COLOR.RED, color);
    }

    @DisplayName("Get Color - Green")
    @ParameterizedTest
    @CsvSource({"Verde", "verde", "verdemar", "esmeralda"})
    public void getColor_Green(String word) throws CustomError {
        GAME_COLOR color = ColorUtils.getColor(word);
        assertNotNull(color);
        assertEquals(GAME_COLOR.GREEN, color);
    }

    @DisplayName("Get Color - Yellow")
    @ParameterizedTest
    @CsvSource({"Amarillo", "amarillo", "ambar", "dorado", "naranja"})
    public void getColor_Yellow(String word) throws CustomError {
        GAME_COLOR color = ColorUtils.getColor(word);
        assertNotNull(color);
        assertEquals(GAME_COLOR.YELLOW, color);
    }

    @DisplayName("Get Color - Unknown")
    @Test
    public void getColor_Unknown() {
        CustomError error = assertThrows(CustomError.class, () -> ColorUtils.getColor("unknown"));
        assertNotNull(error);
        assertEquals(ErrorConstants.WRONG_COLOR_ERROR_NUM, error.getErrorCode());
        assertEquals(ErrorConstants.WRONG_COLOR_ERROR_DESC, error.getErrorMessage());
    }

    @DisplayName("Get Colors - Ok")
    @ParameterizedTest
    @CsvSource({"Amarillo,negro,rojo,rosa,verde",
            "rojo,blanco,rojo,blanco,rojo",
            "ambar,verde,verde,azul,azul",
            "dorado,azul,amarillo,negro,azul",
            "naranja,rojo,verde,verde,amarillo"})
    public void getColors(String color1, String color2, String color3, String color4, String color5) throws CustomError {
        List<GAME_COLOR> colorList = ColorUtils.getColors(getWordList(color1, color2, color3, color4, color5));
        assertEquals(ColorUtils.getColor(color1), colorList.get(0));
        assertEquals(ColorUtils.getColor(color2), colorList.get(1));
        assertEquals(ColorUtils.getColor(color3), colorList.get(2));
        assertEquals(ColorUtils.getColor(color4), colorList.get(3));
        assertEquals(ColorUtils.getColor(color5), colorList.get(4));
    }

    // Test Utils
    private List<String> getWordList(String color1, String color2, String color3, String color4, String color5){
        List<String> wordList = new ArrayList<>();
        wordList.add(color1);
        wordList.add(color2);
        wordList.add(color3);
        wordList.add(color4);
        wordList.add(color5);
        return wordList;
    }
}
