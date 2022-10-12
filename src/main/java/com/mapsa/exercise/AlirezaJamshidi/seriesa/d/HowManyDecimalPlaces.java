package com.mapsa.exercise.AlirezaJamshidi.seriesa.d;

public class HowManyDecimalPlaces {
    public static int getDecimalPlaces(String num) {
        long res = 0;
        if (num.contains(".")) {
            res = num.substring(num.indexOf('.') + 1).length();
        }
        return (int) res;
    }
}