package com.mapsa.exercise.seriesa.c.d.raminRezaei;

public class HowManyDecimalPlacesRaminRezaei {

	public static int getDecimalPlaces(String str) {
		if(str.indexOf('.')==-1){
			return 0;
		}
		return str.length()-(str.indexOf('.')+1);

	}
}