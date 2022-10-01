package com.mapsa.exercise.seriesa.d;

public class HowManyDecimalPlacesJamshidi {
    public static int getDecimalPlaces(String num) {
        long res = 0;
        if (num.contains(".")) {
            res = num.substring(num.indexOf('.') + 1).length();
        }
        return (int) res;
    }
}