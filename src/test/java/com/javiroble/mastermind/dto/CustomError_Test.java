package com.javiroble.mastermind.dto;

import com.javiroble.mastermind.utils.Constants;
import com.javiroble.mastermind.utils.ErrorConstants;
import com.javiroble.mastermind.utils.WordUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CustomError_Test {

    @DisplayName("Construct Default Error - Ok")
    @Test
    public void constructCustomError() {
        CustomError error = new CustomError();
        assertEquals(ErrorConstants.CUSTOM_ERROR_NUM, error.getErrorCode());
        assertEquals(ErrorConstants.CUSTOM_ERROR_DESC, error.getErrorMessage());
    }

    @DisplayName("Construct Custom Error - Ok")
    @Test
    public void constructCustomError_withErrorMessage() {
        CustomError error = new CustomError("Mensaje definido");
        assertEquals(ErrorConstants.CUSTOM_ERROR_NUM, error.getErrorCode());
        assertEquals("Mensaje definido", error.getErrorMessage());
    }

    @DisplayName("Construct Error - Ok")
    @ParameterizedTest
    @CsvSource({"4,Color erróneo",
            "5,La longitud de la palabra escogida es mayor a 5",
            "6,No se admite más de 1 palabra",
            "99,Error inesperado",
            "28,Error inesperado"})
    public void constructError_withErrorCode(int errorCode, String errorMessage){
        CustomError error = new CustomError(errorCode);
        assertEquals(errorCode, error.getErrorCode());
        assertEquals(errorMessage, error.getErrorMessage());
        error = new CustomError(errorCode, errorMessage);
        assertEquals(errorCode, error.getErrorCode());
        assertEquals(errorMessage, error.getErrorMessage());
    }
}
