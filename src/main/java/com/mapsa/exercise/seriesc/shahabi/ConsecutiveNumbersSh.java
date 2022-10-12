package com.mapsa.exercise.seriesc.shahabi;

import java.util.Arrays;

public class ConsecutiveNumbersSh {
    public static boolean checkConsecutive(int[] consArrays) {
        Arrays.sort(consArrays);
        for (int i = 0; i < consArrays.length - 1; i++) {
            int cons = consArrays[i + 1] - consArrays[i];
            if (cons != 1 ) {
                return false;
            }
        }
        return true;
    }
}
