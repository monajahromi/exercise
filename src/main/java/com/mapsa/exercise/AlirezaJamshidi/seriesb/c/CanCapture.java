package com.mapsa.exercise.AlirezaJamshidi.seriesb.c;

public class CanCapture {
    public static Boolean canCapture(String[] rooks) {
        // write your code here
        return Character.compare(rooks[0].charAt(0), rooks[1].charAt(0)) == 0 || Character.compare(rooks[0].charAt(1), rooks[1].charAt(1)) == 0;
    }
}
