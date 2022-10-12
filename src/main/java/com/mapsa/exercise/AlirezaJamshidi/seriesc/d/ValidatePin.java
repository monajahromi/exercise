package com.mapsa.exercise.AlirezaJamshidi.seriesc.d;

import java.util.regex.Pattern;

public class ValidatePin {
    public static boolean validate(String input) {
        return  !Pattern.compile("\\s+").matcher(input).matches() &&
                Pattern.compile("^\\d{4,6}$").matcher(input).matches();
    }
}
