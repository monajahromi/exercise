package com.mapsa.exercise.seriesa.c.d;

public class HowManyDecimalPlacesHeidary {

	public static int getDecimalPlaces(String num) {

			if(num.indexOf('.')==-1)
				return 0 ;
			return num.length()-1 - num.indexOf('.');
	}
}