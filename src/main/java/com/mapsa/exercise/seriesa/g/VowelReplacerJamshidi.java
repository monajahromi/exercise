package com.mapsa.exercise.seriesa.g;

public class VowelReplacerJamshidi {

    public static String replaceVowels(String str, char ch) {
        return str.replaceAll("[aeiou]", String.valueOf(ch));
    }
}