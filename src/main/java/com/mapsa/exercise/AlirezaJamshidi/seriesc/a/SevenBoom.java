package com.mapsa.exercise.AlirezaJamshidi.seriesc.a;

public class SevenBoom {
    public static String sevenBoom(int[] arr){
        for (int e : arr) {
            if (String.valueOf(e).contains("7")) {
                return "Boom!";
            }
        }
        return "There Is NO 7 In Array!";
    }
}
