package com.mapsa.exercise.seriesa.g;

public class VowelReplacerShahabi {
	public static String replaceVowels(String str, char ch) {
		/*String inputString2 = null;
		for (int i = 0; i < str.length(); i++) {
			if (ch == 'a' || ch == 'o'
					|| ch == 'e' || ch == 'i' || ch == 'u') {
				inputString2 = str.replace(ch, '?');
			}

		}
		return inputString2;
	}*/

		String[] spilted = str.split("(?!^)");
		for (int i = 0; i < spilted.length; i++) {
			if (spilted[i].equals("a") ||
					spilted[i].equals("e") ||
					spilted[i].equals("i") ||
					spilted[i].equals("o") ||
					spilted[i].equals("u"))
				spilted[i] = String.valueOf(ch);
		}
		String joined = "";
		for (int i = 0; i < spilted.length; i++) {
			joined += spilted[i];
		}
		return joined;
	}
}

