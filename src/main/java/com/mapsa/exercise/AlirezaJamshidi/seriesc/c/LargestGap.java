package com.mapsa.exercise.AlirezaJamshidi.seriesc.c;

import java.util.Arrays;

public class LargestGap {
    public static int largestGap(int[] array) {
        if (array.length == 0) {
            return 0;
        } else if (array.length == 1) {
            return array[0];
        } else if (array.length == 2) {
            return Math.abs(array[1] - array[0]);
        } else {
            Arrays.sort(array);
            int max = array[1] - array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] - array[i - 1] > max) {
                    max = Math.abs(array[i] - array[i - 1]);
                }
            }
            return max;
        }
    }
}
