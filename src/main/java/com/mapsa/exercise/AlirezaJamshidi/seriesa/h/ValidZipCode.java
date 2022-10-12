package com.mapsa.exercise.AlirezaJamshidi.seriesa.h;

public class ValidZipCode {
    public static boolean isValid(String zip) {
        return zip.length() == 5 && Character.isDigit(zip.charAt(0)) && Character.isDigit(zip.charAt(1)) && Character.isDigit(zip.charAt(2)) && Character.isDigit(zip.charAt(3)) && Character.isDigit(zip.charAt(4));
    }
}