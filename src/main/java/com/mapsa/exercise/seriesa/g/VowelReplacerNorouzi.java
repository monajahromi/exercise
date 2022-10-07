package com.mapsa.exercise.seriesa.g;

public class VowelReplacerNorouzi {
	public static String replaceVowels(String str, char ch) {
		return str.replaceAll("[aeiou]", "" + ch);

	}
}