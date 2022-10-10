package com.mapsa.exercise.seriesa.n;

public class RepeatingLettersNTimes {
	public static String repeat(String str, int n) {
		String[] splited = str.split("(?!^)");
		String joined = "";
		for (int i = 0; i <splited.length ; i++) {
			for (int j = 0; j < n; j++) {
				joined+=splited[i];

			}

		}

		return joined;
	}
}