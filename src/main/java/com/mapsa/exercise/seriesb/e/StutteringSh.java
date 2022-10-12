package com.mapsa.exercise.seriesb.e;

public class StutteringSh {
    public static String stutter(String word) {
        String str = word.substring(0, 1);
        return str+"... "+str+"... "+word+"?";
    }

}


