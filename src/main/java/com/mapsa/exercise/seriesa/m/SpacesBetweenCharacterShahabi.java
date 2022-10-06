package com.mapsa.exercise.seriesa.m;

public class SpacesBetweenCharacterShahabi {
    public static String spaceMeOut(String str) {
        String[] splitedArray = str.split("(?!^)");
        String strMatch = "";
        for (int i = 0; i < splitedArray.length; i++) {
            strMatch += splitedArray[i];
            if (i < splitedArray.length - 1)
                strMatch += " ";
        }
        return strMatch;
    }
}
