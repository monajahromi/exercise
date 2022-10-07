package com.mapsa.exercise.seriesa.m;

public class SpacesBetweenCharacterNorouzi {
	public static String spaceMeOut(String str) {
		char [] letters=str.toCharArray();
		String answer="";
		answer=answer+letters[0]+" ";
		for(int a=1; a<letters.length-1; a++) {
			answer=answer+letters[a]+" ";
		}
		answer=answer+letters[letters.length-1];
		return answer;
	}

	}
