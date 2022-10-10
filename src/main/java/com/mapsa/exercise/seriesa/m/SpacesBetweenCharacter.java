package com.mapsa.exercise.seriesa.m;

public class SpacesBetweenCharacter {
	public static String spaceMeOut(String str) {
		String[] splited = str.split("(?!^)");
		String joined = "";
		for (int i = 0; i < splited.length; i++) {
			joined += splited[i];
			if (i < splited.length - 1)
				joined += " ";
		}
		return joined;
	}
}