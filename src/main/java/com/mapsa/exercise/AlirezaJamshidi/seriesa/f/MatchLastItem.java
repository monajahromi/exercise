package com.mapsa.exercise.AlirezaJamshidi.seriesa.f;

public class MatchLastItem {
    public static boolean matchLastItem(String[] t) {
        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < t.length - 1; i++) {
            if (!t[t.length - 1].contains(t[i])) {
                return false;
            } else {
                builder.append(t[i]);
            }
        }
        return builder.toString().equals(t[t.length - 1]);
    }
}