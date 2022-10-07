package com.mapsa.exercise.seriesa.n;

public class RepeatingLettersNTimesNorouzi {
	public static String repeat(String str, int n) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < n; j++) {
				result += str.charAt(i);
			}
		}
		return result;
	}
}