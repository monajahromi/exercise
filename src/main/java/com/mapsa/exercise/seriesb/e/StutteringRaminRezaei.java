package com.mapsa.exercise.seriesb.e;

public class StutteringRaminRezaei {

	public static String stutter(String word) {
		
		// write your code here
		String firstTwoCharachters = word.substring(0 , 2);
		String result = String.format("%s... %s... %s?",firstTwoCharachters , firstTwoCharachters , word );
		return result ;
	}

}
