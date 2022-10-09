package com.mapsa.exercise.seriesb.b;

public class NameShuffleRaminRezaei {

	public static String nameShuffle(String s) {
		int indexOfSpace = s.indexOf(" ") ;
		String name = s.substring(0 , indexOfSpace) ;
		String lastName = s.substring(indexOfSpace+1 , s.length()) ;
		return String.format("%s %s" , lastName , name ) ;

	}

}
