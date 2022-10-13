package com.mapsa.exercise.AlirezaJamshidi.seriesc.f;

import java.util.Arrays;
import java.util.Objects;

public class ConsecutiveNumbers {
    public static boolean cons(int[] input) {
        if (input.length == 0) {
            return true;
        } else if (input.length == 1 && input[0] == 1) {
            return true;
        } else if (input.length == 1) {
            return false;
        } else {
            Arrays.sort(input);
            for (int i = 1; i < input.length; i++) {
                if (!Objects.equals(input[i] - input[i-1], 1)) {
                    return false;
                }
            }
            return true;
        }
    }
}
