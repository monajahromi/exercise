package com.mapsa.exercise.AlirezaJamshidi.seriesc.l;

public class PositivesAndNegatives {
    public static boolean alternateSign(int[] input) {
        if (input.length < 2) {
            return true;
        } else if (input[0] > 0) {
            for (int i = 0; i < input.length; i++) {
                if ((i % 2 == 0 && !(Math.abs(input[i]) == input[i])) ||
                        (i % 2 == 1 && (Math.abs(input[i]) == input[i]))) {
                    return false;
                }
            }
            return true;
        } else {
            for (int i = 0; i < input.length; i++) {
                if ((i % 2 == 1 && !(Math.abs(input[i]) == input[i])) ||
                        (i % 2 == 0 && (Math.abs(input[i]) == input[i]))) {
                    return false;
                }
            }
            return true;
        }
    }
}
