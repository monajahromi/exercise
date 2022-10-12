package com.mapsa.exercise.AlirezaJamshidi.seriesa.i;

public class FactorChain {
    public static boolean factorChain(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % arr[i - 1] != 0) {
                return false;
            }
        }
        return true;

    }
}