package com.mapsa.exercise.AlirezaJamshidi.seriesc.i;

import java.util.Arrays;

public class ArraySum {
    public static int sum(int[] input) {
        if (input.length == 0) {
            return 0;
        } else {
            return input[input.length - 1] + sum(Arrays.copyOf(input,input.length - 1));
        }
    }
}
