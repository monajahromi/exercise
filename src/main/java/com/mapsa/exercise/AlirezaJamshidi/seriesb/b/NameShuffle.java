package com.mapsa.exercise.AlirezaJamshidi.seriesb.b;

public class NameShuffle {
    public static String nameShuffle(String s) {
        String[] a = s.split("\\s+");
        // write your code here
        return a[1] + " " + a[0];
    }
}
