package com.mapsa.exercise.seriesa.h;

public class ValidZipCodeJafarian {
	public static boolean isValid(String zip) {
		if (zip.matches("\\d+")){
			if (zip.length()==5)
				return true;
			else return false;
		}
		return false;

	}

}