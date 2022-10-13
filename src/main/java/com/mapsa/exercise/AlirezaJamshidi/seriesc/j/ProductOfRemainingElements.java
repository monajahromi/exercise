package com.mapsa.exercise.AlirezaJamshidi.seriesc.j;

public class ProductOfRemainingElements {
    public static boolean canPartition(int[] input) {
        if (input.length > 2) {
            int t = input[0];
            for (int i : input) {
                if (Math.abs(i) > Math.abs(t)) {
                    t = i;
                }
            }
            int p = input[0];
            for (int i = 1; i < input.length - 1; i++) {
                if (input[i] != t) {
                    p *= input[i];
                }
            }
            return p == input[input.length - 1];
        } else {
            return true;
        }
    }
}
