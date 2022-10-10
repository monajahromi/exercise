package com.mapsa.exercise.seriesa.d;

public class HowManyDecimalPlaces {

	public static int getDecimalPlaces(String num) {

			if(num.indexOf('.')==-1)
				return 0 ;
			return num.length()-1 - num.indexOf('.');
	}
}