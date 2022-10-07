package com.mapsa.exercise.seriesa.h;

public class ValidZipCodeNorouzi {
	public static boolean isValid(String zip) {
		if (zip.length() != 5) return false;

		for(int i=0; i<zip.length(); i++) {
			if(!Character.isDigit(zip.charAt(i)))
				return false;
		}
		return true;

	}
}