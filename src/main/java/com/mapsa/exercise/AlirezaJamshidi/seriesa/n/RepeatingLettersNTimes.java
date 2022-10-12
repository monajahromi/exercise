package com.mapsa.exercise.AlirezaJamshidi.seriesa.n;

public class RepeatingLettersNTimes {
    public static String repeat(String str, int n) {
        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < n; j++) {
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }
}