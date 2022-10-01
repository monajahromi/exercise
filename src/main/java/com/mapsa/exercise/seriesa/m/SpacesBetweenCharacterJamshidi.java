package com.mapsa.exercise.seriesa.m;

public class SpacesBetweenCharacterJamshidi {
    public static String spaceMeOut(String str) {
        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < str.length() - 1; i++) {
            builder.append(str.charAt(i)).append(" ");
        }
        return builder.append(str.charAt(str.length() - 1)).toString();
    }
}