package com.mapsa.exercise.seriesc.shahabi;

import java.util.regex.Pattern;

public class ValidatePinSh {
    public static boolean isDigit(String pinNumber) {
        return !pinNumber.contains("\\s") && Pattern.compile("\\d{4,6}$").matcher(pinNumber).matches();
    }
}
