package com.mapsa.exercise.seriesb.b;

public class NameShuffleSh {
    public static String nameShuffle(String s) {
        int indexOfSpace = s.indexOf(" ") ;
        String firstName = s.substring(0 , indexOfSpace) ;
        String lastName = s.substring(indexOfSpace+1 , s.length()) ;
        return String.format("%s %s" , lastName , firstName ) ;

    }
}
