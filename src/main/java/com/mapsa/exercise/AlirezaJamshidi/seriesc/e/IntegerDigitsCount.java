package com.mapsa.exercise.AlirezaJamshidi.seriesc.e;

public class IntegerDigitsCount {
    public static int count(long input) {
        input = Math.abs(input);
        if (input / 10 == 0) {
            return 1;
        } else {
            return 1 + count((int) input / 10);
        }
    }
}
