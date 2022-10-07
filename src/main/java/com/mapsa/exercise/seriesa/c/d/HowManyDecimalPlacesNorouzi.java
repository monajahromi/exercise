package com.mapsa.exercise.seriesa.c.d;

public class HowManyDecimalPlacesNorouzi {

	public static int getDecimalPlaces(String num) {
		return num.contains(".") ? (num.length() - num.indexOf(".") - 1) : 0;

	}
}