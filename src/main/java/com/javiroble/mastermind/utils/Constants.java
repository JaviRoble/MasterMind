package com.javiroble.mastermind.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Constants {
	
	// ActualGameDto
	public static final int DEFAULT_MAX_LENGTH = 5;
	public static final int DEFAULT_TRIES_AMOUNT = 12;
	public static final String[] DEFAULT_WORDS = {"YELMO", "CUPON", "ZOTES", "BARRAS", "TELON", "SEMEN", "LITIO",
			"GRAMO", "COMAS", "APODA", "OITIL", "ANEXO", "ETAPA", "ALIAS", "CERDO", "DATOS", "AEREA", "ZURZO"};

	// Colors
	public static final List<String> BLACK = new ArrayList<>(Arrays.asList(
			"negro", "oscuro", "moreno"
			));
	public static final List<String> WHITE =  new ArrayList<>(Arrays.asList(
			"blanco", "claro", "albo"
			));
	public static final List<String> BLUE =  new ArrayList<>(Arrays.asList(
			"azul", "cian", "añil"
			));
	public static final List<String> RED =  new ArrayList<>(Arrays.asList(
			"rojo", "carmesi", "rosa", "escarlata", "colorado"
			));
	public static final List<String> GREEN =  new ArrayList<>(Arrays.asList(
			"verde", "verdemar", "esmeralda"
			));
	public static final List<String> YELLOW =  new ArrayList<>(Arrays.asList(
			"amarillo", "ambar", "dorado", "naranja"
			));
}
